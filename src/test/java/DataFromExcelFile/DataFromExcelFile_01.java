package DataFromExcelFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataFromExcelFile_01 {

public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		
		File file = new File("C:\\Users\\jeeva\\OneDrive\\Documents\\Selenium data Driven\\Book1.xlsx");
		

		FileInputStream fileInput=new FileInputStream(file);
		
		Workbook workbook = WorkbookFactory.create(fileInput);
		
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);

		String email = cell.getStringCellValue();
		System.out.println(email);
		
		
		Row row1 = sheet.getRow(1);
		Cell cell1 = row1.getCell(1);
		int password=(int) cell1.getNumericCellValue();
		System.out.println(password);
		
		Row row2 = sheet.getRow(1);
		Cell cell2 = row2.getCell(2);
		String browser = cell2.getStringCellValue();
		System.out.println(browser);
		
		Row row3 = sheet.getRow(1);
		Cell cell3 = row3.getCell(3);
		boolean Boolean = cell3.getBooleanCellValue();
		System.out.println(Boolean);
		
		
		}
}
