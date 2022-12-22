package automationchallange;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		String url="https://demoqa.com/browser-windows";
		driver.get(url);
		//driver.navigate().to(url);
		
		Thread.sleep(4000);
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@id='messageWindowButton']")).click();
		
		String mainwindow=driver.getWindowHandle();//To handle mainwindow
		Set<String> set=driver.getWindowHandles(); //To handle childwindow
		Iterator<String> iterator=set.iterator();  //To go one by one
		while(iterator.hasNext()) {                //Ignore mainwindow
			String childwindow=iterator.next();    //For counting of childwindow
			if(!mainwindow.equalsIgnoreCase(childwindow)) { //Is not mainwindow then switch to childwindow
				driver.switchTo().window(childwindow);
				Thread.sleep(4000);
				driver.close();
			  System.out.println("Close to childwindow");
				
			}
	}
       driver.switchTo().window(mainwindow);
       Thread.sleep(4000);
       driver.close();
       System.out.println("Close to mainwindow");
	}
	//For Practice
	/*public static void handleMultipleWindows() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		String url="https://demoqa.com/browser-windows";
		driver.get(url);
		driver.findElement(By.xpath(""));
		String mainwindow=driver.getWindowHandle();
		Set<String> set=driver.getWindowHandles();
		Iterator<String> iterator=set.iterator();
		while(iterator.hasNext()) {
			String childwindow=iterator.next();
			if(!mainwindow.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);
				driver.close();
				System.out.println("Close to child window");
				
			}
			driver.switchTo().window(mainwindow);
			driver.close();
			System.out.println("Close to mainwindow");
		}*/
		
		/*public static void multipleWindows() {
			WebDriver driver=new ChromeDriver();
			driver.findElement(By.xpath("")).click();
			String mainwindow=driver.getWindowHandle();
			Set<String> set=driver.getWindowHandles();
			Iterator<String> iterator=set.iterator();
			while(iterator.hasNext()) {
				String childwindows=iterator.next();
				if(!mainwindow.equalsIgnoreCase(childwindows)) {
					driver.switchTo().window(childwindows);
					driver.close();
					System.out.println("Child windows close");
					
				}
				
			}
			driver.switchTo().window(mainwindow);
			driver.close();
			System.out.println("Main window close");
		}*/
	/*public static void multipleWindow() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		String url="";
		driver.get(url);
		String mainwindow=driver.getWindowHandle();
		Set<String> set=driver.getWindowHandles();
		Iterator<String> iterator=set.iterator();
		while(iterator.hasNext()) {
			String childwindow=iterator.next();
			if(!mainwindow.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);
				driver.close();
				System.out.println("Child Window close");
			}
			
		}
		driver.switchTo().window(mainwindow);
		driver.close();
		System.out.println("Main Window close");
	}*/
  /* public static void multipleWindows() {
	   WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		String url="";
		driver.get(url);
		
		String mainwindow=driver.getWindowHandle();
		Set<String> set=driver.getWindowHandles();
		Iterator<String> iterator=set.iterator();
		while(iterator.hasNext()) {
			String childwindow=iterator.next();
			if(!mainwindow.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);
				driver.close();
				System.out.println("Child Window close");
				
			}
			
		}
		driver.switchTo().window(mainwindow);
		driver.close();
		System.out.println("Main window close");
   }*/
	/*public static void mulTipleWindows() {
		WebDriver driver=new ChromeDriver();
		driver.findElement(By.xpath(""));
		String mainwindow=driver.getWindowHandle();
		Set<String> set=driver.getWindowHandles();
		Iterator<String> iterator=set.iterator();
		while(iterator.hasNext()) {
			String childwindow=iterator.next();
			if(!mainwindow.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);
				driver.close();
				System.out.println("Child window close");
				
			}
		}
		driver.switchTo().window(mainwindow);
		driver.close();
		System.out.println("Mainwindow close");
		
		
	}*/
	/*public static void multipleWindows() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.findElement(By.xpath(""));
		String mainwindow=driver.getWindowHandle();
		Set<String> set=driver.getWindowHandles();
		Iterator<String> iterator=set.iterator();
		while(iterator.hasNext()) {
			String childwindows=iterator.next();
			if(!mainwindow.equalsIgnoreCase(childwindows)) {
				driver.switchTo().window(childwindows);
				driver.close();
			}
			
		}
		driver.switchTo().window(mainwindow);
		driver.close();
	}*/
	/*public static void handleMultipleWindows() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("");
		
		driver.findElement(By.xpath(""));
		String mainwindow=driver.getWindowHandle();
		Set<String> set=driver.getWindowHandles();
		Iterator<String> iterator=set.iterator();
		while(iterator.hasNext()) {
			String childwindows=iterator.next();
			if(!mainwindow.equalsIgnoreCase(childwindows)) {
				driver.switchTo().window(childwindows);
				driver.close();
				
			}
			
		}
		driver.switchTo().window(mainwindow);
		driver.close();
	}*/
	/*public static void multipleWindows() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		String url="";
		driver.get(url);
		
		driver.findElement(By.xpath(""));
		String mainwindow=driver.getWindowHandle();
		Set<String> set=driver.getWindowHandles();
		Iterator<String> iterator=set.iterator();
		while(iterator.hasNext()) {
			String childwindows=iterator.next();
			if(!mainwindow.equalsIgnoreCase(childwindows)) {
				driver.switchTo().window(childwindows);
				driver.close();
				
			}
			driver.switchTo().window(mainwindow);
			driver.close();
		}
	}*/
}
