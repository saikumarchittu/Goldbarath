package GenericUtility;

import java.io.FileInputStream;
import java.util.Properties;

      public class Propertyutility {
      public String getDataFromproperty(String key) throws Exception 
  {
	  FileInputStream fis=new FileInputStream(IConstants.propertiesfilepath);
      Properties prop=new Properties();
      prop.load(fis);
      String value=prop.getProperty(key);
      return value;
  }
}