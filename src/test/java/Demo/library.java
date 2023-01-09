package Demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.bytebuddy.utility.RandomString;

public class library {
	
	public static void ScrollToElement (WebDriver driver,WebElement element) {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("argument[0].scrollIntoView()", element);
	}
        // ss full web page
	
	public static void CaptureScreenshot(WebDriver driver) throws Exception {
	
		String RM=RandomString.make(3);
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File destn=new File("C:\\Users\\HP\\eclipse-workspace\\project_hunters\\screen shot\\"+RM+".png");
		FileUtils.copyFile(src, destn);
	}
	
	   // ss - element
	
	public static void CaptureScreenshot_Element(WebElement element) throws Exception {
		
		File src1=element.getScreenshotAs(OutputType.FILE);
		File destn1=new File("C:\\Users\\HP\\eclipse-workspace\\project_hunters\\screen shot\\logo.png");
		FileUtils.copyFile(src1, destn1);
	}
	
	  // Alert
	
	public static Alert getAlertHandle(WebDriver driver) {
		return driver.switchTo().alert();
		
	}
	  // excel
	
	public static String getStringData_Excel (String Sheetname, int row, int cell ) throws Exception {
		
		String path="C:\\Users\\HP\\eclipse-workspace\\project_hunters\\TestData\\New Microsoft Excel Worksheet.xlsx";
		FileInputStream file=new FileInputStream(path); 
		XSSFWorkbook wb=new XSSFWorkbook(file);
		
		return wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
		
		
		
		
		
	}
	
	
	
}
