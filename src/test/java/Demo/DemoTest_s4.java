package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest_s4 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver ();
		
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 // xpath by attribute;
		 driver.findElement(By.name("//*[@id=\"email\"]")).sendKeys("test@gmail");
		 
		 driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("12345678");
		 
		 // xpath by contains
		 driver.findElement(By.xpath("//button[contains(@id,'u_0_5_')]")).click();
		 
		// xpath by text
		WebElement FP= driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		 FP.clear();

		
	}

}
