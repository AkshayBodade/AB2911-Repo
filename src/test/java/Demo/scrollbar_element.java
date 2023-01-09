package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scrollbar_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver ();
		
		driver.get("https://www.facebook.com/login.php");
	   // driver.manage().window().maximize();
	    
	    WebElement element=driver.findElement(By.xpath("//li[text()='English (UK)]'"));
		
	    library.ScrollToElement(driver, element);
		

	}

}
