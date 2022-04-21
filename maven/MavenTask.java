package com.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MavenTask  {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\Ajith\\OneDrive\\Desktop\\aji\\project\\Mavenproject\\exel\\madven1.xlsx");
		FileInputStream fin = new FileInputStream(file);
		Workbook w = new XSSFWorkbook(fin);
		
		Sheet s = w.getSheet("sheet1");
		
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++){
			
			Row row = s.getRow(i);
			for (int j = 0; j <row.getPhysicalNumberOfCells(); j++){
				Cell cell = row.getCell(j);
//				System.out.println(cell);
			
			CellType type = cell.getCellType();
			switch (type) {
			case STRING:
				String text=cell.getStringCellValue();
				System.out.println(text);
             break;
			
			case NUMERIC:
		double d = cell.getNumericCellValue();
			BigDecimal b = BigDecimal.valueOf(d);
				String num = b.toString();
				System.out.println(num);
             break;
			case BOOLEAN:
				if(DateUtil.isCellDateFormatted(cell)){
					Date date = cell.getDateCellValue();
					SimpleDateFormat dateformat=new SimpleDateFormat("dd-MMM-yy");
					String format = dateformat.format(date);
					System.out.println(format);
					
				}else {	
					double d1 = cell.getNumericCellValue();
     				BigDecimal b1 = BigDecimal.valueOf(d1);
    				String num1 = b1.toString();
					System.out.println(num1);
					
					break;
				}
			default:
					break;
			}
		
			}}}
}


