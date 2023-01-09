package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class doubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		Actions act1=new Actions(driver);
		
		WebElement doubleclickele=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	//	act1.doubleClick(doubleclickele).build().perform();
  
		//   Right click
		
		WebElement Rightclickele=driver.findElement(By.xpath("//span[text()='right click me']"));
		WebElement Quit=driver.findElement(By.xpath("//span[text()='Quit']"));
		act1.contextClick(Rightclickele).click( Quit).build().perform();

	}

}
