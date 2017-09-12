package myArrayList.driver;

public class MyArrayListTest {


	public void testMe(MyArrayList myArrayList, Results results) {


		//test1
		insertTenNums(myArrayList, results);

		//test2
		insertHundredNums(myArrayList, results);

		//test3
		insertTenRemoveTen(myArrayList, results);

		//test4
		insertHundredRemoveFifty(myArrayList, results);

		//test5

		
		//test 1
		resizeOnce(myArrayList, results);
		//test 2
		resizeAgain(myArrayList, results);
		//test 3
		removeThrees(myArrayList, results);
		//test 4
		removeAllKeep24(myArrayList, results);




	}

	public void insertTenNums(MyArrayList list, Results results) {
		StringBuilder sb = new StringBuilder();
		boolean worked = false;
		int initSize = list.size();
		
		for(int i=10; i>0; i--) 
			list.insertSorted(i);
		if(list.size() == (initSize + 10))
			worked = true;
		if(worked)
			sb.append("test insertTenNums passed.");
		else
			sb.append("test insertTenNums failed. Ten items were not inserted correctly.");
		results.storeNewResult(sb.toString());
		
	}

	public void insertHundredNums(MyArrayList list, Results results) {
		StringBuilder sb = new StringBuilder();
		boolean worked = false;
		int initSize = list.size();
		
		for(int i=100; i>0; i--) {
			list.insertSorted(i);
		}

		if(list.size() == (initSize + 100))
			worked = true;
		if(worked)
			sb.append("test insertHundredNums passed.");
		else
			sb.append("test insertHundredNums failed. One hundred items were not inserted correctly.");

		results.storeNewResult(sb.toString());

	}

	public void removeThrees(MyArrayList list, Results results) {
		StringBuilder sb = new StringBuilder();
		boolean worked = false;

		int initSize = list.size();

		list.removeValue(3);

		if(list.size() == (initSize - 5))
			worked = true;

		if(worked)
			sb.append("test removeFiftyValues passed");
		else
			sb.append("test removeFiftyValues failed. Remove did not act as intended");
		results.storeNewResult(sb.toString());
	}

	public void removeAllKeep24(MyArrayList list, Results results) {
		StringBuilder sb = new StringBuilder();
		boolean worked = false;

		for(int i=0; i<50; i++) 
			if(i != 24)
				list.removeValue(i);

		if((list.indexOf(24) != -1) && (list.size() == 3))
			worked = true;
		
		if(worked)
			sb.append("test removeAllKeep24 passed");
		else
			sb.append("test removeAllKeep24 failed. The values were not removed as expected.");
		results.storeNewResult(sb.toString());
	}



}
