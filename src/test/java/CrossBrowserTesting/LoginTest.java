package CrossBrowserTesting;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {
	
	//BM-TEST-AF
	
	@Test
	public void verifylogin() {
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test@gmail");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("12345647");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
	}

}
