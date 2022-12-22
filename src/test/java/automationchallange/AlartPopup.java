package automationchallange;

import java.sql.DriverManager;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlartPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		String url="https://demoqa.com/alerts";
		driver.get(url);
		
		WebElement element=driver.findElement(By.xpath("//*[@id='alertButton']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",element);
		//Actions click=new Actions(driver);
		Thread.sleep(4000);
		Alert al=driver.switchTo().alert();
		al.accept();
		//al.dismiss();
		//al.sendKeys(url);
	}
	//Practice
	/*public static void handleAlart() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("");
	WebElement element=driver.findElement(By.xpath(""));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()",element);
	Alert al=driver.switchTo().alert();
	al.accept();
	}*/
	/*public static void alar() {
		WebDriver driver=new ChromeDriver();
		WebElement element=driver.findElement(By.xpath(""));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",element);
		Alert al=driver.switchTo().alert();
		al.accept();
		al.dismiss();
		al.sendKeys(null);
		
	}*/
	/*public static void alartPopup() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		String url="";
		driver.get(url);
		WebElement element=driver.findElement(By.xpath(""));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",element);
		Alert al=driver.switchTo().alert();
		al.accept();
		
	}*/
	/*public static void alart_Pop() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		String url="";
		driver.get(url);
		WebElement elm=driver.findElement(By.xpath(""));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",elm);
		Alert al=driver.switchTo().alert();
		al.accept();  //al.dismiss()//al.sendkeys()
	}*/
	/*public static void alert() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		String url="";
		driver.get(url);
		WebElement elem= driver.findElement(By.xpath(""));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",elem);
		Alert al=driver.switchTo().alert();
		al.accept();
		//al.dismiss();
	}*/
	/*public static void alertPopup() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		String url="";
		driver.get(url);
		
		WebElement elem=driver.findElement(By.xpath(""));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",elem);
		Alert al=driver.switchTo().alert();
		al.accept();
		//al.dismiss();
	}*/
	/*public static void popUp() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		WebElement elem=driver.findElement(By.xpath("(//*[@class='btn btn-primary'])[1]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",elem );
		Alert al=driver.switchTo().alert();
		al.accept();
		
	}*/
	/*public static void popUpAlert() {
		WebDriver driver=new ChromeDriver();
		WebElement elem= driver.findElement(By.xpath(""));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("argument[0].click()", elem);
		Alert al=driver.switchTo().alert();
		al.accept();
	}*/
/*public static void getAlert() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("");
	
	WebElement ele=driver.findElement(By.xpath(""));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()",ele);
	Alert al=driver.switchTo().alert();
	al.dismiss();
}*/
	/*public static void getAlert() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String url="";
		driver.get(url);
		
		WebElement ele=driver.findElement(By.xpath(""));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("argument[0].click()",ele);
		Alert al=driver.switchTo().alert();
		al.dismiss();
		
	}*/
}
