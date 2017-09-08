package myArrayList.driver;

public class Driver {

	/**
	 * Main method
	 */
	public static void main(String[] args) {
		System.out.println("Hello. This is running.");
		
		if(args.length != 2) { // not correct arguments, print error then exit
			System.err.println("Must have two arguments. Exiting.");
			return;
		}


	}
}
