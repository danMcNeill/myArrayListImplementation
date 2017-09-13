package myArrayList.driver;

public class MyArrayListTest {


	public void testMe(MyArrayList myArrayList, Results results) {


		//test1
		insertTenNums(myArrayList, results);

		//test2
		insertHundredNums(myArrayList, results);

		//test3
		insertTenRemoveFive(myArrayList, results);

		//test4
		insertHundredRemoveFifty(myArrayList, results);

		//test5





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

	public void insertTenRemoveFive(MyArrayList list, Results results) {
		StringBuilder sb = new StringBuilder();
		boolean worked = false;

		list.clear();

		int initSize = list.size();

		for(int i=0; i<10; i++)
			list.insertSorted(i);
		for(int x=0; x<5; x++)
			list.removeValue(x);


		if(list.size() == (initSize + 5))
			worked = true;

		if(worked)
			sb.append("test insertTenRemoveFive passed");
		else
			sb.append("test insertTenRemoveFive failed. Remove did not act as intended");
		results.storeNewResult(sb.toString());
	}

	public void insertHundredRemoveFifty(MyArrayList list, Results results) {
		StringBuilder sb = new StringBuilder();
		boolean worked = false;

		list.clear();
		int initSize = list.size();

		for(int i=0; i<100; i++) 
			list.insertSorted(i);
		for(int x=0; x<50; x++)
			list.removeValue(x);

		if(list.size() == (initSize + 50))
			worked = true;
		
		if(worked)
			sb.append("test insertHundredRemoveFifty passed");
		else
			sb.append("test insertHundredRemoveFifty failed. The values were not removed as expected.");
		results.storeNewResult(sb.toString());
	}



}
