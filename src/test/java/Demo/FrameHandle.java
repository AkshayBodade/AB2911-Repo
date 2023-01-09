package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/frame.html");
		
		// iframe switch
		//driver.switchTo().frame(1); // index pass iframe
		//switch to iframe using na,e/id
		//driver.switchTo().frame("Selenium");
		
     	WebElement selframe=driver.findElement(By.xpath("//iframe[@name='Selenium']"));
     	
     	// WebElement frame switch
		driver.switchTo().frame(selframe);
		
		driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']")).click();
		
		// main page
		driver.switchTo().defaultContent(); // frame >> main page
		
		driver.findElement(By.xpath("//a[text()=' Click here for Login FaceBook ']")).click();
		driver.navigate().back();
		
		driver.switchTo().frame(0); // switch iframe
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		
		// main page >> 2 > 1 >> main page > 2
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']"));
		
		
	}

}
