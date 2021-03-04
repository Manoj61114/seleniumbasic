package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends HomePageTest{

	
	public static void loginTest() throws InterruptedException {
		
		WebElement register = driver.findElement(By.xpath("//span[text()='Register']"));
		register.click();
		//Thread.sleep(3000);
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("Manojkumawat@gmail.com");
		
		WebElement submit =driver.findElement(By.xpath("//button[@type='submit']"));
		submit.submit();
		
		WebElement phone = driver.findElement(By.xpath("//input[@type='text' and @id ='ds-form-input-id-3']"));
		phone.sendKeys("9829458761");
		
		WebElement back = driver.findElement(By.xpath("/html/body/dam-root/div/div/div/dam-register/dam-app-tile/div/div/div/div/div/dam-find-username-by-account/form/button[2]"));
		back.click();
		
		
		Thread.sleep(300);
	}
	
	
}
