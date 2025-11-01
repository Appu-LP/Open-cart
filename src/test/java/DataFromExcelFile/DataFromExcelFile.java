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

public class DataFromExcelFile {
	
public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		
		File file = new File("C:\\Users\\jeeva\\OneDrive\\Documents\\Selenium data Driven\\Book1.xlsx");
		

		FileInputStream fileInput=new FileInputStream(file);
		
		Workbook workbook = WorkbookFactory.create(fileInput);
		
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);

		DataFormatter data = new DataFormatter();
		String value = data.formatCellValue(cell);
		System.out.println(value);
		}
}
