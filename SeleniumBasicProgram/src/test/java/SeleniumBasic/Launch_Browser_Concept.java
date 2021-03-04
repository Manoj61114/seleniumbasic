package SeleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Launch_Browser_Concept {
	
	WebDriver driver;
	 
	public String SetUp(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Name\\eclipse-workspace\\SeleniumBasicProgram\\target\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.rogers.com");	
		String title =driver.getTitle();
		return title;
	}
	
	public void tearDown() {
		driver.close();
	}
	public static void main(String [] args) {
		
		Launch_Browser_Concept lbc = new Launch_Browser_Concept();
		String title = lbc.SetUp();
		System.out.println(title);
		if(title.equals("Wireless, Internet, TV, Home Monitoring, and Home phone | Rogers")) {
			System.out.println("Title is correct");
		}
		else {
			System.out.println("Title is incorrect");
		}
		lbc.tearDown();
	}
	
	
}

