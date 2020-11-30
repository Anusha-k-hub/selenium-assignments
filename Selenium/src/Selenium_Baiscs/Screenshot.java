package Selenium_Baiscs;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Screenshot {
	static WebDriver driver;
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://api.jquery.com/dblclick/");
	}
	
	@AfterClass
	public static void tearDown() {
		driver.close();
	}
	
	@Test
	public void test() {
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(screenshot, new File("C:\\Users\\kacha\\Desktop\\image.png"));
			System.out.println("Screenshot");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception is"+e.getMessage());
		}
	}

}
