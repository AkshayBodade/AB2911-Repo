package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class relative_xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement password=driver.findElement(By.xpath("//*[@id=\"pass\"]"));
        password.sendKeys("12345678");
        
        WebElement email=driver.findElement(By.xpath("//*[@id=\"email\"]"));
        email.sendKeys("Test@gmail");
        
      // WebElement btnlogin=driver.findElement(By.xpath("//*[@id=\"u_0_5_Yf\"]"));
	// btnlogin.click();
	
	}

}
