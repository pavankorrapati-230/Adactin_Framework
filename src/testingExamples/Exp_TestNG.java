package testingExamples;

import org.testng.annotations.Test;
public class Exp_TestNG {
	@Test //one test is 1 testcase/ scenario in Reports
		public void login() {
			System.out.println("Login completed");
		}
		@Test
		public void logout() {
			System.out.println("Logout completed");
			}
		@Test
		public void AddNewEmp() {
			System.out.println("New Emp");
		}
		@Test
		public void EditEmp () {
			System.out.println("Edit emp");
		}
		}