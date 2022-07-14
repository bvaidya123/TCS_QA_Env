package test_Pack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test_Class 
{
	public static void main(String[] args) throws IOException
{
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//			
//		driver.get("https://www.flipkart.com/");
			
		String path = "C:\\Users\\User\\Desktop\\Excelsheet.xlsx";

		FileInputStream file = new FileInputStream(path);
		String data1 = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(data1);
		
	}
}
