package auto_mation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;


public class launch2 {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		ChromeOptions shubham=new ChromeOptions();
		
		
		shubham.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
		
		WebDriver driver= new ChromeDriver(shubham);
		   driver.manage().window().maximize();
		     driver.get("https://www.nykaa.com/?s_kwcid=AL!599!3!421089207031!e!!g!!nykaa&ef_id=EAIaIQobChMI2snX6IKj9gIVVllgCh0KFwZiEAAYASAAEgI81fD_BwE:G:s&s_kwcid=AL!599!3!421089207031!e!!g!!nykaa&utm_source=GooglePaid&utm_medium=Search&utm_campaign=Search_Nykaa_New_Users&gclid=EAIaIQobChMI2snX6IKj9gIVVllgCh0KFwZiEAAYASAAEgI81fD_BwE");
	         driver.findElement(By.xpath("//span[text()='Account']")).click();
	      
	         driver.findElement(By.xpath("//input[@placeholder=\"Enter Phone Number or Email\"]")).click();
	         driver.findElement(By.xpath("//input[@name=\"emailMobile\"]")).sendKeys("shubhamwk77@gmail.com");
	        
	         driver.findElement(By.cssSelector("#submitVerification")).click();
	         Thread.sleep(2000);
	         driver.findElement(By.xpath("//input[@name=\"userName\"]")).sendKeys("shubham wakode");
	         driver.findElement(By.xpath("//input[@name=\"phoneNumber\"]")).sendKeys("9511221032");
	         Thread.sleep(2000);
	         driver.findElement(By.xpath("//input[@class=\"input-element secure-font\"]")).sendKeys("Chandu@16");
	         driver.findElement(By.xpath("//button[@class=\"button big fill full mt60 false\"]")).click();
	         Thread.sleep(30000);
	         driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	         Thread.sleep(3000);
	         WebElement serch=driver.findElement(By.xpath("//input[@name=\"search-suggestions-nykaa\"]"));
	         serch.sendKeys("M.A.C. foundation" ,Keys.ENTER);
	         Thread.sleep(1000);
	         driver.findElement(By.xpath("//input[@name=\"search-suggestions-nykaa\"]")).click();
	         //driver.findElement(By.xpath("//div[@class=\"suggestionQuery  css-1asu76k\"][1][1]")).click();
	         driver.findElement(By.xpath("//div[@class=\"css-1rd7vky\"]/..//div[@class=\"css-10zjw4o\"]/..//div[@class=\"css-a7hmoe\"]/..//div[text()='10 shades']")).click();
	         driver.findElement(By.cssSelector("button.css-1w6p6lo")).click();
	       
	         driver.findElement(By.xpath("((//span[text()='ADD TO BAG'][1])[1]")).click();

	}

}
