package myArrayList.driver;

import java.util.Arrays;

public class MyArrayList {
	
	private int[] intArray;
	private int arraySize;
	private String inputFileName;

	/**
	 * Constructor
	 */
	public MyArrayList() {
		intArray = new int[50];
		arraySize = 0;
	}

	public MyArrayList(String s) {
		intArray = new int[50];
		arraySize = 0;
		inputFileName = s;

		File input = new File(inputFileName);
		if(!input.isFile()) { // file does not exist
			System.err.println("Input file specified does not exist. Exiting.");
			System.exit(0);
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
			if((tempInt >= 0) && (tempInt <= 10000))
				list.insertSorted(tempInt);
		}
	}

	/**
	 * @return nothing
	 */
	public void insertInputs() {
		File input = new File(inputFileName);
		if(!input.isFile()) { // file does not exist
			System.err.println("Input file specified does not exist. Exiting.");
			System.exit(0);
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
			if((tempInt >= 0) && (tempInt <= 10000))
				list.insertSorted(tempInt);
		}
	}

	/**
	 * @return String, input file name
	 */
	public String getInputFileName() {
		return inputFileName;
	}

	/**
	 * @return nothing
	 */
	public void setInputFileName(String s) {
		inputFileName = s;
	}
	
	/**
	 * Prints string representation of int array
	 * @return String made up of contents of int array
	 */
	public String toString() {
		StringBuilder returnVal = new StringBuilder();
		for(int i=intArray.length-arraySize; i<size()+intArray.length-arraySize; i++) {
			returnVal.append(intArray[i]);
			returnVal.append(" ");
		}
		return returnVal.toString();
	}

	/**
	 * Gets # of elements in int array
	 * @return int, # of items in int array
	 */
	public int size() {
		return arraySize;
	}

	/**
	 * Sets new size (count of elements) in int array
	 * @return nothing
	 */
	public void setArraySize(int newSize) {
		arraySize = newSize;
	}

	/**
	 * Sums contents of int array
	 * @return int, sum of contents of int array
	 */
	public int sum() {
		int sum = 0;
		for(int i=intArray.length-arraySize; i<size()+intArray.length-arraySize; i++) {
			sum += intArray[i];
		}
		return sum;
	}

	/**
	 * Finds index of first occurrence in int array of param value
	 * @return int, index of first occurrence of parameter value
	 */
	public int indexOf(int value) {
		int index = -1;
		for(int i=intArray.length-arraySize; i<size()+intArray.length-arraySize; i++) {
			if(value == intArray[i]) {
				index = i;
				break;
			}
		}
		return index;
	}

	/**
	 * Inserts parameter newValue in to int array, then sorts
	 * @return nothing
	 */
	public void insertSorted(int newValue) {
		int x = 0;
		if(size() == intArray.length) {
			while((x < intArray.length) && (intArray[x] != -1)) {
				x++;
			}
			if(x == intArray.length) {

				int newSize = size() + (size() / 2);
				int[] temp = Arrays.copyOf(intArray, intArray.length);
				intArray = new int[newSize];
				for(int i=0; i<size(); i++) {
					intArray[i] = temp[i];
				}
				setArraySize(size() + 1);
				intArray[0] = newValue;
				
			}
			else {
				intArray[x] = newValue;
				setArraySize(size() + 1);
			}
				
		}
		else {
			setArraySize(size() + 1);
			intArray[0] = newValue;
		}

		Arrays.sort(intArray);
	}

	/**
	 * Removes parameter value from int array, resorts 
	 * @return nothing
	 */
	public void removeValue(int value) {
		int occurrence = 0;
		while(true) {
			occurrence = indexOf(value);
			if(occurrence == -1) {
				break;
			}
			intArray[occurrence] = -1;
			setArraySize(size() - 1);
		}
		Arrays.sort(intArray);
	}

	
}


