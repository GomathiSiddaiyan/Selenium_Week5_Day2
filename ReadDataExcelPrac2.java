package week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataExcelPrac2 {
	public static void main(String[] args) throws IOException {
		// ReadDataExcelPrac
		// stepl: Set up the path for the excel workbook
		XSSFWorkbook wb = new XSSFWorkbook("./ExcelFolderMaven/CreateLead.xlsx");

		// step2: get into Worksheet
		XSSFSheet ws = wb.getSheet("Sheet1");

		// Step3: get into row
//		XSSFRow row = ws.getRow(1);
		int rowCount = ws.getLastRowNum();

		// Step4: get into cell
//		XSSFCell cell = row.getCell(0);
		int cellCount = ws.getRow(rowCount).getLastCellNum();

//		Declare 2D string array
		String[][] data= new String[rowCount][cellCount];
		

		// Step5: To read the string data
		for (int i = 1; i <= rowCount; i++) {
			System.out.println("Values present in Row " + i + ": ");
			for (int j = 0; j < cellCount; j++) {
				String textData = ws.getRow(i).getCell(j).getStringCellValue();
				System.out.println(textData);
				data[i-1][j]= textData;
			}

		}

		/*
		 * int rowCount = ws.getLastRowNum(); System.out.println("The Row Size: " +
		 * rowCount);
		 * 
		 * for (int i = 1; i <= rowCount; i++) { int cellCount =
		 * ws.getRow(i).getLastCellNum();
		 * 
		 * for (int j = 0; j <= cellCount; j++) { String text =
		 * ws.getRow(i).getCell(j).getStringCellValue(); System.out.println(text); } }
		 */

		wb.close();

	}

}
