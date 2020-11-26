package Selenium_Baiscs;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ScrollWebPage {
	static WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://openclinic.sourceforge.net/openclinic/home/index.php");
		
	}
	@AfterClass
	public static void tearDown() {
		driver.close();
	}
	@Test
	public void scrollWebPage() {
		
		
	}
}
