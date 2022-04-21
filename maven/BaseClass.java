package com.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.Spring;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	static WebDriver driver;
	static Actions action;
	public static void browserconfigchrome() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
        
}
	public static void openurl(String url) {
		driver .get(url);
	}
	public static void maximizewindow() {
		driver.manage().window().maximize();
	}
	public static  WebElement locatedId(String id) {
		WebElement findElement = driver.findElement(By.id(id));
		return findElement;
	}
	public static WebElement locatedbyname(String name) {
		WebElement findelement=driver.findElement(By.name(name));
		return findelement;
	}
    public static void inputtext(WebElement element,String value) {
    	element.sendKeys(value);
    }
    public static void click(WebElement element) {
    	element.click();
    } 
    public static void tittle() {
    	String title = driver.getTitle();
	}
    public static void current() {
    	String currentUrl = driver.getCurrentUrl();
	}
    public static void getText(WebElement element,String value) {
    element.getAttribute(value);
    System.out.println(value);
	}
    public static void locatedIdxpath(String name) {
    	WebElement txtname = driver.findElement(By.xpath(name));
    }
    public static void mouseaction(WebElement element) {
    	action=new Actions(driver);
    	action.moveToElement(element).perform();
	}
    public static void navigateto(String url) {
    	driver.navigate().to(url);
	}
    public static void navigateforward() {
    driver.navigate().forward();
    }
    public static void dropdownByindex(WebElement element,int value) {
    	Select select = new Select(element);
    	select.selectByIndex(value);
    	System.out.println(value);
    	
	}
    public static void dropdownByvalue(WebElement element,String value) {
    	Select select = new Select(element);
    	select.selectByValue(value);
    	System.out.println(value);
    	
	}
    public static void dropdownByVisibletext(WebElement element,String value) {
    	Select select = new Select(element);
    	select.selectByVisibleText(value);
    	System.out.println(value);
    	
	}
    public void dragandrop(WebElement source,WebElement target) {
    Actions actions=new Actions(driver);
    action.dragAndDrop(source,target).perform();
    }
    
    public static String excelRead(String path, String sheet, int rowIndex, int
    		cellIndex) throws IOException {
    		String value = null;
    		File file = new File(path);
    		FileInputStream fin = new FileInputStream(file);
    		Workbook workbook = new XSSFWorkbook(fin);
    		org.apache.poi.ss.usermodel.Sheet s = workbook.getSheet(sheet);
    		Row row = s.getRow(rowIndex);
    		org.apache.poi.ss.usermodel.Cell cell = row.getCell(cellIndex);
    		CellType celltype = cell.getCellType();
    		System.out.println("CellTpe:"+ celltype);
    		switch (celltype) {
    		case STRING:
    		value = cell.getStringCellValue();
    		System.out.println(value);
    		break;
    		case NUMERIC:
    		if (DateUtil.isCellDateFormatted(cell)) {
    		java.util.Date date = cell.getDateCellValue();
    		SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");

    		value = dateformat.format(date);
    		System.out.println(value);
    		} else {
    		double d = cell.getNumericCellValue();
    		long l = (long) d;
    		value = String.valueOf(l);
    		System.out.println(value);
    		break;
    		}
    		default:
    		break;
    		}
    		return value;
    		}
    		public static void excelWrite(String path, String sheet, int row, int cell,
    		String value) throws IOException {
    		File f = new File(path);
    		FileInputStream fin = new FileInputStream(f);
    		Workbook w = new XSSFWorkbook(fin);
    		Sheet s = w.getSheet(sheet);
    		Row r = s.getRow(row);
    		org.apache.poi.ss.usermodel.Cell c = r.getCell(cell);
    		c.setCellValue(value);

    		FileOutputStream fout = new FileOutputStream(f);
    		w.write(fout);
    		}
    	
}


