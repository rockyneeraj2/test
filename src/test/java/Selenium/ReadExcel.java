package Selenium;


public class ReadExcel {

    /*

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcel {

    public static void main(String[] args) throws IOException {

        String filePath = "TestData.xlsx";
        FileInputStream fis = new FileInputStream(filePath);

        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet("Sheet1");

        int rowCount = sheet.getPhysicalNumberOfRows();

        for (int i = 0; i < rowCount; i++) {

            Row row = sheet.getRow(i);
            int colCount = row.getPhysicalNumberOfCells();

            for (int j = 0; j < colCount; j++) {

                Cell cell = row.getCell(j);

                switch (cell.getCellType()) {
                    case STRING:
                        System.out.print(cell.getStringCellValue() + "  ");
                        break;

                    case NUMERIC:
                        System.out.print(cell.getNumericCellValue() + "  ");
                        break;

                    case BOOLEAN:
                        System.out.print(cell.getBooleanCellValue() + "  ");
                        break;

                    default:
                        System.out.print("  ");
                }
            }
            System.out.println();
        }

        workbook.close();
        fis.close();
    }
}


     */
}
