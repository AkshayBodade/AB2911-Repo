package Demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class ss_1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.instagram.com/");
		
	// ss element
		
	WebElement logo=driver.findElement(By.xpath("//i[@aria-label='Instagram']"));
	
	File src1=logo.getScreenshotAs(OutputType.FILE);
	File destn=new File("C:\\Users\\HP\\eclipse-workspace\\project_hunters\\screen shot\\logo.png");
	FileUtils.copyFile(src1, destn);

	}

}
