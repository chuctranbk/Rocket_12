package com.vti.MavenDemo.utils.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MessageProperties {
	public static final String RESOURCE_PATH = "C:\\Users\\Admin\\eclipse-workspace\\MavenDemo\\src\\main\\java\\resource\\Database.property";
	private Properties properties;
	
	public MessageProperties() throws FileNotFoundException, IOException {
		properties = new Properties();
		properties.load(new FileInputStream(RESOURCE_PATH));
		// ko xu ly ngoai le database
	}
	
	public String getValue(String key) {
		return properties.getProperty(key);
	}
}
