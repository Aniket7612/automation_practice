package auto_mation;



	package test_1;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.sql.Date;
	import java.time.LocalDateTime;
	import java.time.format.DateTimeFormatter;

	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.hwpf.usermodel.DateAndTime;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.network.model.Response;
import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.io.FileHandler;

	public class Ecom extends Response

	{
		
		public void login() throws FileNotFoundException, IOException, EncryptedDocumentException, InterruptedException
		{
			System.setProperty("webdriver.gecko.driver","E:\\Java\\Automation\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			
			driver.get("https://www.amazon.in");
				
			driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_ya_signin']")).click();
			
			driver.findElement(By.cssSelector("#ap_email")).sendKeys(Username());          //username input
			driver.findElement(By.cssSelector("span#continue")).click();
			
			driver.findElement(By.cssSelector("#ap_password")).sendKeys(Password());          //password input
			driver.findElement(By.cssSelector("#signInSubmit")).click();
			Thread.sleep(20000);
			
							//enter OTP
			driver.findElement(By.cssSelector("#auth-signin-button")).click();
			//driver.findElement(By.cssSelector("#auth-get-new-otp-link")).click();       //resend OTP
			//driver.findElement(By.cssSelector("#auth-send-code")).click();
			//driver.findElement(By.cssSelector("#auth-signin-button")).click();   
			
			//driver.get("https://www.amazon.in");

			driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys(Product());        //product name input
			driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
			
			driver.findElement(By.xpath("//span[text()='Mamaearth Natural Nourishing Bathing Soap – 5x75g']")).click();
			driver.findElement(By.cssSelector("#a-autoid-0-announce")).click();
			driver.findElement(By.cssSelector("#nav-cart")).click();
			
		}

		private CharSequence Password() {
			// TODO Auto-generated method stub
			return null;
		}

		private CharSequence Username() {
			// TODO Auto-generated method stub
			return null;
		}

		private CharSequence Product() {
			// TODO Auto-generated method stub
			return null;
		}
		

	

	}


