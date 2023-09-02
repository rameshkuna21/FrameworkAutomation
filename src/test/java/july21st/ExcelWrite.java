package july21st;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException {
		

		FileInputStream fis=new FileInputStream("D:\\K.Ramesh\\Selenium class\\Demo.xlsx");
		
		XSSFWorkbook wb=	new XSSFWorkbook(fis);
		
		XSSFSheet  ws=wb.getSheet("Sheet1");
		
		//ws.getRow(0).getCell(1).setCellValue("kuna");
		
		//ws.getRow(2).createCell(2).setCellValue("Man of");
		
		ws.createRow(4).createCell(0).setCellValue("new row");
		
		FileOutputStream fos=new FileOutputStream("D:\\K.Ramesh\\Selenium class\\Demo.xlsx");

		wb.write(fos);
		
		fos.close();
		
		System.out.println("End of program");
	}

}
