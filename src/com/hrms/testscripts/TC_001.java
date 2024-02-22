package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC_001 {
	@Test
	public void tc001() throws Exception{
		//TEST STEPS
		DOMConfigurator.configure("log4j.xml");
		General obj=new General();
		obj.openApplication();
		obj.login();
		obj.logout();
		Thread.sleep(3000);
		obj.closeApplication(); 
	}

}
