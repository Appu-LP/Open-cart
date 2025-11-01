package DataFromExcelFile;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFile {

	public static void main(String[] args) throws Throwable {

		File file = new File("");
		FileInputStream fileInput = new FileInputStream(file);
		Workbook book = WorkbookFactory.create(fileInput);
	
		Sheet sheet = book.getSheet("");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		
		DataFormatter data = new DataFormatter();
		String c2 = data.formatCellValue(cell);
		System.out.println(c2);
	}

}
