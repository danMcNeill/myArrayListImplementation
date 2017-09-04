public class MyArrayList {
	
	private int[] intArray;
	private int arraySize;

	public MyArrayList() {
		this.intArray = new int[50];
		this.arraySize = 0;
	}
	
	public String toString() {
		for(int i=0; i<this.size(); i++) {
			System.out.println(this.intArray[i] + " ");
		}
	}

	public int size() {
		return this.arraySize;
	}

	public void setArraySize(int newSize) {
		this.arraySize = newSize;
	}

	public int sum() {
		int sum = 0;
		for(int i=0; i<this.size(); i++) {
			sum += this.intArray[i];
		}
		return sum;
	}

	public int indexOf(int value) {
		int index = -1;
		for(int i=0; i<this.size(); i++) {
			if(value == this.intArray[i])
				index = i;
		return index;
	}

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


