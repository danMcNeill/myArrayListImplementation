public class MyArrayList {
	
	private int[] intArray;
	private int arraySize;

	/**
	 * Constructor
	 */
	public MyArrayList() {
		this.intArray = new int[50];
		this.arraySize = 0;
	}
	
	/**
	 * Prints string representation of int array
	 * @return String made up of contents of int array
	 */
	public String toString() {
		StringBuilder returnVal = new StringBuilder();
		for(int i=0; i<this.size(); i++) {
			returnVal.append(this.intArray[i]);
			returnVal.append(" ");
		}
		return returnVal.toString();
	}

	/**
	 * Gets # of elements in int array
	 * @return int, # of items in int array
	 */
	public int size() {
		return this.arraySize;
	}

	/**
	 * Sets new size (count of elements) in int array
	 * @return nothing
	 */
	public void setArraySize(int newSize) {
		this.arraySize = newSize;
	}

	/**
	 * Sums contents of int array
	 * @return int, sum of contents of int array
	 */
	public int sum() {
		int sum = 0;
		for(int i=0; i<this.size(); i++) {
			sum += this.intArray[i];
		}
		return sum;
	}

	/**
	 * Finds index of first occurrence in int array of param value
	 * @return int, index of first occurrence of parameter value
	 */
	public int indexOf(int value) {
		int index = -1;
		for(int i=0; i<this.size(); i++) {
			if(value == this.intArray[i])
				index = i;
		return index;
	}

	/**
	 * Inserts parameter newValue in to int array, then sorts
	 * @return nothing
	 */
	public void insertSorted(int newValue) {
		if(this.size() == this.intArray.length) {
			int newSize = this.size() + (this.size() / 2);
			int[] temp = Arrays.copyOf(this.intArray, this.intArray.length);
			this.intArray = new int[newSize];
			for(int i=0; i<this.size(); i++) {
				this.intArray[i] = temp[i];
			}
		}
		this.setArraySize(this.size() + 1);
		this.intArray[this.arraySize-1] = newValue;
		Arrays.sort(this.intArray);
	}

	/**
	 * Removes parameter value from int array, resorts 
	 * @return nothing
	 */
	public void removeValue(int value) {
		int occurrence = 0;
		while(true) {
			occurrence = indexOf(value);
			if(occurrence == -1)
				break;
			this.intArray[occurrence] = null;
		}
		Arrays.sort(this.intArray);
	}

	
}


