package auto_mation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class rediff {

	
		public static void main(String[] args)
		{
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.rediff.com/");
	driver.findElement(By.xpath("//a[text()='Create Account']")).click();
	driver.findElement(By.xpath("(//input[@type='text'][1])[1]")).sendKeys("Shubham Wakode");
	driver.findElement(By.xpath("(//input[@type='text'][1])[2]")).sendKeys("shubhamwk10");
	driver.findElement(By.xpath("//input[@class=\"btn_checkavail\"]")).click();
driver.findElement(By.xpath("(//input[@type='password'][1])[1]")).sendKeys("shub@123");
driver.findElement(By.xpath("(//input[@type='password'][1])[2]")).sendKeys("shub@123");
driver.findElement(By.xpath("//td[text()=\"Alternate Email Address\"]/..//input[@type=\"text\"]")).sendKeys("shubhamwk11");
driver.findElement(By.xpath("//input[@id=\"mobno\"]")).sendKeys("9511221032");
WebElement list1=driver.findElement(By.xpath("//td[text()='Date of Birth']/..//select[1]"));
Select j=new Select (list1);
j.selectByIndex(29);
WebElement list2 = driver.findElement(By.xpath("//td[text()='Date of Birth']/..//select[2]"));
Select k=new Select (list2);
k.selectByIndex(7);
WebElement list3=driver.findElement(By.xpath("//td[text()='Date of Birth']/..//select[3]"));
Select l=new Select (list3);
l.selectByIndex(27);

driver.findElement(By.xpath("//input[@value=\"m\"]")).click();
driver.findElement(By.xpath("//select[@id=\"country\"]/..//option[@label=\"India\"]")).click();
driver.findElement(By.xpath("//select[@onchange=\"showothcity();fieldTrack(this);\"]/..//option[@label=\"Other\"]")).click();
driver.findElement(By.xpath("//input[@class=\"submitbtn\"]")).click();	}

}
