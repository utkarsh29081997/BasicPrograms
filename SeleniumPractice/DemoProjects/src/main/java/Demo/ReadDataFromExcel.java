package Demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public void readExcel(String filepath, String filename, String SheetName) throws IOException {

		File file = new File(filepath + "\\" + filename);

		FileInputStream fip = new FileInputStream(file);
		Workbook wb = null;
		String fileextn = filename.substring(filename.indexOf("."));

		if (fileextn.equalsIgnoreCase(".xlsx")) {
			wb = new XSSFWorkbook(fip);
		}

		Sheet wbSheet = wb.getSheet(SheetName);

		int rowCount = wbSheet.getLastRowNum() - wbSheet.getFirstRowNum();

		for (int i = 0; i < rowCount; i++) {
			Row row = wbSheet.getRow(i);
			for (int j = 0; j < row.getLastCellNum(); j++) {
				System.out.print(row.getCell(j).getStringCellValue() + "||");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) throws IOException {

		ReadDataFromExcel readData = new ReadDataFromExcel();
		String path = System.getProperty("user.dir") + "\\Data";
		readData.readExcel(path, "SampleData.xlsx", "GDP");

	}

}
