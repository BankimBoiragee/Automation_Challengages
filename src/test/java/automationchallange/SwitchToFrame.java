package automationchallange;

import java.sql.DriverManager;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchToFrame {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		String url="https://demo.guru99.com/test/guru99home/";
		driver.get(url);
		Thread.sleep(5000);
		driver.switchTo().frame("a077aa5e"); //switching the frame by ID,iframe is a wraping document 
		System.out.println("Switch to the ifrome");
		driver.findElement(By.xpath("//*[@src='Jmeter720.png']")).click(); //  /html/body/a/img
		System.out.println("Switching done");
	}
	//Practice
	/*public static void iFrame() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		String url="https://demo.guru99.com/test/guru99home/";
		driver.get(url);
		driver.switchTo().frame(0);
		System.out.println("Switch to the iFrame");
		driver.findElement(By.xpath(""));
		System.out.println("Switching done");
		
	}*/
	/*public static void iFrame() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		String url="";
		driver.get(url);
		
		driver.switchTo().frame(0);
		System.out.println("Switch to the iFrame");
		driver.findElement(By.xpath(""));
		System.out.println("Switching done");
	}*/
	/*public static void iFrame() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.switchTo().frame(0);
		System.out.println("Switch to the iframe");
		driver.findElement(By.xpath(""));
		System.out.println("Switching done");
	}*/
	
}
