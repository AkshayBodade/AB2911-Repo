package Demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alert {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		WebElement id= driver.findElement(By.xpath("//input[@name='cusid']"));
		
		id.sendKeys("123456");
		
		WebElement submit= driver.findElement(By.xpath("//input[@name='submit']"));
		submit.click();
		
		// alert handle
		
		Alert alt=driver.switchTo().alert();
		
		System.out.println(alt.getText());
		
		// alt.dismiss();   // click on cancel
		
		   alt.accept();
		   
		   Thread.sleep(2000);
		   
		   System.out.println(alt.getText());
		   
		   alt.accept();
		
		

	}

}
