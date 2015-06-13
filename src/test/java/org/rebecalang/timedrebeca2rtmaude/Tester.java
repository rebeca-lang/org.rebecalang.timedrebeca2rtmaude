package org.rebecalang.timedrebeca2rtmaude;

import java.io.File;

import junit.framework.TestCase;

public class Tester extends TestCase {
	public static final String loc = "src/test/resources/org/rebecalang/timedrebeca2rtmaude";
	
	public void testFiles() {
		File files = new File(loc);
		for (String name : files.list()) {
			if (new File(files.getAbsolutePath() + File.separator + name).isHidden())
				continue;
			String[] args = new String[]{
					"-s", loc + File.separator + name,
					"-o", name.substring(0, name.indexOf('.')),
					"-p", "InterpretResult"};
			TimedRebeca2RTMaude.main(args);
		}
	}
}
