package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_Drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		WebElement src =driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement src1=driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement src2=driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement src3=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		
	    WebElement target =driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
        WebElement target1=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
        WebElement target2=driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
        WebElement target3=driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
        
        act.dragAndDrop(src, target).build().perform();
        act.dragAndDrop(src1, target1).build().perform();
        act.dragAndDrop(src2, target2).build().perform();
        act.dragAndDrop(src3, target3).build().perform();
        
        
        
        
	}

}
