package auto_mation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class brave {

public static void main(String[] args) throws Exception
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	ChromeOptions shubham=new ChromeOptions();
	
	
	shubham.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
	
	WebDriver driver= new ChromeDriver(shubham);
	
	driver.manage().window().maximize();
driver.get("https://www.google.com/");
driver.navigate().back();
	
		
	}

}
