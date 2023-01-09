package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelSheel_library {

	public static void main(String[] args) throws Exception {

		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(library.getStringData_Excel("Sheet2", 0, 0));
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(library.getStringData_Excel("Sheet1", 0, 1));
		
		Thread.sleep(3000);
		driver.quit();
	}

}
