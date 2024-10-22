package functions;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Excel {
	
//		String path = "./data/inputArray.xlsx";
//		int row =0;
//		int col =0;
//		String sheetName = "Integers";
		public static int getData(String path,String sheetName,int row,int col)
		{
			int v=0;
			try
			{
				Workbook wb = WorkbookFactory.create(new FileInputStream(path));
				double a = wb.getSheet(sheetName).getRow(row).getCell(col).getNumericCellValue();
				/*this is the only way to get the int value. getNumericCellValue is double so to 
				 convert double to int downcasting needs to be done */
				v=(int)a;
				wb.close();
				
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return v;
		}

		public static int getSize(String path,String sheetName)
		{
			try
			{
				Workbook wb = WorkbookFactory.create(new FileInputStream(path));
				int r=wb.getSheet(sheetName).getLastRowNum();
				return r+1;
			}
			catch(Exception e)
			{
				e.printStackTrace();
				return 0;
		}
	
	
		}
}

