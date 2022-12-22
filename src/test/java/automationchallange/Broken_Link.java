package automationchallange;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Broken_Link {
	public static void main(String[] args) {
		//How to find the Broken Link or URL?
			//System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("http://www.google.co.in/");   
   List<WebElement> link =driver.findElements(By.tagName("a"));
	for (int i = 0; i<link.size();i++) {
	WebElement ele= link.get(i);
	String url = ele.getAttribute("href");
	//System.out.println(url);
	verifyLink(url); 
				 }
			}
	// this we need to verify the Broken link or URl.
   public static void verifyLink(String link)  {
   try {
	//first, we have to create an object with the help of URL class.
	//then pass the URL link inside the parameter.
	URL url = new URL(link);
		
	// then we have to create an instance with the help of HttpURLConnection
	//after that, with the help of url class object, I can call the openConnection() method.
				
	HttpURLConnection httpConnection = (HttpURLConnection)url.openConnection();
    //with the help of httpConnection instance, we can put some Wait there by calling 
	//setConnectTimeout() method.
	httpConnection.setConnectTimeout(3000);
	//again , I have to call the connect() method with the help of HttpUrlConnection instance.
	httpConnection.connect();
	// Now I have to do the Condition, calling the getResponseCode() method, then compare with the response code 200.
	if (httpConnection.getResponseCode()== 200) {
	System.out.println(link + " " + httpConnection.getResponseMessage());
					
		}
	// again, I have to put another Condition, by using getResponseCode()== HttpURLConnection.HTTP_NOT_FOUND method
	if (httpConnection.getResponseCode()== HttpURLConnection.HTTP_NOT_FOUND) {
	System.out.println(link + " " + httpConnection.getResponseMessage()+ " " + HttpURLConnection.HTTP_NOT_FOUND );
		}
	// This function I am calling in my code to verify the link.
	} catch (MalformedURLException e) {
	
	e.printStackTrace();
	} catch (IOException e) {
	
	e.printStackTrace();
			}
			
	}
		/*public static void brokenLink() {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.google.co.in/");
			List<WebElement> link=driver.findElements(By.tagName("a"));
			for(int i=0; i<link.size();i++) {
				WebElement ele=link.get(i);
				String url=ele.getAttribute("href");
				verifyLink(url);
				
			}
				}
		public static void verifyBrokenLink(String link) throws Throwable {
			URL url=new URL(link);
			HttpURLConnection httpconnection=(HttpURLConnection)url.openConnection();
			httpconnection.setConnectTimeout(3000);
			httpconnection.connect();
			if(httpconnection.getResponseCode()==200) {
				System.out.println(link +" " + httpconnection.getResponseMessage());
				
			}
			if(httpconnection.getResponseCode()==httpconnection.HTTP_NOT_FOUND) {
				System.out.println(link + " " + httpconnection.getResponseMessage()+ " " + HttpURLConnection.HTTP_NOT_FOUND );			
				
			}
		}*/
		/*public void getBrokenLink() {
			WebDriver driver=new ChromeDriver();
			List<WebElement> link=driver.findElements(By.tagName("a"));
			for(int i=0;i<link.size();i++) {
				WebElement ele=link.get(i);
				String url=ele.getAttribute("href");
				verifyLink(url);
				
			}
		}
		public static void verifyBrokenLink(String link) throws Throwable {
			URL url= new URL(link);
			HttpURLConnection httpconnection=(HttpURLConnection)url.openConnection();
			httpconnection.setConnectTimeout(3000);
			httpconnection.connect();
			if(httpconnection.getResponseCode()==200) {
				System.out.println(link +"" +httpconnection.getResponseMessage());
				
			}
			if(httpconnection.getResponseCode()==httpconnection.HTTP_NOT_FOUND) {
				System.out.println(link +""+httpconnection.getResponseCode()+""+httpconnection.HTTP_NOT_FOUND);
				
			}
		}*/
   /*public static void getBrokenLink() {
	   WebDriverManager.chromedriver().setup();
	   WebDriver driver=new ChromeDriver();
	   List<WebElement> link=driver.findElements(By.tagName("a"));
	   for(int i=0;i<link.size();i++) {
		 WebElement ele= link.get(i);
		String url=ele.getAttribute("href");
		verifyLink(url);
	   }
   }
   public static void getVerifyLink(String link) throws Throwable {
	   URL url=new URL(link);
	   HttpURLConnection httpconnection=(HttpURLConnection)url.openConnection();
	   httpconnection.setConnectTimeout(3000);
	   httpconnection.connect();
	   if(httpconnection.getResponseCode()==200) {
		 System.out.println(link +""+ httpconnection.getResponseMessage());  
	   }
	   if(httpconnection.getResponseCode()==httpconnection.HTTP_NOT_FOUND) {
		   System.out.println(link +""+httpconnection.getResponseCode()+""+httpconnection.HTTP_NOT_FOUND);  
	   }
   }*/
   /*public static void getBrokenLink() {
	   WebDriverManager.chromedriver().setup();
	   WebDriver driver=new ChromeDriver();
	   List<WebElement> link=driver.findElements(By.tagName("a"));
	   for(int i=0;i<link.size();i++) {
		 WebElement ele= link.get(i);
		 String url=ele.getAttribute("href");
		 verifyLink(url);
	   }
   }
   public static void getVerifyLink(String link) {
	  
		try {
			URL url=new URL(link);
			HttpURLConnection httpconnection=(HttpURLConnection)url.openConnection();
			httpconnection.setConnectTimeout(3000);
			httpconnection.connect();
			if(httpconnection.getResponseCode()==200) {
				System.out.println(link+""+httpconnection.getResponseMessage());
						
			}
			if(httpconnection.getResponseCode()==httpconnection.HTTP_NOT_FOUND) {
				System.out.println(link+""+httpconnection.getResponseCode()+""+httpconnection.HTTP_NOT_FOUND);
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	   
   
}
