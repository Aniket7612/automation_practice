package auto_mation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class open {
	public static void main(String[ ] args)
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	RemoteWebDriver driver =new ChromeDriver();
	}

}
