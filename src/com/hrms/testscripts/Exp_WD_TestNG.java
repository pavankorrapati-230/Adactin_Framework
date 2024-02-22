package com.hrms.testscripts; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Exp_WD_TestNG {
	WebDriver driver;
	@BeforeClass
	public void startUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver\\version-102\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	@AfterClass
	public void tearDown() {
		driver.close();
	}
	@Test
	public void tc001() throws Exception {
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		System.out.println("Application opened");
		Reporter.log("Application opened");
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login completed");
		Thread.sleep(3000);
		Reporter.log("Login completed");
		Reporter.log(driver.getTitle());
		driver.findElement(By.linkText("Logout")).click();
	}

}
