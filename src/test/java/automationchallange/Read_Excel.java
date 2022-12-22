package automationchallange;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.Test;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
@Test
public class Read_Excel {
    final String excelData="./TestData/TestData.xlsx"; //Test data folder location
	public void readExcelData() throws Throwable {
	
		FileInputStream data= new FileInputStream(excelData);//From Java, serelization,to read data
		XSSFWorkbook workbook=new XSSFWorkbook(data); // Class from Apachipoi
		XSSFSheet sheet= workbook.getSheet("testData"); // testData from excelbook of sheet
		Iterator<Row> rowiterator= sheet.iterator(); //Iterator from Java util and Row from Apachipoi
		rowiterator.next(); // Ignore the header
		List<String> list= new ArrayList<String>();//For controll of the bunch of data
		while(rowiterator.hasNext()) {             //Controll for end number of data
			list.add(rowiterator.next().getCell(0).getStringCellValue());
			System.out.println(list);
			
		}
		
	}
	/*final String exlData="";
	public void ExcelData() throws Throwable {
		FileInputStream data=new FileInputStream(exlData);
		XSSFWorkbook workbook=new XSSFWorkbook(data);
		XSSFSheet sheet=workbook.getSheet("testData");
		Iterator<Row> rowiterator=sheet.iterator();
		ArrayList<String> list=new ArrayList<String>();
		while(rowiterator.hasNext()) {
			list.add(rowiterator.next().getCell(0).getStringCellValue());
			System.out.println(list);
		}
				
			
	}*/
	/*final String exlData="";
	public void excelData() throws Throwable {
		FileInputStream data=new FileInputStream(exlData);
		XSSFWorkbook workbook=new XSSFWorkbook(data);
		XSSFSheet sheet= workbook.getSheet("testData");
		Iterator<Row> rowiterator=sheet.iterator();
		ArrayList<String> ar=new ArrayList<String>();
		while(rowiterator.hasNext()) {
			ar.add(rowiterator.next().getCell(0).getStringCellValue());
			System.out.println(ar);
			
		}
		
		
	}*/
	/*final String excelData1="";
	public  void read_excel() throws Throwable {
		FileInputStream data=new FileInputStream(excelData1);
		XSSFWorkbook workbook= new XSSFWorkbook(data);
		XSSFSheet sheet=workbook.getSheet("testData");
		Iterator<Row> rowiterator=sheet.iterator();
		rowiterator.next();
		ArrayList<String> list=new ArrayList<>();
		while(rowiterator.hasNext()) {
			list.add(rowiterator.next().getCell(0).getStringCellValue());
			System.out.println(list);
			
		}
		
		
		
	}*/
	/*final String excelSheet="";
	public void hundleExcel() throws Throwable {
	FileInputStream data= new FileInputStream(excelSheet);
	XSSFWorkbook workbook= new XSSFWorkbook(data);
	XSSFSheet sheet=workbook.getSheet("testData");
	Iterator<Row> rowiterator=sheet.iterator();
	ArrayList<String> list=new ArrayList<String>();
	while(rowiterator.hasNext()) {
		list.add(rowiterator.next().getCell(0).getStringCellValue());
		System.out.println(list);
		
	}
	
	}*/
	/*final String excelSheet="";
	public void readExcel() throws Throwable {
		FileInputStream data=new FileInputStream(excelSheet);
		XSSFWorkbook workbook= new XSSFWorkbook(data);
		XSSFSheet sheet=workbook.getSheet("testData");
		Iterator<Row> rowiterator= sheet.iterator();
		ArrayList<String> list=new ArrayList();
		while(rowiterator.hasNext()) {
			list.add(rowiterator.next().getCell(0).getStringCellValue());
			System.out.println(list);
			
		}
		
				
	}*/
	/*final String excelSheet="";
	public void readExcel() throws Throwable  {
		FileInputStream data= new FileInputStream(excelSheet);
		XSSFWorkbook workbook= new XSSFWorkbook(data);
		XSSFSheet sheet=workbook.getSheet("testData");
		Iterator<Row> rowiterator=sheet.iterator();
		rowiterator.next();
		ArrayList<String> list=new ArrayList<>();
		while(rowiterator.hasNext()) {
			list.add(rowiterator.next().getCell(0).getStringCellValue());
			System.out.println(list);
			
		}
		
		
	}*/
	
}
