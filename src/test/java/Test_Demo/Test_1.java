package Test_Demo;

import org.testng.annotations.Test;

import Demo.library;

public class Test_1 {

	 
		// TODO Auto-generated method stub
		
		@Test public void test1() throws Exception {
			String data1=library.getStringData_Excel("Sheet1", 0, 0);
			System.out.println(data1);
		}
		@Test public void test2() throws Exception {
			String data1=library.getStringData_Excel("Sheet1", 0, 1);
			System.out.println(data1);
		}
		@Test public void test3() throws Exception {
			String data1=library.getStringData_Excel("Sheet1", 0, 2);
			System.out.println(data1);
		
	}

}
