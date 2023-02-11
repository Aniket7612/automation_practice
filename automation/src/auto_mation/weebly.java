package auto_mation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class weebly {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\DELL\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get(("https://www.amazon.in/s?k=login+amazon+account&adgrpid=59671903835&ext_vrnc=hi&gclid=Cj0KCQiA64GRBhCZARIsAHOLriKAJ0nEVUTldRXUNa4S0eAvB9JZiuIbvYCXexZOJIMccmDORgsVYUAaApuSEALw_wcB&hvadid=398134035836&hvdev=c&hvlocphy=9299869&hvnetw=g&hvqmt=e&hvrand=6374607404969529128&hvtargid=kwd-837441119212&hydadcr=24542_1971411&tag=googinhydr1-21&ref=pd_sl_2cwzc6x246_e"));
			
		driver.findElement(By.xpath("//div[@class=\"nav-line-1-container\"]")).click();
	     driver.findElement(By.xpath("//a[@class=\"a-button-text\"]")).click();
	   //  driver.findElement(By.xpath("//input[@class=\"a-button-input\"]")).click();
	   //  driver.findElement(By.xpath("//input[@class=\"a-input-text a-span12 auth-autofocus auth-required-field\"]")).sendKeys("shub@111");
	     //driver.findElement(By.xpath("(//input[@class=\"a-button-input\"][1])[1]")).click();
driver.findElement(By.xpath("//input[@class=\"a-input-text a-span12 auth-autofocus auth-required-field\"]")).sendKeys("shubham wakode");
driver.findElement(By.xpath("//input[@class=\"a-input-text a-span12 a-spacing-micro auth-required-field auth-require-claim-validation\"]")).sendKeys("9511223344");
driver.findElement(By.xpath("//input[@class=\"a-input-text a-span12 auth-required-field auth-require-fields-match auth-require-password-validation\"]")).sendKeys("shyyyyy");
driver.findElement(By.xpath("//input[@class=\"a-input-text a-span12 auth-required-field auth-require-fields-match\"]")).sendKeys("shyyyyy");
driver.findElement(By.xpath("//input[@class=\"a-button-input\"]")).click();
	}

}
