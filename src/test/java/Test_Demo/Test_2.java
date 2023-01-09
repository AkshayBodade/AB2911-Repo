package Test_Demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_2 {
	
	@BeforeSuite
	public void BS() {
		System.out.println("Before Suite");
	}
	
	@BeforeClass
	public void BC () {
		System.out.println("Before Class");
		
	}
	
	@BeforeTest
	public void BT() {
		System.out.println("Before Test");
	}
	
	@BeforeMethod
	public void BM() {
		System.out.println("Before Method- Browser opening");
	}

	@Test
	public void test1() {
		System.out.println("Test 1");
		
	}
	
	@Test
	public void test2() {
		System.out.println("test 2");
	}
	
	@Test
	public void test3() {
		System.out.println("test 3");
	}
	
	@AfterMethod
	public void AM() {
		System.out.println("After Method- Browser close");
	}
	
	@AfterTest
	public void AT() {
		System.out.println("After test");
	}
	
	@AfterClass
	public void AC() {
		System.out.println("After Class");
	}
	
	@AfterSuite
	public void AS() {
		System.out.println("After Suite");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
