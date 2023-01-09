package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Auto_suggestion {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		// Handle AutoSuggestion
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("maven");
	
		Thread.sleep(3000);
		
		List<WebElement> list=driver.findElements(By.xpath("(//ul[@jsname='bw4e9b'])[1]//li"));
		
		System.out.println(list.size()); //10
		
		for(int i=0;i<list.size();i++) {
			
			String AutoText=list.get(i).getText();
			System.out.println(AutoText);
			
			if ( AutoText.equals( "maven dependency")) {
				list.get(i).click();
				break;
			}
			
			
		}
			
		}
}
		



