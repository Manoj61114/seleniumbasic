package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	


	public static void explicitlyWaitClick(WebDriver driver, WebElement ele) {
		// TODO Auto-generated method stub
		//WebElement ele = driver.findElement(By.xpath(ele));
		WebDriverWait element =  new WebDriverWait(driver,100);
		element.until(ExpectedConditions.visibilityOf(ele));
		System.out.println(ele.getText());
	}
}
