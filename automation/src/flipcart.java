import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class flipcart {


	public static void main(String[] args) 
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.flipkart.com/");
			driver.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]")).sendKeys("9511221032");
			driver.findElement(By.xpath("//input[@class=\"_2IX_2- _3mctLh VJZDxU\"]")).sendKeys("Shub@123");
			driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")).click();
			//driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2HKlqd _3NgS1a\"]")).click();
			driver.get("https://www.flipkart.com/furniture-india-ka-furniture-store?otracker=hp_bannerads_6_3.bannerAdCard.BANNERADS_Furniture%2BBestsellers_68PMYLUGJATC");
			//driver.findElement(By.xpath("(//div[@class=\"eFQ30H\"][1])")).click();
			driver.findElement(By.xpath("//span[@class=\"_2I9KP_ _2WDRax\"]")).click();
	}

}
