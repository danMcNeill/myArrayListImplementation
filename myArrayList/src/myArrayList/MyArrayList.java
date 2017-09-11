package myArrayList.driver;

import java.util.Arrays;

public class MyArrayList {
	
	private int[] intArray;
	private int arraySize;

	/**
	 * Constructor
	 */
	public MyArrayList() {
		intArray = new int[50];
		arraySize = 0;
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
			if(value == intArray[i])
				index = i;
		}
		return index;
	}

	/**
	 * Inserts parameter newValue in to int array, then sorts
	 * @return nothing
	 */
	public void insertSorted(int newValue) {
		int x = 0;
		System.out.println("Inserting " + newValue);
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
				setArraySize(size() +1);
				intArray[arraySize-1] = newValue;
				
			}
			else {
				intArray[x] = newValue;
				setArraySize(size() + 1);
			}
				
		}
		else {
			setArraySize(size() + 1);
			intArray[arraySize-1] = newValue;
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


