package myArrayList.driver;

public class MyArrayListTest {


	public void testMe(MyArrayList myArrayList, Results results) {


		MyArrayList list1 = new MyArrayList();
		MyArrayList list2 = new MyArrayList();
		MyArrayList list3 = new MyArrayList();
		MyArrayList list4 = new MyArrayList();
		MyArrayList list5 = new MyArrayList();
		MyArrayList list6 = new MyArrayList();
		MyArrayList list7 = new MyArrayList();
		MyArrayList list8 = new MyArrayList();
		MyArrayList list9 = new MyArrayList();
		MyArrayList list10 = new MyArrayList();


		//test1
		insertTenNums(list1, results);

		//test2
		insertHundredNums(list2, results);

		//test3
		insertTenRemoveFive(list3, results);

		//test4
		insertHundredRemoveFifty(list4, results);

		//test5
		sumToFiftyFive(list5, results);

		//test 6
		insertThousandRemoveHalf(list6, results);

		//test 7
		insertAndSumTenThousandNums(list7, results);

		//test 8
		insertFiftyThousandRemove25Thousand(list8, results);

		//test 9
		insertFiftyCheckSize(list9, results);

		//test 10
		insertFiftyRemove25Sum(list10, results);

	}

	public void insertTenNums(MyArrayList list, Results results) {
		StringBuilder sb = new StringBuilder();
		boolean worked = false;
		int initSize = list.size();
		
		for(int i=1; i<=10; i++) 
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

		int initSize = list.size();

		for(int i=1; i<11; i++)
			list.insertSorted(i);
		for(int x=1; x<6; x++)
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

		int initSize = list.size();

		for(int i=1; i<=100; i++) 
			list.insertSorted(i);
		for(int x=1; x<=50; x++)
			list.removeValue(x);

		if(list.size() == (initSize + 50))
			worked = true;
		
		if(worked)
			sb.append("test insertHundredRemoveFifty passed");
		else
			sb.append("test insertHundredRemoveFifty failed. The values were not removed as expected.");
		results.storeNewResult(sb.toString());
	}

	public void sumToFiftyFive(MyArrayList list, Results results) {
		StringBuilder sb = new StringBuilder();
		boolean worked = false;
		list.clear();

		for(int i=1; i<11; i++) 
			list.insertSorted(i);
		if(list.sum() == 55)
			worked = true;

		if(worked)
			sb.append("test sumToFiftyFive passed");
		else
			sb.append("test sumToFiftyFive failed. The sum function did not work as expected.");
		results.storeNewResult(sb.toString());

	}

	public void insertThousandRemoveHalf(MyArrayList list, Results results) {
		StringBuilder sb = new StringBuilder();
		boolean worked = false;

		for(int i=1; i<=1000; i++)
			list.insertSorted(i);

		for(int x=1; x<=500; x++) {
			list.removeValue(x);
		}


		if(list.size() == 500)
			worked = true;
		if(worked)
			sb.append("test insertThousandRemoveHalf passed");
		else
			sb.append("test insertThousandRemoveHalf failed. The insert and/or remove function did not act as intended.");
		results.storeNewResult(sb.toString());

	}

	public void insertAndSumTenThousandNums(MyArrayList list, Results results) {
		StringBuilder sb = new StringBuilder();
		boolean worked = false;
		int tempSum = 0;	

		for(int i=1; i<=10000; i++) {
			tempSum += i;
			list.insertSorted(i);
		}

		int sum = list.sum();

		if(sum == tempSum)
			worked = true;
		if(worked)
			sb.append("test insertAndSumTenThousandNums passed.");
		else
			sb.append("test insertAndSumTenThousandNums failed. Insert or sum did not work as expected.");

		results.storeNewResult(sb.toString());
	}

	public void insertFiftyThousandRemove25Thousand(MyArrayList list, Results results) {
		StringBuilder sb = new StringBuilder();
		boolean worked = false;
		int tempSum = 0;

		for(int i=1; i<=50000; i++)
			list.insertSorted(i);

		for(int x=1; x<=25000; x++)
			list.removeValue(x);

		if(list.size() == 25000)
			worked = true;

		if(worked)
			sb.append("test insertHundredThousandRemoveFiftyThousand passed.");
		else
			sb.append("test insertHundredThousandRemoveFiftyThousand failed.");
		results.storeNewResult(sb.toString());
	}

	public void insertFiftyCheckSize(MyArrayList list, Results results) {
		StringBuilder sb = new StringBuilder();
		boolean worked = false;
		
		for(int i=1; i<=50; i++)
			list.insertSorted(i);
		if(list.size() > 50)
			worked = false;
		else
			worked = true;
		if(worked)
			sb.append("insertFiftyCheckSize passed.");
		else
			sb.append("insertFiftyCheckSize failed. The array resized when it shouldn't have.");
		results.storeNewResult(sb.toString());
	}

	public void insertFiftyRemove25Sum(MyArrayList list, Results results) {
		StringBuilder sb = new StringBuilder();
		boolean worked = false;
		int tempSum = 0;
		for(int i=1; i<=50; i++) {
			list.insertSorted(i);
			if(i>25)
				tempSum += i;
		}

		for(int x=1; x<=25; x++)
			list.removeValue(x);

		if(list.sum() == tempSum)
			worked = true;
		if(worked)
			sb.append("test insertFiftyRemove25Sum passed.");
		else
			sb.append("test insertFiftyRemove25Sum failed.");
		results.storeNewResult(sb.toString());
	}


}
