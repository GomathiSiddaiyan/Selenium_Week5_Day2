package week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataExcelPrac {
	public static void main(String[] args) throws IOException {
		// ReadDataExcelPrac
		// Step l: Set up the path for the excel workbook
		XSSFWorkbook wb = new XSSFWorkbook("./ExcelFolderMaven/CreateLead.xlsx");

		// Step 2: get into Worksheet
		XSSFSheet ws = wb.getSheet("Sheet1");

		// Step 3: get into row
//		XSSFRow row = ws.getRow(1);
		int rowCount = ws.getLastRowNum();

		// Step 4: get into cell
//		XSSFCell cell = row.getCell(0);
		int cellCount = ws.getRow(rowCount).getLastCellNum();

//		String textData =cell.getStringCellValue();
//		System.out.println("Values present in Cell: " + textData);

		// Step 5: To read the string data
		for (int i = 1; i <= rowCount; i++) {
			System.out.println("Values present in Row " + i + ": ");
			for (int j = 0; j < cellCount; j++) {
				String textData = ws.getRow(i).getCell(j).getStringCellValue();
				System.out.println(textData);

			}

		}

		wb.close();

	}

}
