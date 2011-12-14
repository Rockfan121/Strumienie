package pl.krakow.vlo.simplechecker;

import java.io.File;
import java.io.IOException;
import java.nio.file.attribute.AclEntry.Builder;

/**
 * 
 * @author rockzzz
 *
 */
public class Tester {
	private File root;
	private File binary;
	private Compiler compiler;
	private TestLoader loader;
	private ResultSaver saver;
	
	public Tester (File root)
	{
	this.root=root;		
	}
	
	private Process getProcess()
	{
		ProcessBuilder builder = new ProcessBuilder (binary getAbsolutePath());
		return Builder.start();
	}
	
	private void writeTest (Process task, File testCase) throws IOException 
	
	public void testFile (File testCase)
	{
	Process task = 	
	}
	
	
}
