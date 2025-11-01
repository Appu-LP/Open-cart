package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ProportiesFileUtility {

	public String ReadProportiesData(String key) throws Throwable {
        File file = new File("C:\\Users\\jeeva\\OneDrive\\Documents\\Selenium data Driven\\Data.properties");
		
		FileInputStream fileinput=new FileInputStream(file);
		
		Properties pro=new Properties();
		pro.load(fileinput);
		String value=pro.getProperty(key);
		return value;
		}
}