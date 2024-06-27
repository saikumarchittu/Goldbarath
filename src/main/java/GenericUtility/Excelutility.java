package GenericUtility;

import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelutility {
	public String getdataFromExcel(String sheetname,int rownum,int cellno ) throws Exception {
         FileInputStream fis=new FileInputStream(IConstants.excelfilepath);
         Workbook book=WorkbookFactory.create(fis);
		 String value= book.getSheet(sheetname).getRow(rownum).getCell(cellno).getStringCellValue();
		 return value;
}
}