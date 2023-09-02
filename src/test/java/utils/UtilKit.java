package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UtilKit {
	
	static FileInputStream fis;
	
	public static HashMap<String,String> getTestData(String testcase) throws IOException
	{
		fis=new FileInputStream("src\\test\\resources\\TestData\\Excels\\Adactin Master Test Data.xlsx");
		
		XSSFWorkbook wb=null;
		
	 wb=new XSSFWorkbook(fis);
	 
	 XSSFSheet ws= wb.getSheet("com.adactin");
	 
	 ArrayList<Row> testCaseRows=getTestCaseRows(ws,testcase);
	 
	 HashMap<String, String> testDataMap= new HashMap<String, String>();
	 
	 for(int i=0;i<testCaseRows.size();i++)
	 {
		 int noOfCells=testCaseRows.get(0).getLastCellNum();
		 
		 for(int j=1;j<noOfCells;j++)
		 {
			 testDataMap.put(testCaseRows.get(0).getCell(j).getStringCellValue(), testCaseRows.get(i).getCell(j).getStringCellValue());
		 }
	 }
		
		
		return testDataMap;
	}

	private static ArrayList<Row> getTestCaseRows(XSSFSheet ws, String testcase) {
		
		
		ArrayList<Row> allRows=new ArrayList<Row>();
		
		for(int i=0;i<ws.getLastRowNum();i++)
		{
			if(ws.getRow(i)!=null)
			{
				allRows.add(ws.getRow(i));
			}
		}
		
		ArrayList<Row> testCaseRows=new ArrayList<Row>();
		
		for(int i=0;i<allRows.size();i++)
		{
			if(allRows.get(i).getCell(0).getStringCellValue().equalsIgnoreCase(testcase))
			{
				testCaseRows.add(allRows.get(i));
			}
		}
		
		
		return testCaseRows;
		
		
		
	}

}
