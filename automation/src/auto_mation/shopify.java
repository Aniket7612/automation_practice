package auto_mation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class shopify {
public static void main(String[ ] args)
{
	System.setProperty("webdriver.edge.driver", "C:\\Users\\DELL\\Downloads\\edgedriver_win64//msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.shopify.in/free-trial/ecommerce/short?term=e-commerce%20webshop&adid=566072831179&campaignid=15433369092&gclid=CjwKCAiAgvKQBhBbEiwAaPQw3K2G7tegHt64oGS3I3yy9umYXr51Z0g1zSaEhBRbxTo9nsMMBLYhHBoCUVMQAvD_BwE&cmadid=516585705;cmadvertiserid=10730501;cmcampaignid=26990768;cmplacementid=324494758;cmcreativeid=163722649;cmsiteid=5500011");
	driver.findElement(By.xpath("//input[@class=\"marketing-input-button-pair__input marketing-input marketing-input--floating\"]")).sendKeys("shubhamww@gmail.com");
	//driver.findElement(By.xpath("//button[@class=\"marketing-button marketing-form__button marketing-input-button-pair__button free-trial__button\"]")).click();
	driver.findElement(By.xpath("(//input[@class=\"marketing-input marketing-input--floating\"][1])[1]")).sendKeys("shubham@11.com");
	}

}
