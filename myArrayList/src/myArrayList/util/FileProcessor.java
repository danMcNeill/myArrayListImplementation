package myArrayList.driver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileProcessor {

	private File file;
	private BufferedReader br;

	public FileProcessor(File f) {
		file = f;
		try {
			br = new BufferedReader(new FileReader(file));
		}
		catch(FileNotFoundException e) {
			System.err.println(e);
		}
	}

	/**
	 * @return String, next line from file
	 */
	public String readLine() {
		String returnVal = null;
		try {
			returnVal = br.readLine();
		}
		catch(IOException e) {
			System.err.println(e);
		}
		return returnVal;
		
	}

	public void closeFile() {
		try {
			br.close();
		}
		catch(IOException e) {
			System.err.println(e);
		}
	}





}
