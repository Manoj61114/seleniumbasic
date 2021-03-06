package SeleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectClass {
	static WebDriver driver;
	static String driverpath = "C:\\Users\\Name\\git\\seleniumbasic\\SeleniumBasicProgram\\target\\chromedriver.exe";
	static String url = "https://www.wipro.com/contact-wipro/";
	
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver",driverpath);
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	@BeforeMethod
	public static void select(WebDriver driver, WebElement drop, String text) {
		
		Select select  = new Select(drop);
		select.selectByVisibleText(text);
	}
	
	@Test
	public void country() {
		WebElement countryName = driver.findElement(By.xpath("//select[@id='Country__c']")); 
		SelectClass.select(driver, countryName, "India");
		
	}
	
	@AfterMethod
	public static void sele() {
		
		System.out.println("Select class worked sucessfully");
	}
	
	
	@AfterClass
	public void teardown() throws InterruptedException {
		System.out.println("Closing the browser");
		Thread.sleep(300);
		driver.close();
		
	}
	
}
