package auto_mation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class opening_browser {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", null);
	WebDriver driver = new FirefoxDriver();
	}

}
