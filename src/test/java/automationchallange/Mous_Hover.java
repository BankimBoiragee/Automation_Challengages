package automationchallange;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mous_Hover {   //Dynamic drop-down/Hover-over
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String url="https://www.amazon.com/";
		driver.get(url);
		
		Thread.sleep(3000);
		WebElement drop= driver.findElement(By.xpath("//*[@id='nav-link-accountList-nav-line-1']"));
		Actions act =new Actions(driver);
		act.moveToElement(drop).build().perform();
				
	}
	//For Practice
	/*
public static void DynamicDropDown() {
	WebElement option= driver.findElement(By.xpath(""));
	Actions act =new Actions(driver);
	act.moveToElement(option).build().perform();
	
}*/
	/*public static void dynamicDropDown() {
		WebElement element=driver.findElement(By.xpath(""));
		Actions act=new Actions(driver);
		act.moveToElement(element).build().perform();
	}*/
	/*public static void dynamicDropDown() {
		WebElement element=driver.findElement(By.xpath(""));
		Actions act=new Actions(driver);
		act.moveToElement(element).build().perform();
	}*/
	/*public static void mous_Hover() {
		WebElement element=driver.findElement(By.xpath(""));
		Actions act=new Actions(driver);
		act.moveToElement(element).build().perform();
			
	}*/
	/*public static void hoverOver() {
		WebElement elem= driver.findElement(By.xpath(""));
		Actions act=new Actions(driver);
		act.moveToElement(elem).build().perform();
	}*/
	/*public static void mouseHover() { //dynamic drop down
		WebElement elm=driver.findElement(By.xpath(""));
		Actions act= new Actions(driver);
		act.moveToElement(elm).build().perform();
		
	}*/
	/*public static void dynamicDropDown() {
		WebElement option= driver.findElement(By.xpath("//*[@class='nav-line-2 ']"));
		Actions act=new Actions(driver);
		act.moveToElement(option).build().perform();
	}*/
	/*public static void mouseHover() {
		WebElement option=driver.findElement(By.xpath(""));
		Actions act=new Actions(driver);
		act.moveToElement(option).build().perform();
	}*/
}
