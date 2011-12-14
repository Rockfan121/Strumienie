package pl.krakow.vlo.simplechecker;

import java.io.File;
import java.io.FilenameFilter;

/**
 * 
 * @author rockzzz
 *
 */

public class TestLoader {
	private File	root;
	
	/**
	 *  zwraca liste plików do wejœcia (wcale nie, coœ sknoci³am :D)
	 * @param root
	 */

	public TestLoader(File root) {
		//super();
		this.root = root;
	}
	
	/**
	 * 
	 * @return
	 */
	
	public File[] getTest()
	{
		File inDir = new File  (root, "in");
		
		return inDir.listFiles(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return name.endsWith(".in");
			}
		});
		
	
	}
}
