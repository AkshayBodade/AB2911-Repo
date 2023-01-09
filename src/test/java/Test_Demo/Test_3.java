package Test_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_3 {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
	}
	
	@Test (priority=2)
	public void testx() {
		System.out.println("X");
	
	//	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("xyz");
	//	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345678");
		
	}
	
	@Test(priority=-1, enabled=false)
	public void testb() {
		System.out.println("B");
		
	//	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("xyz");
	//	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345678");
		
	}
	
	@Test(priority=0)
	public void testz() {
		System.out.println("Z");
		
	//	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("xyz");
	//	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345678");
	}
	
	@Test(priority=1)
	public void testy() {
		System.out.println("Y");
		
	//	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("xyz");
	//	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345678");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
