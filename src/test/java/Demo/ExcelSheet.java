package Demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelSheet {

	public static void main(String[] args) throws Exception {
		
		String path="C:\\Users\\HP\\eclipse-workspace\\project_hunters\\TestData\\New Microsoft Excel Worksheet.xlsx";
		
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
	    String data_0_0=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	    System.out.println(data_0_0);
	    String data_0_1=wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
	    System.out.println(data_0_1);
	    String data_0_2=wb.getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();
	    System.out.println(data_0_2);
	    String data_0_3=wb.getSheet("Sheet1").getRow(0).getCell(3).getStringCellValue();
	    System.out.println(data_0_3);
	    String data_0_4=wb.getSheet("Sheet1").getRow(0).getCell(4).getStringCellValue();
	    System.out.println(data_0_4);
	    String data_0_5=wb.getSheet("Sheet1").getRow(0).getCell(5).getStringCellValue();
	    System.out.println(data_0_5);
	    String data_0_6=wb.getSheet("Sheet1").getRow(0).getCell(6).getStringCellValue();
	    System.out.println(data_0_6);
	    String data_0_7=wb.getSheet("Sheet1").getRow(0).getCell(7).getStringCellValue();
	    System.out.println(data_0_7);
	    String data_0_8=wb.getSheet("Sheet1").getRow(0).getCell(8).getStringCellValue();
	    System.out.println(data_0_8);
	 	 
	    
	    
		
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(data_0_0); 
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(data_0_1);
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(data_0_2);
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(data_0_3);
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys(data_0_4);
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys(data_0_5);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(data_0_6);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(data_0_7);
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(data_0_8);
		
		Thread.sleep(3000);
		driver.quit();
		
				
		

	}

}
