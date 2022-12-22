package automationchallange;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Practice {
	//Explecit wait is more intelegent,but it can only be applied for specific element.
	//One element to another element has gap
	//The WebDriver is directed to wait until a certaine condition occures before preceding with 
	//executing the code.
	//static WebElement elem; Example of Method overriding; Implecitwait is method overloading(Sec,Min,Hour)
	static WebDriver driver;
	public static void waitUntilElementPresent(WebElement elem) {
	    driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(elem));
		
	}
	/*public static void fluentWait() {
			
		Wait<WebElement> wait=new FluentWait<WebDriver>(driver).withTimeout(30,TimeUnit.SECONDS)
				.pollingEvery(5,TimeUnit.SECONDS)    //Set the interval between two tries
				.ignoring(NosurchElementException.class);//Don't throw this exception
		//Declare the WebElement and use a function to find it
		WebElement waitingElement=wait.until(new Function <webDriver,webElement()>{
			public webElement apply(WebDriver driver) {
				return driver.findElement(By.id("Start"));
	}
		}
				);
		waitingElement.click();
	
	}*/
}
	
