package Demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class child_window {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
	    driver.get("https://demo.guru99.com/popup.php");
	    driver.manage().window().maximize();
	    
	    // parent window id
	    String parentid=driver.getWindowHandle();
	    System.out.println("Parent window id=="+parentid);
	    
	    // Action- click on link
	    driver.findElement(By.xpath("//a[text()='Click Here']")).click();
	    
	    // parent & child id
	    Set<String> Allid=driver.getWindowHandles();
	    System.out.println("All id parent and child =="+Allid);
	    
	    List<String>list=new ArrayList(Allid);
	    
	    System.out.println(list.get(0)); // parent id
	    System.out.println(list.get(1)); // child id
	    
	    driver.switchTo().window(list.get(1));
	    
	    driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("test@gmail");
	    
	    driver.switchTo().window(list.get(0)); // switch to parent window
	    
	    Thread.sleep(2500);
	    
	    // driver.close();
	       driver.quit();
	    
	    
	    
	    
	    
	    
	    
	    
		
		
		

		

	}

}
