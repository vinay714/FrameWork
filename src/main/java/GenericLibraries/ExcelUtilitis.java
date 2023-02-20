package GenericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * this class contains reusable method to perform operation on excel
 * 
 * @author Vinay Kumar G S
 *
 */

public class ExcelUtilitis {
	private Workbook wb;

	/**
	 * this method use to initilize workbook
	 * 
	 * @param excelPath
	 */

	public void excelInitilization(String excelPath) {
		FileInputStream fil=null;

		try {
			fil = new FileInputStream(excelPath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			wb = WorkbookFactory.create(fil);
		} catch (EncryptedDocumentException | IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * This method use to fetch single data from excel
	 * 
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @return
	 */

	public String fetchDataFromExcel(String sheetName, int rowNum, int cellNum) {
		
		return wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();

	}

	/**
	 * This method use to fetch multiple data from excel
	 * 
	 * @param sheetName
	 * @return
	 */

	public List<String> fetchDataFromExcel(String sheetName) {

		List<String> dataList = new ArrayList<>();

		Sheet sheet = wb.getSheet(sheetName);
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			String data = sheet.getRow(i).getCell(1).getStringCellValue();
			dataList.add(data);
		}

		return dataList;
	}

	/**
	 * This method use to close the workbook
	 */

	public void closeExcel() {

		try {
			wb.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
