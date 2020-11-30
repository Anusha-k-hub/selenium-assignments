package Selenium_Baiscs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertUniqueAssignment {
	static WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://chennaiiq.com/chennai/pincode-by-name.php");
	}
	
	@AfterClass
	public static void tearDwn() {
		driver.close();
	}

	@Test
	public void test() {
		/*WebElement pincode1=driver.findElement(By.xpath("/html/body/table/tbody/tr[3]/td[2]/table[1]/tbody/tr[4]/td[2]"));
		WebElement pincode2=driver.findElement(By.xpath("/html/body/table/tbody/tr[3]/td[2]/table[1]/tbody/tr[5]/td[2]"));
		Assert.assertNotEquals(pincode1,pincode2);
		System.out.println("different");*/
		List<WebElement> list=driver.findElements(By.className("TBox"));
		System.out.println(list.size());
	}
}
