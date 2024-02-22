package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
	public WebDriver driver;
	//std rule: To provide Test Data & Objects Related to whole Application
	//*******Test Data
public String url="http://127.0.0.1/orangehrm-2.6/login.php";
public String un="admin";
public String pw="admin";
public String FN="Pavan";
public String LN="Korrapati";

public String Edt_Fname="Chinthalli";
public String Edt_Lname="Korrapati";

public String dlt_name="0008";


//******Objects
public String txt_loginname="txtUserName";
public String txt_password="txtPassword";
public String btn_login="Submit";
public String Link_logout="Logout";
//Add emp
public String frame_empinfo="rightMenu";
public String addbtn="//*[@id=\"standardView\"]/div[3]/div[1]/input[1]";
public String txt_ELN="txtEmpLastName";
public String txt_EFN="txtEmpFirstName";
public String saveEmp="btnEdit";
//Edit emp name
public String lnk_name="//*[@id=\"standardView\"]/table/tbody/tr[1]/td[3]/a";
public String EditId="btnEditPers";
public String edt_fname="txtEmpFirstName";
public String edit_lname="txtEmpLastName";
public String emp_id="loc_code";
public String search_For="//*[@id=\"loc_name\"]";
public String srch_btn="/html/body/div/div[2]/form/div[2]/input[2]";
public String empchk="chkLocID[]";
public String dltbtn="//*[@id=\"standardView\"]/div[3]/div[1]/input[2]";
}
