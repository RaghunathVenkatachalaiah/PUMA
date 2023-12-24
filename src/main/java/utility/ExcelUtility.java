package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	public String readExcelData(String sheetName, int rowNum, int cellNum) throws EncryptedDocumentException, IOException
	{
		File file=new File("E:\\Resources\\TestDataExcel.xlsx");
		FileInputStream fis=new FileInputStream(file);
		
		//In workbook object reference,excel file (or any other file used) is stored
		
		Workbook workbook = WorkbookFactory.create(fis);	//import if showing "ss" model package, don't import from "sl" model package
						
		Sheet sheet=workbook.getSheet("credentials");
		Row row=sheet.getRow(rowNum);
		Cell cell=row.getCell(cellNum);
		DataFormatter formatter=new DataFormatter();
		String value=formatter.formatCellValue(cell);
		return value;
	}

}
