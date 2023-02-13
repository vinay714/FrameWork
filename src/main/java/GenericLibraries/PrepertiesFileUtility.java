package GenericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/*
 * The class contains reusable method to perform operations on properties file
 * 
 */

public class PrepertiesFileUtility {
	private Properties property;

	/*
	 * This method is used to initialize properties file
	 */

	public void propertyFileInitilzation(String filepath) {
		FileInputStream fil = null;

		try {
			fil = new FileInputStream(filepath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		property = new Properties();

		try {
			property.load(fil);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*
	 * this method returns the data from properties file based on key we passed
	 */
	public String fetchProperty(String key) {
		return property.getProperty(key);

	}
}
