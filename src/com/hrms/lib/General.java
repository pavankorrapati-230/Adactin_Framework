package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import com.hrms.utility.Log;

public class General extends Global {
//std rule: To provide all re-usable fun:/methods related to whole application
	public void openApplication() {
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver\\version-102\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to(url);
		System.out.println("Application opened");
		Reporter.log("Application opened");
		Log.info("Application opened");
	
		
		
	}
	public void closeApplication(){ 
		driver.close();
		System.out.println("Application closed");
		Reporter.log("Application closed");
		Log.info("Application closed");
	}
	public void login() {
		
	driver.findElement(By.id(txt_loginname)).sendKeys(un);
	driver.findElement(By.name(txt_password)).sendKeys(pw);
	driver.findElement(By.name(btn_login)).click();
	System.out.println("Login completed");
	Reporter.log("Login completed");
	Log.info("Login Completed");
		
	}
	public void logout() {
		driver.findElement(By.linkText(Link_logout)).click();
		System.out.println("LogOut completed");
		Reporter.log("Logout completed");
		Log.info("Logout completed");
		
	}
	public void enterFrame() {
		driver.switchTo().frame(frame_empinfo);
		System.out.println("Entered into frame");
		Reporter.log("Entered into frame");
		Log.info("Entered into frame");
	}
	
	public void exitFrame() {
		driver.switchTo().defaultContent();	
		System.out.println("Exit from frame");
		Reporter.log("Exit from frame");
		Log.info("Exit from frame");
	}
	
	public void AddNewEmp() {
		driver.findElement(By.xpath(addbtn)).click();
		driver.findElement(By.name(txt_EFN)).sendKeys(FN);
		driver.findElement(By.id(txt_ELN)).sendKeys(LN);
		driver.findElement(By.id(saveEmp)).click();
		System.out.println("New employee added");
		Reporter.log("New employee added");
		Log.info("New employee added");
	}
	
	public void EditEmp() throws Exception {
		driver.findElement(By.xpath(lnk_name)).click();
		driver.findElement(By.id(EditId)).click();
		driver.findElement(By.id(edt_fname)).clear();
		Thread.sleep(3000);
		driver.findElement(By.id(edt_fname)).sendKeys(Edt_Fname);
		driver.findElement(By.name(edit_lname)).clear();
		Thread.sleep(3000);
		driver.findElement(By.name(edit_lname)).sendKeys(Edt_Lname);
		driver.findElement(By.id(EditId)).click();
		System.out.println("New name saved");
		Reporter.log("New name saved");
		Log.info("New name saved");
	}

	public void dropDown() {
		Select st=new Select(driver.findElement(By.id(emp_id)));
		st.selectByIndex(1);
		System.out.println("Employee ID was selected");
		Reporter.log("Employee ID was selected");
		Log.info("Employee ID was selected");
	}
	public void searchDlt() {
		driver.findElement(By.xpath(search_For)).sendKeys(dlt_name);
		driver.findElement(By.xpath(srch_btn)).click();
		driver.findElement(By.name(empchk)).click();
		driver.findElement(By.xpath(dltbtn)).click();
		System.out.println("Employee deleted");
		Reporter.log("Employee deleted");
		Log.info("Employee deleted");
		
	}
}
