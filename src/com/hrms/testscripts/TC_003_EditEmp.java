package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC_003_EditEmp {
	@Test
	public void tc003() throws Exception {
		DOMConfigurator.configure("log4j.xml");
		General obj=new General();
		obj.openApplication();
		obj.login();
		obj.enterFrame();
		Thread.sleep(3000);
		obj.EditEmp();
		obj.exitFrame();
		Thread.sleep(3000);
		obj.logout();
		Thread.sleep(3000);
		//obj.closeApplication();
	}

}
