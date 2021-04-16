package Utitlities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.io.FileBackedOutputStream;

public class ExcelUtitlity {
	private File f;
	private FileInputStream fi;
	private Workbook wb;
	private Sheet sh;
	private FileOutputStream fo;
	
	
	public ExcelUtitlity(String filepath) throws Exception
	{
		f=new File(filepath);
		fi=new FileInputStream(f);
		wb=WorkbookFactory.create(fi);
		fo=new FileOutputStream(f);
	
	}
	
	public void opensheet(String sheetname)
	{
		sh=wb.getSheet(sheetname);
		
	}
	
	public int getrowscount()
	{
		int nour=sh.getPhysicalNumberOfRows();
		return nour;
		
	}
	
	public int getcolumncount()
	{
		int nouc=sh.getRow(0).getLastCellNum();
		return nouc;
		
	}
	
	public void createresultolum(int colindex)
	{
		SimpleDateFormat sf=new SimpleDateFormat("dd-MMM-yyyy-hh-mm-ss");
		Date dt=new Date();
		Cell rc=sh.getRow(0).createCell(colindex);
		rc.setCellValue(sf.format(dt));
		
	}
	
	public String getCellValue(int rowindex, int colindex)
	{
		DataFormatter df=new DataFormatter();
		String value=df.formatCellValue(sh.getRow(rowindex).getCell(colindex));
		return(value);
	}
	
	public void setCellValue(int rowindex, int colindex, String result)
	{
		Cell c=sh.getRow(rowindex).createCell(colindex);
		c.setCellValue(result);
		sh.autoSizeColumn(colindex);
	}
	
	public void saveAndCloseExcel() throws Exception
	{
		wb.write(fo); //save
		wb.close();
		fo.close();
		fi.close();
	}
	
	
	
	

}
