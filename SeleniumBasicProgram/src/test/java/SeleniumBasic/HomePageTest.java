package SeleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageTest {

	
	static WebDriver driver;
	static String path = "C:\\Users\\Name\\eclipse-workspace\\SeleniumBasicProgram\\target\\chromedriver.exe";
	
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
		Thread.sleep(20000);
		String heading1 = driver.findElement(By.xpath("//span[text()='Personal']")).getText();
		System.out.println(heading1);
		Thread.sleep(20000);
		System.out.println(driver.findElement(By.xpath("//span[text()='Business' and @class ='m-navLink__caption']")).getText());
		driver.findElement(By.xpath("//span[text()='Business' and @class ='m-navLink__caption']")).click();
		//System.out.println(head2);
		
		driver.navigate().to("https://www.rogers.com/");
		Thread.sleep(20000);
		driver.findElement(By.xpath("//span[text()='Sign in' and @class = 'm-navLink__caption']")).click();
		
		System.out.println("Program executed sucessfully");
		Thread.sleep(30000);
		driver.close();
		

	}
	
	
}
