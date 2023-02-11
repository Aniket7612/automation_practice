package auto_mation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;



public class rediffmail {

	
	
	public static void main(String[] args) 
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			WebDriver jk=new FirefoxDriver();
			
	jk.get("https://www.rediff.com/");
	
	jk.findElement(By.xpath("//*[text()=\"Create Account\"]")).click();
	jk.findElement(By.xpath("//input[@id='mobno']")).sendKeys("9511221032");
	jk.findElement(By.xpath("(//input[@type='text'][1])[1]")).sendKeys("shubham wakode");
	
	
	jk.findElement(By.xpath("//td[text()='Alternate Email Address']/..//input[@onblur=\"fieldTrack(this);\"]")).sendKeys("shubhamwk@gmail.com");
	jk.findElement(By.xpath("//td[text()=\"Choose a Rediffmail ID\"]/..//input[@onblur=\"fieldTrack(this);\"]")).sendKeys("wakode_shubham");
	jk.findElement(By.xpath("//input[@class=\"btn_checkavail\"]")).click();
//	jk.findElement(By.xpath("//input[@class=\"btn_checkavail\"]"));
	
	jk.findElement(By.xpath("(//input[@type='password'][1])[1]")).sendKeys("shub@123");
	
	jk.findElement(By.xpath("(//input[@type='password'][1])[2]")).sendKeys("shub@123");
	
	
    WebElement list1 = jk.findElement(By.xpath("//td[text()='Date of Birth']/..//select[1]"));
	
	Select k= new Select (list1);
	
	k.selectByIndex(29);
	  WebElement list2= jk.findElement(By.xpath("//td[text()='Date of Birth']/..//select[2]"));
	  Select j=new Select(list2);
	  j.selectByIndex(8);
	  
	  WebElement list3= jk.findElement(By.xpath("//td[text()='Date of Birth']/..//select[3]"));
	Select p=new Select(list3);
	p.selectByIndex(28);
	
	
	
	jk.findElement(By.xpath("//input[@value='m']")).click();
	
	jk.findElement(By.xpath("//select[@id=\"country\"]/./option[@label=\"India\"]")).click();
	
	jk.findElement(By.xpath("//select[@onchange=\"showothcity();fieldTrack(this);\"]/./option[@label=\"Other\"]")).click();
	
	jk.findElement(By.xpath("//input[@onclick=\"if(this.value == 'Enter your city here' ) this.value='';\"]")).sendKeys("Amravati");
	
	jk.findElement(By.xpath("//input[@class=\"captcha\"]")).sendKeys("LKBK");
	
	jk.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	
	jk.close();
	
	jk.findElement(By.xpath("//td[text()=\"Choose a Rediffmail ID\"]/..//input[@onblur=\"fieldTrack(this);\"]")).sendKeys("12345678");
	

	}

	
	
}


