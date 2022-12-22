package automationchallange;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Take_ScreenShort extends Wait_Practice {
	
	public static void takeScreenshotAtEndOfTest() throws IOException {
 //WebDriver driver=new ChromeDriver();
 File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
 String currentDir = System.getProperty("user.dir");
 FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));

	}
	/*public static void takeScreenShot() throws Throwable {
		WebDriver driver=new ChromeDriver();
	File scrFile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	String currentDir=System.getProperty("user,dir");
	FileUtils.copyFile(scrFile, new File(currentDir +"/screenshorts/" +System.currentTimeMillis()+ ".png"));
	}*/
}
