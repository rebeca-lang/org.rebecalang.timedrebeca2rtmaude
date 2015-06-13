package org.rebecalang.timedrebeca2rtmaude;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.codehaus.plexus.util.StringInputStream;
import org.rebecalang.modeltransformer.Transform;
import org.rebecalang.timedrebeca2rtmaude.counterexampleinterpreter.compiler.RTMaudeResultLexer;
import org.rebecalang.timedrebeca2rtmaude.counterexampleinterpreter.compiler.RTMaudeResultParser;

public class TimedRebeca2RTMaude {
	
	enum OperationType {
		Generate, InterpretResult
	}
	
	public static int extractTime(String input) {
		String[] parts = input.split(" ");
		return Integer.parseInt(parts[5].substring(1, parts[5].length() - 2));
	}
	
	public static String getLine(BufferedReader reader) throws IOException {
		String result = "";
		while ((result = reader.readLine()) != null) {
			if (!result.isEmpty())
				return result;
		}
		return null;
	}
	
	public static void main(String[] args) {
		CommandLineParser cmdLineParser = new GnuParser();
		Options options = new Options();
		try {
			Option option = OptionBuilder
					.withArgName("file")
					.hasArg()
					.withDescription(
							"The location of generated Realtime-Maude file. Default location is \'./rtmaude\' folder.")
					.withLongOpt("output").create('o');
			options.addOption(option);

			option = OptionBuilder
					.withArgName("file")
					.isRequired()
					.hasArg()
					.withDescription("Rebeca model source file.")
					.withLongOpt("source").create('s');
			option.setRequired(true);
			options.addOption(option);

			option = OptionBuilder
					.withArgName("operation")
					.isRequired()
					.hasArg()
					.withDescription(
							"Operation (Generate/InterpretResult).")
					.withLongOpt("operation").create('p');
			options.addOption(option);

			options.addOption(new Option("h", "help", false,
					"Print this message."));

			CommandLine commandLine = cmdLineParser.parse(options, args);

			if (commandLine.hasOption("help"))
				throw new ParseException("");
			// Set Rebeca file reference.

			// Set output location. Default location is rmc-output folder.
			String destination = commandLine.hasOption("output") ? commandLine.getOptionValue("output") : "rtmaude";
			
			OperationType type = OperationType.valueOf(commandLine.getOptionValue("operation"));
			if (type.equals(OperationType.Generate)) {
				String[] parameters = new String[] {
						"--source", commandLine.getOptionValue("source"),
						"-e", "TimedRebeca",
						"-v", "2.2",
						"-o", destination,
						"-t", "RTMaude"
				};
				Transform.main(parameters);
			} else if (type.equals(OperationType.InterpretResult)) {
				String line = "";
				BufferedReader reader = new BufferedReader(new FileReader(commandLine.getOptionValue("source")));

				//Ignore header
				for (int cnt = 0; cnt < 8; cnt++)
					getLine(reader);

				int spentTime = 0;
				String result = null;
				String counterExample = null;
				
				while ((line = getLine(reader)) != null) {
					line = line.trim();
					if (line.startsWith("rewrites:"))
						spentTime += extractTime(line);
					else if (line.startsWith("Introduced timed module:"))
						continue;
					else if (line.startsWith("Error")) {
						result = "Error";
						break;
					}
					else if (line.startsWith("Bye.")) {
						if (result == null)
							result = "satisfied";
						break;
					}
					else if (line.startsWith("Model check initState") || line.startsWith("Untimed model check")) {
						while ((line = getLine(reader)) != null)
							if (line.trim().startsWith("Result"))
								break;
						line = getLine(reader);
						if (line.trim().equals("true"))
							result = "satisfied";
						else {
							result = "counter-example";
							String ce = line.substring(16);
							while ((line = getLine(reader)) != null)
								if (line.trim().startsWith("Bye."))
									break;
								else 
									ce += line;
							ANTLRInputStream input = new ANTLRInputStream(new StringInputStream(ce));
							RTMaudeResultLexer lexer = new RTMaudeResultLexer(input);
							CommonTokenStream stream = new CommonTokenStream(lexer);
							RTMaudeResultParser parser = new RTMaudeResultParser(stream);
							counterExample = parser.reactiveClassDeclaration().res;
						}
					}
				}
				new File(destination).mkdirs();
				RandomAccessFile output = new RandomAccessFile(destination + File.separator + "result.xml", "rw");
				output.setLength(0);
				
				output.writeBytes("<model-checking-report>\n");
				output.writeBytes("<system-info>\n");
				output.writeBytes("\t<total-spent-time>" + (spentTime / 1000) + "</total-spent-time>\n");
				output.writeBytes("</system-info>\n");
				output.writeBytes("<checked-property>\n");
				output.writeBytes("\t<result>" + (result == null ? "Error" : result) + "</result>\n");
				output.writeBytes("</checked-property>\n");
				if (counterExample != null)
					output.writeBytes(counterExample + "\n");
				output.writeBytes("<model-checking-report>");

				output.close();
			}
		} catch (ParseException e) {
			if (!e.getMessage().isEmpty())
				System.out.println("Unexpected exception: " + e.getMessage());
			HelpFormatter formatter = new HelpFormatter();
			formatter.printHelp("TimedRebeca2RTMaude [options]", options);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Unexpected exception: " + e.getMessage());
			HelpFormatter formatter = new HelpFormatter();
			formatter.printHelp("TimedRebeca2RTMaude [options]", options);
		}
	}
}
