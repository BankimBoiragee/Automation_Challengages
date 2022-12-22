package automationchallange;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollUp_Down {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    driver =new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    String url="https://www.orangehrm.com/";
	    driver.get(url);
	    
	    Thread.sleep(4000);
	   // JavascriptExecutor js=(JavascriptExecutor)driver;
	    //js.executeScript("window.scrollBy(0,1000)");
	    
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,6500)");
	    
		//Actions click = new Actions(driver);
		//click.sendKeys(Keys.PAGE_DOWN).build().perform();
					
		}
	//For practice
 /*public static void ScrollUpAndDown() {
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("window, scrollBy(0,100)");
 }*/
	/*public static void scrollUpAndDown() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
	}*/
	/*public static void scrollUpDown() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
	}*/
	/*public static void scroll_UpDown() {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
	}*/
	/*public static void scrollUp() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		String url="";
		driver.get(url);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		
	}*/
	/*public static void scrollUp() {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,1000)");
	}*/
	/*public static void scrollUpDown() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		String url="https://www.orangehrm.com/";
		driver.navigate().to(url);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		
	}*/
	/*public static void scrollUpDown() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
	}*/
}
