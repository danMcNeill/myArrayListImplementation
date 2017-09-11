package myArrayList.driver;

import java.io.File;
import java.lang.NumberFormatException;

public class Driver {

	/**
	 * Main method
	 */
	public static void main(String[] args) {

		if(args.length != 2) { // not correct arguments, print error then exit
			System.err.println("Must have two arguments. Exiting.");
			return;
		}

		String s;
		MyArrayList list = new MyArrayList();

		//input
		
		File input = new File(args[0]);
		if(!input.isFile()) { // file does not exist
			System.err.println("Input file specified does not exist. Exiting.");
			return;
		}

		int tempInt = 0;
		FileProcessor fp = new FileProcessor(input);
		while((s = fp.readLine()) != null) {
			try {
				tempInt = Integer.parseInt(s);
			}
			catch(NumberFormatException n) {
				System.err.println(s + " is not a number, so it was skipped");
				continue;
			}
			list.insertSorted(tempInt);
		}


		Results results = new Results();
		MyArrayListTest test = new MyArrayListTest();

		test.testMe(list, results);

		System.out.println(results.getStrings().get(0));

		System.out.println(list.toString());

	}
}
