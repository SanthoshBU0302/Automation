package base;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel extends Base_Script{
	public static String readdata(String sheetname, int row, int cell) throws Exception
	{
		FileInputStream fis=new FileInputStream(excel_path);
		Workbook book=WorkbookFactory.create(fis);
		Cell value = book.getSheet(sheetname).getRow(row).getCell(cell);
		String val = value.getStringCellValue();
		return val;
	}

}
