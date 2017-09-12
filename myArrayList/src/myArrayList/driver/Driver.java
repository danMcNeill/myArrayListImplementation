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
			System.exit(0);
		}

		String s;
		MyArrayList list = new MyArrayList(args[0]);

		Results results = new Results();
		MyArrayListTest test = new MyArrayListTest();

		System.out.println(list.toString());

		test.testMe(list, results);

		for(int i=0; i<results.getStrings().size(); i++) {
			System.out.println(results.getStrings().get(i));
		}

		System.out.println(list.toString());

	}
}
