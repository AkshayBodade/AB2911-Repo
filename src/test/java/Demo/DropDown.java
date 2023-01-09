package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
	WebElement drp_country=driver.findElement(By.xpath("//select[@name='country']"));
	//	HandleDropDown_text(drp_country,"")
		
		Select sel=new Select(drp_country);
		sel.selectByIndex(25);
		
	//	sel.selectByValue("");
		
	//	sel.selectByVisibleText("");
		
		List<WebElement> list=sel.getOptions();
		System.out.println(list.size()); //264
		
		for(int i=0; i<=list.size();i++) {
			
		String drpOption=list.get(i).getText();
		System.out.println(drpOption);
		
		if( drpOption.equals("INDIA"));{
			list.get(i).click();
			break;
		}
		
			
		}
		
	

	}

}
