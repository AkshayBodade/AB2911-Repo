package Demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo_practice {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		// Auto suggestion
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("INDIA");
		Thread.sleep(2000);
	/*	List<WebElement> list= driver.findElements(By.xpath("//ul(@id='ui-id-l']//li[@class='ui-menu-item']"));
		System.out.println(list.size());
		for  (int i=0;i<list.size();i++) {
			String str=list.get(i).getText();
			System.out.println(str);
			if (str.equalsIgnoreCase(list.get(i).getText()));
			list.get(i).click();
			break;
			}         */
		
	// drop down
      	WebElement drp= driver.findElement(By.xpath("//select[@name='dropdown-class-example']"));
		Select sel=new Select (drp);
		sel.selectByIndex(3);
				
		
	// open window 
		driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		String parentid=driver.getWindowHandle();
		Set<String> allid=driver.getWindowHandles();
		System.out.println(parentid);
		System.out.println(allid);
		
	
	//  mouse hover
		Actions act=new Actions (driver);
		WebElement MouseHover= driver.findElement(By.xpath("//button[text()='Mouse Hover']"));
		
		act.moveToElement(MouseHover).click().build().perform();
		
		
		
		//driver.quit();
		
		
				
		}
	
	

		
		
		
	    
	    
		
		// TODO Auto-generated method stub

	}


