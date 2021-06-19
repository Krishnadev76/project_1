package com.project.Finalproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven1 {
	//
	// public static void particular_Data() throws IOException,
	// InvalidFormatException {
	//
	// File f = new
	// File("C:\\Users\\Krishna\\OneDrive\\Desktop\\Student_Details.xlsx");
	//
	// FileInputStream fis = new FileInputStream(f);
	//
	// Workbook wb = new XSSFWorkbook(fis);
	//
	// Sheet sheetAt = wb.getSheetAt(0);
	//
	// Row row = sheetAt.getRow(1);
	//
	// Cell cell = row.getCell(0);
	//
	// CellType cellType = cell.getCellType();
	//
	// if (cellType.equals(CellType.STRING)) {
	//
	// // string
	//
	// String stringCellValue = cell.getStringCellValue();
	//
	// System.out.println(stringCellValue);
	//
	// }
	//
	// else if (cellType.equals(CellType.NUMERIC)) {
	//
	// double numericCellValue = cell.getNumericCellValue();
	//
	// // double to int
	//
	// int value = (int) numericCellValue; // narrowing type casting
	//
	// System.out.println(value);
	//
	// }
	//
	// }

	public static void all_Data() throws Throwable {

		File f = new File("C:\\Users\\Krishna\\OneDrive\\Desktop\\Student_Details.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheetAt = wb.getSheetAt(0);

		int row_Size = sheetAt.getPhysicalNumberOfRows();

		for (int i = 0; i < row_Size; i++) {

			Row row = sheetAt.getRow(i);

			int cell_Size = row.getPhysicalNumberOfCells();

			for (int j = 0; j < cell_Size; j++) {

				Cell cell = row.getCell(j);

				CellType cellType = cell.getCellType();

				if (cellType.equals(CellType.STRING)) {

					String stringCellValue = cell.getStringCellValue();

					System.out.println(stringCellValue);
				}

				else if (cellType.equals(CellType.NUMERIC)) {

					double numericCellValue = cell.getNumericCellValue();

					int value = (int) numericCellValue; // narrowing type casting

					System.out.println(value);

				}

			}

		}

	}

	public static void main(String[] args) throws Throwable {

		// particular_Data();

		all_Data();

	}

}
