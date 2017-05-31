package com.selenium.org.Batch9Maven;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;

public class TestNGCLass {
	WebDriver driver;
	XSSFWorkbook excel;
	XSSFSheet sheet;
	ExtentReports report;
	ExtentTest logger;

	@Test
	public void f() 
	{
		
		logger.log(LogStatus.INFO, "Doing Log in functionality");
		LoginClass ref= new LoginClass(driver);
		ref.login_function();
		
		logger.log(LogStatus.INFO, "Loggin was succeefulll");

	}
	@Parameters("bro")
	@BeforeTest
	public void beforeTest(String val) throws InvalidFormatException, IOException 
	{
		
		report= new ExtentReports("Resource/ExtentReportB9.html");
		logger= report.startTest("Started the extent report for my project");
		
		String browser=val;
		excel= new XSSFWorkbook(new File("Resource/B9.xlsx"));
		sheet= excel.getSheet("Sheet1");

		String url=sheet.getRow(1).getCell(0).getStringCellValue();

		if(browser.equalsIgnoreCase("Chrome"))
		{ 
			
			logger.log(LogStatus.INFO, "Starting Chrome");
			System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
			driver = new ChromeDriver();
			
			logger.log(LogStatus.PASS, "Started Chrome Succeffully");
		}  
		else if (browser.equalsIgnoreCase("IE"))
		{
			logger.log(LogStatus.INFO, "Starting IE");
			System.setProperty("webdriver.ie.driver", "Resource/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			
			logger.log(LogStatus.PASS, "Started IE Suucc");
		}
		else if (browser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "Resource/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("Browser specified did not match");
		}
		
		logger.log(LogStatus.INFO, "Starting facebook for logging");
		driver.navigate().to("https://en-gb.facebook.com/login");
		
		logger.log(LogStatus.INFO, "Maximising Browser");
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest()
	{
		report.endTest(logger);
		report.flush();
		driver.quit();
	}

}
