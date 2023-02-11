package auto_mation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class yahoo {

public static void main(String[ ] args)
{
	System.setProperty("webdriver.edge.driver", "C:\\Users\\DELL\\Downloads\\edgedriver_win64 1\\msedgedriver.exe");
	WebDriver driver= new EdgeDriver();
	driver.get("https://in.search.yahoo.com/?fr2=inr");
	driver.findElement(By.xpath("(//div[@class='text'][1])[1]")).click();
	driver.findElement(By.xpath("//a[@class=\"pure-button puree-button-secondary challenge-button\"]")).click();
	driver.findElement(By.xpath("//input[@id=\"usernamereg-firstName\"]")).sendKeys("shubham");
	driver.findElement(By.xpath("//input[@id=\"usernamereg-lastName\"]")).sendKeys("wakode");
	driver.findElement(By.xpath("//input[@id=\"usernamereg-yid\"]")).sendKeys("shubhamwk");
	driver.findElement(By.xpath("//input[@id=\"usernamereg-password\"]")).sendKeys("shub@123");
	driver.findElement(By.xpath("//input[@id=\"usernamereg-phone\"]")).sendKeys("9511221032");
	WebElement list = driver.findElement(By.xpath("//select[@data-ylk=\"elm:select;elmt:dob-month;slk:dob-month;\"]"));
	Select a=new Select (list);
	a.selectByIndex(7);
driver.findElement(By.xpath("//input[@id=\"usernamereg-day\"]")).sendKeys("29");
driver.findElement(By.xpath("//input[@id=\"usernamereg-year\"]")).sendKeys("1995");
driver.findElement(By.xpath("//input[@class=\"usernamereg-freeformGender\"]")).sendKeys("male");
driver.findElement(By.xpath("//button[@class=\"pure-button puree-button-primary puree-spinner-button\"]")).click();

	
}

		// TODO Auto-generated constructor stub
	}


