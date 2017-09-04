public class MyArrayList {
	
	private int[] intArray;
	private int arraySize;

	public MyArrayList() {
		this.intArray = new int[50];
		this.arraySize = 50;
	}
	
	public String toString() {

	}

	public int size() {
		return this.arraySize;
	}

	public void setArraySize(int newSize) {
		this.arraySize = newSize;
	}

	public int sum() {
		int sum = 0;
		for(int i=0; i<arraySize; i++) {
			sum += intArray[i];
		}
		return sum;
	}

	public int indexOf(int value) {
		int index = -1;
		for(int i=0; i<arraySize; i++) {
			if(value == intArray[i])
				index = i;
		return index;
	}
}









}
