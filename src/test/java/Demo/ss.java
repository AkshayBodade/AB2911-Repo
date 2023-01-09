package Demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ss {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// ss of element
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	//	library.CaptureScreenshot(driver);
		
		WebElement logo=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		
		library.CaptureScreenshot_Element(logo);
		

	}

}
