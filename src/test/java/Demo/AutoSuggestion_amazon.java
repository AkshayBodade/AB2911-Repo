package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestion_amazon {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(2500);
		
		driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("iphone");
		
		Thread.sleep(2500);
		
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='autocomplete-results-container']"));
		System.out.println(list.size());

	}

}
