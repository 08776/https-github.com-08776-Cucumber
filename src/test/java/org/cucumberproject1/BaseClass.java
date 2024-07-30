package org.cucumberproject1;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver drive;
	public static void launchbrowser()
	{
		WebDriverManager.chromedriver().setup();
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\ECLIPSE PROG\\cucumberproject\\driver1\\chromedriver.exe");
          drive=new ChromeDriver();
		drive.get("https://en-gb.facebook.com/");
		drive.manage().window().maximize();
	}
	
	public static void launchURl(String url)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\ECLIPSE PROG\\cucumberproject\\driver1\\chromedriver.exe");
		//WebDriver drive=new ChromeDriver();
		drive.get(url);
	}
	public static void pagetitle()
	{
		String title=drive.getTitle();
		System.out.println(title);
	}
	public static void pageUrl()
	{
		String currentUrl = drive.getCurrentUrl();
		System.out.println(currentUrl);
	}
	public static void passtext(String text,WebElement ele)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\ECLIPSE PROG\\cucumberproject\\driver1\\chromedriver.exe");
		ele.sendKeys(text);
	}
	public static void closeentirebrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\ECLIPSE PROG\\cucumberproject\\driver1\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.quit();
	}
	public static void clickbtn(WebElement ele)
	{
		ele.click();
	}
	public static void screenshot(String imgname) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)drive;
		File img=ts.getScreenshotAs(OutputType.FILE);
		File f=new File("C:\\Users\\WIN 10\\eclipse-workspace\\project2\\screenshot\\img2.png");
		FileUtils.copyFile(img, f);
	}
	public static  Actions a ;
	public static void movethecursor(WebElement targetElement)
	{
		a=new Actions(drive);
		a.moveToElement(targetElement).perform();
	}
	public static void dragdrop(WebElement drag,WebElement drop)
	{
		a=new Actions(drive);
		a.dragAndDrop(drop,drag).perform();
	}
	public static  JavascriptExecutor js;
	public static void scrollpage(WebElement target)
	{
		js=(JavascriptExecutor)drive;
		js.executeScript("arguments[0].scrollIntoView(true)", target);
	}
	public static void scroll(WebElement targer)
	{
		js=(JavascriptExecutor)drive;
		js.executeScript("arguments[0].scrollIntoView(false)", targer);
	}
	public static void excelread(String cellName,int rownum,int colnum) throws IOException
	{
		File f=new File("excel");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		Row r=sheet.getRow(rownum);
		Cell c=r.getCell(colnum);
		int celltype=c.getCellType();
		String value=" ";
		if(celltype==1)
		{
			String value2 = c.getStringCellValue();	
		}
		else if(DateUtil.isCellDateFormatted(c))
		{
			Date dd=c.getDateCellValue();
			SimpleDateFormat s=new SimpleDateFormat(value);
			String value1 = s.format(dd);
		}
		else
		{
			double d=c.getNumericCellValue();
			long l=(long) d;
			String valueof=String.valueOf(l);
		}
		}
	
}
