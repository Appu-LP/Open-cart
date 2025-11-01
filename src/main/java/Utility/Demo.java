package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws Throwable {

		ChromeDriver driver = new ChromeDriver();
		File file = new File("");
		
		FileInputStream input = new FileInputStream(file);
//		
//		Workbook workbook = WorkbookFactory.create(input);
//		
//		Sheet sheet = workbook.getSheet("");
//		
//		Row row = sheet.getRow(0);
//		
//		Cell cell = row.getCell(0);
//		
//		
//		DataFormatter data = new DataFormatter();
//		String value = data.formatCellValue(cell);
//		System.out.println(value);
		
		Properties pro = new Properties();
		pro.load(input);
		String name = pro.getProperty("");
		System.out.println(name);
	}
}
