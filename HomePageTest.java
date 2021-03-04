package SeleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageTest extends ExplicitWait {

	
	static WebDriver driver;
	static String path = "C:\\Users\\Name\\git\\seleniumbasic\\SeleniumBasicProgram\\target\\chromedriver.exe";
	
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		driver.get("https://www.rogers.com/");//span[text()='Personal']
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contentEquals("Wireless, Internet, TV, Home Monitoring, and Home phone | Rogers")) {
			System.out.println("Title is correct");
		}
		else
		{
			System.out.println("Title is incorrect");
		}	
		//Thread.sleep(3000);
		WebElement personal = driver.findElement(By.xpath("//span[text()='Personal']"));
		System.out.println(personal.getText());
		//ExplicitWait.explicitlyWaitClick(driver, personal);
		
		//Thread.sleep(3000);
		WebElement business = driver.findElement(By.xpath("//span[text()='Business' and @class ='m-navLink__caption']"));
		System.out.println(business.getText());
		
		//ExplicitWait.explicitlyWaitClick(driver, business);
		//driver.navigate().to("https://www.rogers.com/");
		
		Thread.sleep(3000);
		WebElement sign = driver.findElement(By.xpath("//span[text()='Sign in' and @class = 'm-navLink__caption']"));
		sign.click();
		
		
		//new WebDriverWait(driver, 70).until(ExpectedConditions.visibilityOf(sign)).click();
					//System.out.println(ele.getText());	
					
		System.out.println("Program executed sucessfully");
		Thread.sleep(3000);
		LoginTest.loginTest();
		//driver.close();
		

	}

		
}
