package myArrayList.driver;

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


		if(args[0].equals("${arg0}") || args[1].equals("${arg1}")) {
			System.err.println("Must specify both input and output file");
			System.exit(0);
		}


		MyArrayList list = new MyArrayList(args[0]);

		Results results = new Results();

		MyArrayListTest test = new MyArrayListTest();


		results.storeNewResult("The sum of all the values in the array list is: " + Integer.toString(list.sum()));

		test.testMe(list, results);

		results.writeToFile(args[1]);

	}
}
