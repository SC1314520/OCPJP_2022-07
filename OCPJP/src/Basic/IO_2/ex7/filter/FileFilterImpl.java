package Basic.IO_2.ex7.filter;

import java.io.File;
import java.io.FileFilter;

public class FileFilterImpl implements FileFilter{

	@Override
	public boolean accept(File pathname) {
		
		if(pathname.isDirectory()) {
			return true;
		}
		else
		return pathname.getName().toLowerCase().endsWith(".txt");
	}
	
}
