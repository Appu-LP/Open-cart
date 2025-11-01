package DataFromExcelFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class AllDataFromExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		
		File file = new File("C:\\Users\\jeeva\\OneDrive\\Documents\\Selenium data Driven\\Book1.xlsx");
		

		FileInputStream fileInput=new FileInputStream(file);
		
		Workbook workbook = WorkbookFactory.create(fileInput);
		
		Sheet sheet = workbook.getSheet("Sheet1");
		int LastRow = sheet.getLastRowNum()+1;
		System.err.println(LastRow);

	    Row row = sheet.getRow(1);
		short LastCell = row.getLastCellNum();
		System.out.println(LastCell);

		Cell cell = row.getCell(2);
/////////////////////////////////////////////////////direct Method//////////
		
		
		
		for(int i=0;i<LastRow;i++) {
			System.out.println("****The "+i+"th Data");
			//for(int j =0;j<LastCell;j++)  it is for eqaual row & cell {
			for(int j =0;j<sheet.getRow(i).getLastCellNum();j++) {
				
				Row row1=sheet.getRow(i);
				Cell cell1=row1.getCell(j);
				DataFormatter data = new DataFormatter();
				String value = data.formatCellValue(cell1);
				System.out.println(value);
			}
			

		}
		
		
//////////////////////////////////////***********************indirect method//////////////////		
//		String email = cell.getStringCellValue();
//		System.out.println(email);
//		
//		
//		Row row1 = sheet.getRow(1);
//		Cell cell1 = row1.getCell(1);
//		int password=(int) cell1.getNumericCellValue();
//		System.out.println(password);
//		
//		Row row2 = sheet.getRow(1);
//		Cell cell2 = row2.getCell(2);
//		String browser = cell2.getStringCellValue();
//		System.out.println(browser);
//		
//		Row row3 = sheet.getRow(1);
//		Cell cell3 = row3.getCell(3);
//		boolean Boolean = cell3.getBooleanCellValue();
//		System.out.println(Boolean);
		
		
		
	}

}
