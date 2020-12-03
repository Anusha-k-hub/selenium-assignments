package Selenium_Baiscs;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class XLSheet {
	 WebDriver driver;
	  String url="https://app.simplelogin.io/auth/login";
	@BeforeClass
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kacha\\Desktop\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get(url);
	}
	@Test
	public void test() throws IOException, InterruptedException {
		String path="D:\\XL_sheet.xlsx";
		FileInputStream file1=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(file1);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		int rows=sheet.getLastRowNum()-sheet.getFirstRowNum();
		for(int i=1;i<=rows;i++)
		{
			String user=sheet.getRow(i).getCell(0).getStringCellValue();
			String pass=sheet.getRow(i).getCell(1).getStringCellValue();
			driver.findElement(By.id("email")).sendKeys(user);
			Thread.sleep(3000);
			driver.findElement(By.id("password")).sendKeys(pass);
			Thread.sleep(3000);
	
		}
	}
	@AfterClass
	public void tearDown() throws Exception {
		driver.close();
	}

}

