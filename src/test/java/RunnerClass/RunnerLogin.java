package RunnerClass;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.remote.RemoteWebDriver;

import org.openqa.selenium.support.ui.WebDriverWait;

import PageClasses.EnterStudentDetailPage;
import PageClasses.StudentDetailAddstdPage;
import PageClasses.StudentLoginPage;
import PageClasses.StudentMarksPage;
import Utitlities.ExcelUtitlity;
import Utitlities.TestUtil;


public class RunnerLogin {

	public void meth() throws Exception
	{

		File f=new File("src\\test\\resources\\aa.XLSX");
		FileInputStream fn=new FileInputStream(f);
		Workbook wb=WorkbookFactory.create(fn);
		Sheet sh=wb.getSheet("login");
		int nour=sh.getPhysicalNumberOfRows();
		int nouc=sh.getRow(0).getLastCellNum();
		System.out.println(nour);
		System.out.println(nouc);
		for(int i=1;i<nour;i++)
		{
			DataFormatter df=new DataFormatter();
			String env=df.formatCellValue(sh.getRow(i).getCell(0));
			String bn=df.formatCellValue(sh.getRow(i).getCell(1));
			String un=df.formatCellValue(sh.getRow(i).getCell(2));
			String pass=df.formatCellValue(sh.getRow(i).getCell(3));
			
			StudentLoginPage obj=null;
			
			if(env.equalsIgnoreCase("local"))
			{
				//obj=new StudentLoginPage();
			}
			else
			{
				//obj=new Reuseable(bn,v,os);
			}
		}
	}
	
	public static void main(String[] args) throws Exception
	{
		
		TestUtil tu=new TestUtil();
		String tdpath=System.getProperty("user.dir")+"\\src\\test\\resources\\studentbook.XLSX";
		ExcelUtitlity eu=new ExcelUtitlity(tdpath);
		
		try {
			eu.opensheet("login");
			int nour=eu.getrowscount();
			int nouc=eu.getcolumncount();
			
			eu.createresultolum(nouc);
			System.out.println(nouc);
			System.out.println(nour);
			
			for(int i=1;i<nour;i++)
			{
				String env=eu.getCellValue(i, 0);
				String bn=eu.getCellValue(i, 1);
				String un=eu.getCellValue(i, 2);
				String pass=eu.getCellValue(i, 3);
				
				RemoteWebDriver driver=tu.openBrowser(bn);
				WebDriverWait wait=tu.defineWait(driver);
				
				EnterStudentDetailPage esd=new EnterStudentDetailPage(driver,wait);
				StudentLoginPage slp=new StudentLoginPage(driver,wait);
				StudentDetailAddstdPage ada=new StudentDetailAddstdPage(driver,wait);
				StudentMarksPage smp=new StudentMarksPage(driver,wait);
				
				String url=tu.getValueInPropertiesFile("url");
				tu.launchSite(url);
				//tu.openBrowser(bn);
		
				
			}
			
		}
		catch(Exception ex)
		{
			
		}
		
			
			
		
		
	}
	
	
}
