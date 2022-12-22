package automationchallange;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_Drop {
	 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromiumdriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		String url="https://demo.guru99.com/test/drag_drop.html";
		driver.get(url);
		
		Thread.sleep(5000);
		WebElement From = driver.findElement(By.xpath("(//*[@class='button button-orange'])[5]"));
		WebElement To = driver.findElement(By.xpath("(//*[@class='placeholder'])[1]"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(From, To).build().perform();
		
		
	}
	//For practice
 /*public static void DragAndDrop() {
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver=new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 String url="";
	 driver.get(url);
	 
	 WebElement From=driver.findElement(By.xpath(""));
	 WebElement To= driver.findElement(By.xpath(""));
	 Actions act=new Actions(driver);
	 act.dragAndDrop(From, To).build().perform();
	 
	 
 }*/
	/*public static void dragAndDrop() {
		WebElement From=driver.findElement(By.xpath(""));
		WebElement To =driver.findElement(By.xpath(""));
		Actions act=new Actions(driver);
		act.dragAndDrop(From, To).build().perform();
	}*/
	/*public static void dragAndDrop() {
		WebElement From=driver.findElement(By.xpath(""));
		WebElement To =driver.findElement(By.xpath(""));
		Actions act=new Actions(driver);
		act.dragAndDrop(From, To).build().perform();
	}*/
	/*public static void drag_Drop() {
		WebElement From=driver.findElement(By.xpath(""));
		WebElement To=driver.findElement(By.xpath(""));
		Actions act=new Actions(driver);
		act.dragAndDrop(From, To).build().perform();
		
	}*/
	/*public static void dragAndDrop() {
		WebElement From=driver.findElement(By.xpath(""));
		WebElement To =driver.findElement(By.xpath(""));
		Actions act= new Actions(driver);
		act.dragAndDrop(From, To).build().perform();
		
	}*/
	/*public static void dragAndDrop() {
		WebElement From=driver.findElement(By.xpath(""));
		WebElement To= driver.findElement(By.xpath(""));
		Actions act= new Actions(driver);
		act.dragAndDrop(From, To).build().perform();
	}*/
	/*public static void dragAndDrop() {
		WebElement From= driver.findElement(By.xpath(""));
		WebElement To= driver.findElement(By.xpath(""));
		Actions act= new Actions(driver);
		act.dragAndDrop(From, To).build().perform();
		
		
	}*/
	/*public static void dragAndDrop() {
		WebElement From=driver.findElement(By.xpath(""));
		WebElement To=driver.findElement(By.xpath(""));
		Actions act=new Actions(driver);
		act.dragAndDrop(From, To).build().perform();
	}*/
	}
