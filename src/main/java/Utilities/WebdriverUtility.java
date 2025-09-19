package Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WebdriverUtility {
	private static final String String = null;

	public void getDataFromExcelFile() throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\OneDrive\\Desktop\\Selenium Wrokspace\\mockProject\\src\\test\\resources\\testdatamock.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
//		String value = wb.getSheet(String).getRow(int).getCell(int).getStringCellValue();
//		String pwd = wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		
		wb.close();
		
	}

}
