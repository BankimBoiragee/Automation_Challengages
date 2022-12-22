package automationchallange;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_Sign {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		String url="https://www.amazon.com/";
		driver.get(url);
		
		WebElement elem=driver.findElement(By.xpath("//*[@id='nav-link-accountList-nav-line-1']"));
		Actions act= new Actions(driver);
		act.moveToElement(elem).build().perform();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("(//span[@class='nav-action-inner'])[1]")).click();
		driver.findElement(By.xpath("//*[@id='nav_prefetch_yourorders']")).click();
		
		
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		String url="https://www.salesforce.com/";
		driver.get(url);
		driver.findElement(By.xpath("")).click();
		
		WebElement elem=driver.findElement(By.xpath("//*[@id='nav-link-accountList-nav-line-1']"));
		*/
	}

}
