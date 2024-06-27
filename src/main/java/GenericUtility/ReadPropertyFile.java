package GenericUtility;

import java.io.FileReader;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) throws Exception {
		FileReader fr=new FileReader("C:\\Users\\Admin\\eclipse-workspace\\FrameWorks\\src\\test\\resources\\Config\\config.properties");
		Properties p=new Properties();
		p.load(fr);

	}

}
