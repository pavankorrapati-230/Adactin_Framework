package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;

import com.hrms.lib.General;

public class TC_004_DltEmp {

	public static void main(String args[]) {
		DOMConfigurator.configure("log4j.xml");
		General obj=new General();
		obj.openApplication();
		obj.login();
		obj.enterFrame();
		obj.dropDown();
		obj.searchDlt();
		obj.exitFrame();
		obj.logout();
		obj.closeApplication();
		
	}
}
