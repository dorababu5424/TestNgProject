package config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperities {
	
	
	public static Properties p;
	private static String PropertiesPath = "C:\\Users\\dorab\\eclipse-workspace\\SeleniunTestNg\\src\\main\\resources\\Files\\config.properties";
	
	public static String ReadData(String Data) throws IOException {
		
		File f = new File(PropertiesPath);
		FileInputStream fil = new FileInputStream(f);
		p = new Properties();
		p.load(fil);
		String ReadData = p.getProperty(Data);
		return ReadData;
	}

}
