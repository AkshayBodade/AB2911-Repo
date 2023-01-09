package CrossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PomRepo.LoginPom;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLogin1 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void verifyLoginvalid() {
		
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		
		login.getTxt_email().sendKeys("test");
		
		login.getTxt_password().sendKeys("11223344");
		
		login.getBtn_login().click();	
		
	}
	
	@Test
	public void verifyLoginInvalid() {
		
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		
		login.getTxt_email().sendKeys("test");
		
		login.getTxt_password().sendKeys("11223344");
		
		login.getBtn_login().click();
		
	}
	
	@AfterMethod
	
	public void tearDown() {
		driver.close();
	}

}
