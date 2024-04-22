package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	public static Properties properties;
	
	static {
		
		properties = new Properties();
		
		
		try {
			FileInputStream fis = new FileInputStream("src\\main\\java\\util\\config.properties");
			properties.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
			
		}
	
	
	public static String getProperty(String key) {
		return properties.getProperty(key);

	}
		
	
		
	}


