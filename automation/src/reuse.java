
public class reuse {
	package Test_First;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.IOException;

	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.io.FileHandler;

	public class Reuse 
	{
		public String Username() throws EncryptedDocumentException, IOException
		{
			FileInputStream file = new FileInputStream("E:\\Java\\Automation\\Book1.xlsx");
			String Username = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
			System.out.println(Username);
			return Username;
		}
		public String Password() throws EncryptedDocumentException, IOException
		{
			FileInputStream file = new FileInputStream("E:\\Java\\Automation\\Book1.xlsx");
			String Password = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
			System.out.println(Password);
			return Password;
		}
		public String Product() throws EncryptedDocumentException, IOException
		{
			FileInputStream Prod = new FileInputStream("E:\\Java\\Automation\\Book1.xlsx");
			String Product = WorkbookFactory.create(Prod).getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
			System.out.println(Product);
			return Product;
		}

		
		

	}

	}

}
