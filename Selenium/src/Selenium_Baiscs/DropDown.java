package Selenium_Baiscs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DropDown {
	static WebDriver driver;
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@AfterClass
	public static void tearDown() {
		driver.close();
	}
	@Test
	public void dropDownTest() {
		WebElement drop1=driver.findElement(By.id("option-droup-demo"));
		Select s1=new Select(drop1);
		s1.selectByValue("jQuery");
		WebElement drop2=driver.findElement(By.id("option-droup-demo"));
		Select s2=new Select(drop2);
		s2.selectByValue("csharp");
	}

}
