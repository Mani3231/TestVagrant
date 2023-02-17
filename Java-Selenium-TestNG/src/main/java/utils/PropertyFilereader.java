package utils;

import java.io.FileReader;
import java.util.Properties;

public class PropertyFilereader {
	public static String getProperty(String propertyName) {
		Properties p = new Properties();
		String property = null;
		try {
			String filePath = System.getProperty("user.dir") + "/src/main/resources/config.properties";
			FileReader file;
			file = new FileReader(filePath);
			p.load(file);
			property = p.getProperty(propertyName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return property;
	}


}
