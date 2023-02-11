package auto_mation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube {

		public static void main(String[ ] args)
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		Dimension D = new Dimension(500,500);
		driver.manage().window().setSize(D);
		
		
		driver.get("https://www.youtube.com/watch?v=u_wB6byrl5k");
		}

	}



