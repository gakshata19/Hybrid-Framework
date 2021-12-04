package Com.UtilsLayer;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	public ExcelReader() {
		File f=new File("C:\\Users\\akshatag\\Desktop\\Automation\\User.xlsx");
		System.out.println(f.exists());
		try {
			fis=new FileInputStream(f);
			wb= new XSSFWorkbook(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getData(int sheetIndex, int row, int col) {
		sheet=wb.getSheetAt(sheetIndex);
		String data=sheet.getRow(row).getCell(col).getStringCellValue();
		return data;
	}
	
	public int rowCount(int sheetIndex) {
		int rowcount=wb.getSheetAt(sheetIndex).getLastRowNum();
		rowcount=rowcount+1;
		return rowcount;
	}
	
	public int colCount(int sheetIndex) {
		int column=wb.getSheetAt(sheetIndex).getRow(0).getLastCellNum();
		return column;
	}
}	
