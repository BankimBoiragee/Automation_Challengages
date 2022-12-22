
package automationchallange;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {        //Static drop-down
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromiumdriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//String url="https://www.amazon.com/";
		String url="https://www.wikipedia.org/";
		driver.get(url);
		
		//Select select= new Select(driver.findElement(By.xpath("//*[@aria-describedby='searchDropdownDescription']")));
		Select select= new Select(driver.findElement(By.xpath("//*[@id='searchLanguage']")));
		//select.selectByIndex(7);
		//select.selectByValue("bn");
		select.selectByVisibleText("বাংলা");
		
		
	
	}
	//For Practice
	/*public static void DropDown() {
		
	Select select = new Select(driver.findElement(By.xpath("")));
	select.selectByIndex(0);
	select.selectByValue(null);
	select.selectByVisibleText(null);
	}*/
	/*public static void dropDown() {
		Select select=new Select(driver.findElement(By.xpath("")));
		select.selectByIndex(0);
		select.selectByValue(null);
		select.selectByVisibleText(null);
	}*/
	/*public static void staticDropDown() {
		Select select=new Select(driver.findElement(By.xpath("")));
		select.selectByIndex(0);
		select.selectByValue(null);
		select.selectByVisibleText(null);
	}*/
	/*public static void drop_Down() {
		Select select=new Select(driver.findElement(By.xpath("")));
		select.selectByIndex(0);
		select.selectByValue(null);
		select.selectByVisibleText(null);
	}*/
	/*public static void dropDown() {
		Select select= new Select(driver.findElement(By.xpath("")));
		select.selectByIndex(0);
		select.selectByValue(null);
		select.selectByVisibleText(null);
	}*/
	/*public static void dropDown() {  //static drop-down
		Select select=new Select(driver.findElement(By.xpath("")));
		select.selectByIndex(0);
		select.selectByValue(null);
		select.selectByVisibleText(null);
	}*/
	/*public static void dropDown() {
		Select select=new Select(driver.findElement(By.xpath("")));
		select.selectByIndex(0);
		
	}*/
	
	
}
