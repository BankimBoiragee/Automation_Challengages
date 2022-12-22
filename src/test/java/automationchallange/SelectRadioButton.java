package automationchallange;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectRadioButton {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String url="https://rahulshettyacademy.com/AutomationPractice/";
		driver.get(url);
		//For option one
		WebElement option=driver.findElement(By.xpath("//*[@value='radio1']"));
		/*boolean isSelected=option.isSelected();      //isEnable, isDisplay
		if(!isSelected) {
			option.click();
			System.out.println(option.getText());
		}
		*/
		//For Select all Radiobutton
		List<WebElement> elements = driver.findElements(By.xpath("//input[@type='radio']"));
		for(int i=0;i<elements.size();i++) {
			elements.get(i).click();
			Thread.sleep(3000);
			
		}
		
	}
	//Practice
	/*public static void selectRadioButton() {
		WebElement option=driver.findElement(By.xpath(null));
		boolean isSelected= option.isSelected();
		if(!isSelected) {
			option.click();
		}
	}*/
	/*public static void all_RadioBoxes() {
		WebElement option=driver.findElement(By.xpath(""));
		boolean isSelected=option.isSelected(); //isEnable, isDisplay
		while(!isSelected) {
			option.click();
		}
		List<WebElement> radioboxes=driver.findElements(By.xpath(""));
		for(int i=0;i<radioboxes.size();i++) {
			radioboxes.get(i).click();
			
			
		}
	}*/
	/*public static void radioBox() {
		WebElement option=driver.findElement(By.xpath(""));
		boolean isEnabled=option.isEnabled();
		while(!isEnabled) {
			option.click();
			
		}
		List<WebElement> radioboxes=driver.findElements(By.xpath(""));
		for(int i=0;i<=radioboxes.size();i++) {
		radioboxes.get(i).click();	
		}
	}*/
/*public static void getRadioBTN() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	WebElement option=driver.findElement(By.xpath(""));
	boolean isSelected=option.isSelected();
	if(!isSelected) {
		option.click();
		
	}
}*/
}
