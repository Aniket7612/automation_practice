package auto_mation;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class jdjn{
	
	public jdjn() {
		
	}
	public static void main(String [] args)
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\DELL\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe" );
		WebDriver abc = new FirefoxDriver();//
	}

}
