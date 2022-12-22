package automationchallange;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Select_CheckBox {
	static WebDriver driver;
	public static void main(String[] args) {
	 WebDriverManager.chromedriver().setup();
	 driver =new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 String url="https://rahulshettyacademy.com/AutomationPractice/";
	 driver.get(url);
	 
	 /*WebElement option= driver.findElement(By.xpath("//input[@type='checkbox']"));
	 boolean isSelected= option.isSelected();
	 if(!isSelected) {
		 option.click();
		 //System.out.println(option.getText());
		  }*/
	 
	// To find all web element using Xpath and performing click event on check box
	 List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
	 for(int i=0; i<checkboxes.size();i++) {
		 if(i==0) {                    //Select by index wise(specific two)
		 checkboxes.get(i).click();
		 }
		 else if(i==1) {         
			 checkboxes.get(i).click();
		 break;
		 
		  }
		 }		
	 }
	 
	
	//Practice
	/*public static void selectCheckBox() {
		WebElement option=driver.findElement(By.xpath(""));
		boolean isSelected=option.isEnabled();
		if(! isSelected) {
			option.click();
			System.out.println(option.getText());
		}
		
	}
		//Select for all checkbox
	public static void selectAllCheckBox() {
	List<WebElement> checkboxes= driver.findElements(By.xpath(""));
	for(int i=0; i<checkboxes.size();i++) {
		checkboxes.get(i).click();
		
	}
	}*/
	/*public static void selectCheckBox() {
		WebElement option=driver.findElement(By.xpath(""));
		boolean isSelected=option.isSelected();
		while(!isSelected) {
			option.click();
		}
		List<WebElement> checkboxes=driver.findElements(By.xpath(""));
		for(int i=0;i<checkboxes.size();i++) {
			checkboxes.get(i).click();
		}
	}*/
	/*public static void selectCheckbox() {
		WebElement option=driver.findElement(By.xpath(""));
		boolean isSelected=option.isSelected();
		while(!isSelected) {
			option.click();
			
		}
		List<WebElement> checkbox=driver.findElements(By.xpath(""));
		for(int i=0;i<checkbox.size();i++) {
			checkbox.get(i).click();
		}
		
	}*/
	/*public static void select_AllCheckbox() {
		WebElement option=driver.findElement(By.xpath(""));
		boolean isSelected=option.isSelected();
		while(!isSelected) {
			option.click();
		}
		List<WebElement> checkboxes=driver.findElements(By.xpath(""));
		for(int i=0;i<checkboxes.size();i++) {
			checkboxes.get(i);
		}
	}*/
	/*public static void checkBox() {
		WebElement option=driver.findElement(By.xpath(""));
		boolean isSelected=option.isSelected();
		while(!isSelected) {
			option.click();
		}
		List<WebElement> checkboxes=driver.findElements(By.xpath(""));
		for(int i=0;i<=checkboxes.size();i++) {
			checkboxes.get(i);
			
		}
	}*/
	/*public static void checkBoxes() {
		WebElement option=driver.findElement(By.xpath(""));
		boolean isSelected=option.isSelected();
		while(!isSelected) {
			option.click();
			
		}
		List<WebElement> checkboxes=driver.findElements(By.xpath(""));
		for(int i=0;i<=checkboxes.size();i++) {
			checkboxes.get(i).click();
			
		}
	}*/
	/*public static void checkboxSelect() {
		WebElement option=driver.findElement(By.xpath(""));
		boolean isSelected=option.isSelected();
		while(!isSelected) {
			option.click();
						
		}
		List<WebElement> checkboxes=driver.findElements(By.xpath(""));
		for(int i=0;i<checkboxes.size();i++) {
			checkboxes.get(i).click();
			
		}
	}*/
	/*public static void checkBoxes() {
		WebElement option=driver.findElement(By.xpath(""));
		boolean isSelected=option.isSelected();
		while(!isSelected) {
			option.click();
			
		}
		List<WebElement> checkboxes=driver.findElements(By.xpath(""));
		for(int i=0;i<checkboxes.size();i++) {
			checkboxes.get(i).click();
			
		}
	}*/
}
