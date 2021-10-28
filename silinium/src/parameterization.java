//   HOw to featch the data from excel Sheet  ...........?/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class parameterization {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\Dhairyasheel\\OneDrive\\Desktop\\mall.xlsx";
		FileInputStream file = new FileInputStream(path);	
    //  For Alphabates values
	//	String values = WorkbookFactory.create(file).getSheet("Sheet1").getRow(5).getCell(2).getStringCellValue();
	//  for Numeric data display
//		double values = WorkbookFactory.create(file).getSheet("Sheet1").getRow(5).getCell(2).getNumericCellValue();
		Sheet values = WorkbookFactory.create(file).getSheet("Sheet1");
		System.out.println(values);

	}

}
