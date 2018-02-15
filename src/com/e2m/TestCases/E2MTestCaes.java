package com.e2m.TestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.CommonActions.LoginToAccount;
import com.EventManagement.CloneEvent;
import com.EventManagement.MapUserToEvent;
import com.EventManagement.NewEvent;
import com.UserManagement.AddUser;
import com.UserManagement.DeleteUser;
import com.Utils.BrowserSetUp;
import com.Utils.GetScreenShot;

@Listeners({ GetScreenShot.class })

public class E2MTestCaes extends BrowserSetUp {

//	 Please select the Browser before run all the Test Cases

//	String BrowserName = "Firefox";

	String BrowserName = "Chrome";

	String EmailId = "ethan.taylor@yopmail.com";

	String Password = "#e2m321";

	String BulkUserPath = "/Users/goni/Documents/ImportUser_Template.xlsx";
	
	String EventFullName = "E2M Automation Testing Event";
	
	String EventShortName = "E2M Event";

	@BeforeClass
	public void setUp() throws InterruptedException {

		openBrowser(BrowserName);

	}

	@AfterClass
	public void tearDown() {

		quitAllBrowser();

	}
	
	@AfterMethod
	public void afterMethod(){
		
		logOut();
		
		methodSeparation();
		
	}

	@Test(priority = 1,alwaysRun=true)
	public void loginToAccount() throws InterruptedException {

		System.out.println("Executing : Login To Account Test");

		new LoginToAccount(driver).loginToAccount(EmailId, Password);
		

	}
	
	@Test(priority = 2,alwaysRun=true)
	public void deleteSelectedUserTest() {

		System.out.println("Executing : Delete Selected User Test");


		new DeleteUser(driver).deleteSelectedUser(EmailId, Password);
		

	}
	
	@Test(priority = 3,alwaysRun=true)
	public void deleteAllSelectedUserTest() {

		System.out.println("Executing : Delete All Selected User Test");

		new DeleteUser(driver).deleteAllUser(EmailId, Password);
		
		
	}
	
	@Test(priority = 4,alwaysRun=true)
	public void undoUserDeletionTest() {

		System.out.println("Executing : Undo User Deletion Test");

		new DeleteUser(driver).undoUserDeletion(EmailId, Password);


	}
	
	@Test(priority = 5,alwaysRun=true)
	public void purgeAllUserTest() {

		System.out.println("Executing : Purge All User Test");

		new DeleteUser(driver).purgeAllUser(EmailId, Password);

		
	}
	
	@Test(priority = 6,alwaysRun=true)
	public void newEventCreationTest() {

		System.out.println("Executing : New Event Creation Test");

		new NewEvent(driver).newEventCreation(EmailId, Password, EventFullName, EventShortName);


	}
	
	@Test(priority = 7,alwaysRun=true)
	public void cloneToNewEventTest() {

		System.out.println("Executing : Clone To New Event Test");

		new CloneEvent(driver).cloneToNewEvent(EmailId, Password, EventFullName, EventShortName);

	}

	@Test(priority = 8,alwaysRun=true)
	public void addVerifiedUserTest() throws InterruptedException {

		System.out.println("Executing : Add Verified User Test");

		new AddUser(driver).addVerifiedUser(EmailId, Password, "Kevin", "Ms", "kevinms@yopmail.com");
		

	}

	@Test(priority = 9,alwaysRun=true)
	public void addUnverifiedUserTest() throws InterruptedException {

		System.out.println("Executing : Add Unverified User Test");

		new AddUser(driver).addUnverifiedUser(EmailId, Password, "Liam", "Neson", "liamneson@yopmail.com");
		

	}

	@Test(priority = 10,alwaysRun=true)
	public void bulkUserUploadTest() throws InterruptedException {

		System.out.println("Executing : Bulk User Upload Test");

		new AddUser(driver).userBulkUpload(EmailId, Password, BulkUserPath);
		

	}
	
	@Test(priority = 11,alwaysRun=true)
	public void mapUserToAnEventTest() throws InterruptedException {

		System.out.println("Executing : Map User To An Event Test");
		
		new MapUserToEvent(driver).mapUserToEvent(EmailId, Password, "CTech Symposium", "kevinms@yopmail.com");

	}
	
	



}
