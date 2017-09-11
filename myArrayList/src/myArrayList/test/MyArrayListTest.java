package myArrayList.driver;

public class MyArrayListTest {


	public void testMe(MyArrayList myArrayList, Results results) {
		
		//test 1
		resizeOnce(myArrayList, results);
		//test 2
		resizeTwice(myArrayList, results);
		//test 3





	}

	public void resizeOnce(MyArrayList list, Results results) {
		StringBuilder sb = new StringBuilder();
		boolean worked = false;

		int initSize = list.size();
		for(int i=0; i<50; i++) {
			list.insertSorted(i);
		}
		if(list.size() == (initSize + 50)) {
			worked = true;
		}

		if(worked) {
			sb.append("test resizeOnce passed");
		}
		else {
			sb.append("test resizeOnce failed. Array did not resize correctly.");
		}

		results.storeNewResult(sb.toString());


	}

	public void resizeTwice(MyArrayList list, Results results) {
		StringBuilder sb = new StringBuilder();
		boolean worked = false;

		int initSize = list.size();
		for(int i=0; i<50; i++) {
			list.insertSorted(i);
		}

		for(int x=0; x<30; x++) {
			list.insertSorted(x);
		}

		if(list.size() == (initSize + 50 + 30)) {
			worked = true;
		}

		if(worked) {
			sb.append("test resizeTwice passed");
		}
		else {
			sb.append("test resizeTwice failed. Array did not resize correctly.");
		}

		results.storeNewResult(sb.toString());


	}



}
