package org.rebecalang.timedrebeca2rtmaude.counterexampleinterpreter;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.rebecalang.timedrebeca2rtmaude.counterexampleinterpreter.compiler.RTMaudeResultLexer;
import org.rebecalang.timedrebeca2rtmaude.counterexampleinterpreter.compiler.RTMaudeResultParser;

public class Test {
	public static void main(String[] args) throws Exception {

		String str="";
		try{
			/*			
			FileReader inputFile = new FileReader("z1.txt");
			BufferedReader bufferReader = new BufferedReader(inputFile);


			String line="";

			while ((line = bufferReader.readLine()) != null)   {
				//line.replaceAll("\"", "\\\""); 
				str=str.concat(line);
			}
			bufferReader.close();

			 */
			System.out.println(str);
			//str = "{{< \"ctrl\" : Rebec | classId : Controller,queue : constructor     with emptyValuation from \"GOD\" deadline 1000000,stateVars :((     Controller-sciAck |-> false)(Controller-sciDead |-> false)(     Controller-sciRescued |-> false)(Controller-ctrlCheckDelay |-> 0)(     Controller-netDelay |-> 0)(Controller-rescueDL |-> 0)(Controller-sciDL |->     0)(Controller-sensorVal0 |-> 0)(Controller-sensorVal1 |-> 0)(     Controller-rescue |-> \"rescue\")(Controller-scientist |-> \"scientist\")(     Controller-sensor0 |-> \"sensor0\")(Controller-sensor1 |-> \"sensor1\")self |->     \"ctrl\"),toExecute : noStatements > < \"idgen\" : IdGen | nextId : 0 > <     \"rescue\" : Rebec | classId : Rescue,queue : constructor with emptyValuation     from \"GOD\" deadline 1000000,stateVars :((Rescue-exDelay |-> 0)(     Rescue-netDelay |-> 0)(Rescue-reachDelay |-> 0)(Rescue-rescueDL |-> 0)(     Rescue-ctrl |-> \"ctrl\")self |-> \"rescue\"),toExecute : noStatements > <     \"scientist\" : Rebec | classId : Scientist,queue : constructor with     emptyValuation from \"GOD\" deadline 1000000,stateVars :((Scientist-netDelay     |-> 0)(Scientist-ctrl |-> \"ctrl\")self |-> \"scientist\"),toExecute :     noStatements > < \"sensor0\" : Rebec | classId : Sensor,queue : constructor     with Sensor-myPeriod |-> 10 from \"GOD\" deadline 1000000,stateVars :((     Sensor-gasLevel |-> 0)(Sensor-netDelay |-> 0)(Sensor-period |-> 0)(     Sensor-ctrl |-> \"ctrl\")self |-> \"sensor0\"),toExecute : noStatements > <     \"sensor1\" : Rebec | classId : Sensor,queue : constructor with     Sensor-myPeriod |-> 10 from \"GOD\" deadline 1000000,stateVars :((     Sensor-gasLevel |-> 0)(Sensor-netDelay |-> 0)(Sensor-period |-> 0)(     Sensor-ctrl |-> \"ctrl\")self |-> \"sensor1\"),toExecute : noStatements >} ,     'takeMessage}";

			//ANTLRInputStream input = new ANTLRInputStream(new StringInputStream(str));

			ANTLRInputStream input = new ANTLRInputStream(new FileInputStream("z1.txt"));
			RTMaudeResultLexer lexer = new RTMaudeResultLexer(input);
			CommonTokenStream stream = new CommonTokenStream(lexer);
			RTMaudeResultParser parser = new RTMaudeResultParser(stream);
			String res = parser.reactiveClassDeclaration().res;
			//System.out.println(res);


			FileWriter outputFile = new FileWriter("out.xml");
			BufferedWriter bufferWriter = new BufferedWriter(outputFile);

			bufferWriter.write(res);
			bufferWriter.close();

		}catch(Exception e){
			System.out.println("Error while reading file:" + e.getMessage());                      
		}
	}
}
