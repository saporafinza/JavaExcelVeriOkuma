package Package1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.*;

public class ExcelOkuma {

	public Ders oku() throws IOException {
		
		String excelFilePath = ".\\datafile\\Sınav.xlsx";
		FileInputStream inputStream = new FileInputStream(excelFilePath);
		
		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);	
		
		XSSFSheet sheet = workbook.getSheet("Sayfa1");	
		
		Ders ders = new Ders();
		Ogrenci [] ogrenciler = ders.getOgrenciler();
		
		Iterator iterator = sheet.iterator();
		int rowNo = 0;
		while(iterator.hasNext()) {
			XSSFRow row = (XSSFRow) iterator.next();
			++rowNo;
			if (rowNo == 1)
				continue;
				
			Iterator cellIterator = row.cellIterator();
			
			String ogrenciNo = ((XSSFCell) cellIterator.next()).getStringCellValue();
			String ad = ((XSSFCell) cellIterator.next()).getStringCellValue();
			String soyad = ((XSSFCell) cellIterator.next()).getStringCellValue();
			double vize1 = ((XSSFCell) cellIterator.next()).getNumericCellValue();
			double vize2 = ((XSSFCell) cellIterator.next()).getNumericCellValue();
			double finalNot = ((XSSFCell) cellIterator.next()).getNumericCellValue();
			
			Not not = new Not((int) vize1, (int) vize2, (int) finalNot);
			
			Ogrenci ogrenci = new Ogrenci(ogrenciNo, ad, soyad, not);
			ogrenciler[rowNo - 2] = ogrenci;
		
			// System.out.println(ogrenciNo + ": " + ad + ": " + soyad + ": " + vize1 + ": " + vize2 + ": " + finalNot);
		}
		 return ders;
	}


}
