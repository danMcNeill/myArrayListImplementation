package myArrayList.driver;



public class Driver {

	/**
	 * Main method
	 */
	public static void main(String[] args) {
		System.out.println("Hello. This is running.");
		
		/*
		if(args.length != 2) { // not correct arguments, print error then exit
			System.err.println("Must have two arguments. Exiting.");
			return;
		}
		*/
		MyArrayList my = new MyArrayList();
		my.insertSorted(5);
		my.insertSorted(9);
		my.insertSorted(1);
		my.insertSorted(0);
		my.insertSorted(0);
		my.insertSorted(11);
		my.insertSorted(10);
		my.insertSorted(6);
		System.out.println(my.toString());

		my.removeValue(2);
		System.out.println(my.toString());

		my.removeValue(9);
		my.removeValue(0);
		System.out.println(my.toString());

		System.out.println(my.sum());


	}
}
