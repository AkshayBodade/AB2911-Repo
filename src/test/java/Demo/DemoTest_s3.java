package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest_s3 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		WebElement txt_FirstName=driver.findElement(By.name("firstName"));
		txt_FirstName.sendKeys("Akshay");
		
		WebElement txt_LastName=driver.findElement(By.name("lastName"));
		txt_LastName.sendKeys("Bodade");
		
		WebElement txt_Phone=driver.findElement(By.name("phone"));
		txt_Phone.sendKeys("9665560608");
		
		WebElement txt_Email=driver.findElement(By.id("userName"));
		txt_Email.sendKeys("akshay@gmail.com");
		
		WebElement txt_Address=driver.findElement(By.name("address1"));
		txt_Address.sendKeys("Shree_Yashwant_Plaza");
		
		WebElement txt_City=driver.findElement(By.name("city"));
        txt_City.sendKeys("Mumbai");
        
        WebElement txt_State=driver.findElement(By.name("state"));
        txt_State.sendKeys("Maharashtra");
        
        WebElement txt_PostalCode=driver.findElement(By.name("postalCode"));
        txt_PostalCode.sendKeys("400002");
        
        WebElement txt_UserName=driver.findElement(By.name("email"));
        txt_UserName.sendKeys("akshay@gmail.com");
        
        driver.findElement(By.name("password")).sendKeys("123123123");
        
        WebElement txt_ConfirmPassword=driver.findElement(By.name("password"));
        txt_ConfirmPassword.sendKeys("123123123");
        
       // WebElement btnSubmit=driver.findElement(By.name("submit"));
     //   btnSubmit.click();
        
        
        
        
        
        
        
		
		
		
	}

}
