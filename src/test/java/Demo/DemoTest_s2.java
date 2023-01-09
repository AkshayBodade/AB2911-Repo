package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest_s2 {

	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/login.php");
	
	driver.manage().window().maximize();
	
	WebElement txt_emailid=driver.findElement(By.id("email"));
	txt_emailid.sendKeys("test@gmail.com");
	
	WebElement txt_password=driver.findElement(By.id("pass"));
	txt_password.sendKeys("11223344");
	
	WebElement btnlogin=driver.findElement(By.id("loginbutton"));
	btnlogin.click();
		
			}

}
