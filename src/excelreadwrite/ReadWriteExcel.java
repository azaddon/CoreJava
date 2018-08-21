package excelreadwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ReadWriteExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        File file = new File("C:\\\\Users\\\\mohdazad.khan\\\\Desktop\\\\UpdatedSkill.xlsx");
		FileInputStream file1 = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(file1);
		Sheet sheet = workbook.getSheetAt(0);
		Iterator<Row> rowIterator = sheet.iterator();
		while(rowIterator.hasNext()) {
			Row row =rowIterator.next();
		
		Iterator<Cell> cellIterator = row.cellIterator();
		while(cellIterator.hasNext()) {
			Cell cell =cellIterator.next();
			 switch (cell.getCellType()) {
             case Cell.CELL_TYPE_NUMERIC:
                 System.out.print(cell.getNumericCellValue() + "t");
                 break;
             case Cell.CELL_TYPE_STRING:
                 System.out.print(cell.getStringCellValue() + "t");
                 break;
             }
		}
		System.out.println("");
		}
	}

}
