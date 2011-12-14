package pl.krakow.vlo.simplechecker;
//metoda szablonowa, wzorce projektowe....
	//dzieki temu Compiler ³atwo rozszerzalny
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author rockzzz
 *
 */
public class Compiler {
	private static final Logger log = Logger.getLogger(Compiler.class.getName());
		
	
	
	public File compiler (File what)
	{
		File output = new File (what.getParentFile(), "out");  
	
	
	try
		{
		Runtime.getRuntime().exec("gcc " + what.getAbsolutePath() + " -o " //mozna zrobi przeladowanie
									+ output.getAbsolutePath());
		}
	catch (IOException e)
		{
		log.log(Level.SEVERE, "Wyj¹tek", e);	
		}
	throw new RuntimeException();	
	}
	
	private String getCompilerFlags()
		{
			return " O2 static int";
		}
	
	private String getCompilerCommand()
	{
		return "gcc";		
	}
	
	private String getOutputSwitch()
	{
		return "-o";
	}
	
}
