package org.login;

import java.io.FileInputStream;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Login {
	@DataProvider(name = "loginData")
	public String[][] logindataProvider() throws BiffException, IOException {
		String[][] data = getExceldata();
		return data;

	}

	public String[][] getExceldata() throws BiffException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\BCP\\Downloads\\ORR.xls");
		Workbook workbook = Workbook.getWorkbook(file);
		Sheet sheet = workbook.getSheet(0);
		int rows = sheet.getRows();
		int columns = sheet.getColumns();

		String[][] data = new String[rows - 1][columns];
		for (int i = 1; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				data[rows - 1][columns] = sheet.getCell(j, i).getContents();

			}

		}
		return data;

	}

	@Test(dataProvider = "loginData")
	public void login(String uname, String pword) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BCP\\eclipse-workspace\\com.orangehrm\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pword);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
