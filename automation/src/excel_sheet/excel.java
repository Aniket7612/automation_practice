package excel_sheet;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.batik.anim.AnimationException;
import org.apache.commons.compress.harmony.pack200.NewAttributeBands.Call;
import org.apache.commons.math3.analysis.function.Ceil;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel
{
public static void main(String[] args) throws EncryptedDocumentException,IOException 

{
	FileInputStream file = new FileInputStream("‪C:\\Users\\DELL\\Desktop\\Book2.xlsx"); 

   String ani= WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue(); 
System.out.println(ani);


}
}