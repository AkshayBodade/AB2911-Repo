package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Actions act=new Actions(driver);
		
		/*WebElement sel=driver.findElement(By.xpath("//a[text()='Selenium']"));
		act.moveToElement(sel).click().build().perform();
	    Thread.sleep(3000);
		driver.navigate().back();*/
		
		WebElement bank=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement sales=driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement b5000=driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement s5000=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		
		WebElement target=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		WebElement target1=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		WebElement target2=driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		WebElement target3=driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		
		act.dragAndDrop(bank, target).build().perform();
		act.dragAndDrop(b5000, target1).build().perform();
		act.dragAndDrop(sales, target2).build().perform();
		act.dragAndDrop(s5000, target3).build().perform();
	

	}

}
