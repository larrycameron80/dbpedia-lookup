package org.dbpedia.lookup;

import java.io.File;
import java.io.FileFilter;

public class RDFFileFilter implements FileFilter {

	@Override
	public boolean accept(File pathname) {
		
		String fileName = pathname.getName();
		
		boolean accept = false;
		
		accept |= fileName.contains(".ttl");
		accept |= fileName.contains(".turtle");
		accept |= fileName.contains(".n3");
		accept |= fileName.contains(".nt");

		
		return accept;
	}

}
