package Demo;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest_s1 {

	public static void main(String[] args) throws Exception  {
		// chrome executable setup
		WebDriverManager.chromedriver().setup();
		
		// browser execution object create
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.youtube.com/");
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		driver.close();
		

	}

}
