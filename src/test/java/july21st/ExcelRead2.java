package july21st;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead2 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("D:\\K.Ramesh\\Selenium class\\Demo.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet ws=wb.getSheet("Sheet2");
		
		//System.out.println(ws.getLastRowNum());
		
		//System.out.println(ws.getPhysicalNumberOfRows());
		
		System.out.println(ws.getRow(2).getLastCellNum());
		
		Row row=null;
		
		for(int i=0;i<=ws.getLastRowNum();i++)
		{
			row=ws.getRow(i);
			
			for(int j=0;j<row.getLastCellNum();j++)
			{
				
			if(row.getCell(j).getCellType()==CellType.STRING)
			{
				System.out.println(row.getCell(j).getStringCellValue()+"is a String");
			}
			
			else if(row.getCell(j).getCellType()==CellType.NUMERIC)
			{
				System.out.println(row.getCell(j).getNumericCellValue()+"is a number");
			}
			
			else if(row.getCell(j).getCellType()==CellType.BOOLEAN)
			{
				System.out.println(row.getCell(i).getStringCellValue()+"is a Boolean");
				
				
			}
		}
		
		System.out.println("end of program");
		}
	}
}

	


