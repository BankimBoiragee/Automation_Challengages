
package automationchallange;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown_MultipleElements {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// How to handle multiple elements
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.wikipedia.org/");
				
	List<WebElement> ele = driver.findElements(By.xpath("//*[@class='central-featured']/div"));
	System.out.println("Total number of language  : " + ele.size());
	Thread.sleep(300);
	for (WebElement value : ele) {
	if (value.getText().equalsIgnoreCase("Español") || value.getText().contains("Español")) {
	System.out.println("Selected Languag name is  : " + value.getText());
	Thread.sleep(300);
	value.click();
	break;
			}
					
				}
				
	// How to handle drop down 1st way
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.wikipedia.org/");
				
	Select fruits = new Select(driver.findElement(By.id("searchLanguage")));
	fruits.selectByVisibleText("বাংলা");    //selectByid, selectByname
	Thread.sleep(300);
				
	//How to handle drop down 2nd way
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.wikipedia.org/");
				
	List<WebElement> suggestionResults = driver.findElements(By.xpath("//*[@id='searchLanguage']/option"));
	System.out.println("Total number of language  : " + suggestionResults.size());
	for (WebElement result : suggestionResults) {
	if (result.getText().equalsIgnoreCase("বাংলা") || result.getText().contains("বাংলা")) {
	System.out.println("Selected Languag name is  : " + result.getText());
	Thread.sleep(300);
	result.click();
	break;
					}
				}

			}
		//Practice Multiple Elements
	/*public static void multipleElement() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		String url="https://www.wikipedia.org/";
		driver.navigate().to(url);
		List<WebElement> elem= driver.findElements(By.xpath("//*[@id='searchLanguage']/option"));
		System.out.println("Total number of language:" +elem.size());
		for(WebElement value:elem) {
			if(value.getText().equalsIgnoreCase("বাংলা")||value.getText().contains("বাংলা")) {
				System.out.println("Selected language is: "+ value.getText());
				Thread.sleep(3000);
				value.click();
				
			}
			
		}
		
	}*/
	/*public static void multipleElements() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	String url="https://www.wikipedia.org/";
	driver.navigate().to(url);
	
	List<WebElement> list=driver.findElements(By.xpath("//*[@id='searchLanguage']/option"));
	for(WebElement value:list) {
		System.out.println("Total number of language:"+list.size());
		if(value.getText().equalsIgnoreCase("English")||value.getText().contains("English")) {
			System.out.println("Selected language is:"+value.getText());
			
		}
	}*/
	/*public static void handleMultipleElem() {
		WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		String url="";
		driver.get(url);
		
		List<WebElement> elem=driver.findElements(By.xpath(""));
		System.out.println("Total number of language"+elem.size());
		for(WebElement value:elem) {
			if(value.getText().equalsIgnoreCase("English")||value.getText().contains("English")) {
				System.out.println("Selected language:"+ value.getText());
				
			}
		}
	}*/
	/*public static void getHandleMultipleElement() {
		WebDriver driver=new ChromeDriver();
		List<WebElement>ele=driver.findElements(By.xpath("//select[@id='searchLanguage']/option"));
		System.out.println("Total number of language:"+ele.size());
		for(WebElement value:ele) {
		if(value.getText().contains("English")) {
		System.out.println("Select language:"+value.getText());	
		}
		}
	}*/
	/*public static void searchLanguage() {
		WebDriverManager.chromedriver();
		WebDriver driver=new ChromeDriver();
		List<WebElement> ele=driver.findElements(By.xpath("//select[@id='searchLanguage']/option"));
		System.out.println("Total Language:" +ele.size());
		for(WebElement value:ele) {
			if(value.getText().contains("Switzerland")) {
				System.out.println("Select language"+value.getSize());
			}
			
		}
	}*/
}
	


