package com.e2m.TestCases;

import java.awt.AWTException;
import java.text.ParseException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.CommonActions.ForgotPassword;
import com.CommonActions.LoginToAccount;
import com.EventAgendaSetup.AddAttendees;
import com.EventAgendaSetup.AddExhibitors;
import com.EventAgendaSetup.AddSessions;
import com.EventAgendaSetup.AddSpeakers;
import com.EventAgendaSetup.AddSponsors;
import com.EventAgendaSetup.UploadData;
import com.EventManagement.CloneEvent;
import com.EventManagement.MapUserToEvent;
import com.EventManagement.NewEvent;
import com.UserManagement.AddUser;
import com.UserManagement.DeleteUser;
import com.Utils.BrowserSetUp;
import com.Utils.GetScreenShot;

//@Listeners({ GetScreenShot.class })

public class E2MTestCaes extends BrowserSetUp {

//	 Please select the Browser before run all the Test Cases

//	String BrowserName = "Firefox";

	String BrowserName = "Chrome";

	String EmailId = "ethan.taylor@yopmail.com";

	String Password = "#e2m321";

	String BulkUserPath = "/Users/goni/Documents/E2MDatas/ImportUser_Template.xlsx";
	
	String UploadAttendeePath = "/Users/goni/Documents/E2MDatas/ImportMapuserdata_Template.xlsx";
	
//	Event Name Should be Unique in Every Run
	
	String EventFullName = "Google IO";
	
//	String EventFullName = "E2M Automation Testing Event Clone Test";
	
	String EventShortName = "Google";
	
	String SessionTitle = "Pre Match";
	
	String TrackName = "Parking";
	
	String Location = "Ground Floor";

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

//	@Test(priority = 1,alwaysRun=true)
//	public void loginToAccountTest() throws InterruptedException {
//
//		System.out.println("Executing : Login To Account Test");
//
//		new LoginToAccount(driver).loginToAccount(EmailId, Password);
//		
//
//	}
//	
//	@Test(priority = 2,alwaysRun=true)
//	public void forgotPasswordTest() throws InterruptedException, AWTException {
//
//		System.out.println("Executing : Forgot Password Test");
//
//		new ForgotPassword(driver).forgotPassword("jakesoly@mailinator.com", "#e2m321");
//		
//
//	}
//	
//	@Test(priority = 3,alwaysRun=true)
//	public void deleteSelectedUserTest() {
//
//		System.out.println("Executing : Delete Selected User Test");
//
//
//		new DeleteUser(driver).deleteSelectedUser(EmailId, Password);
//		
//
//	}
//	
//	@Test(priority = 4,alwaysRun=true)
//	public void deleteAllSelectedUserTest() {
//
//		System.out.println("Executing : Delete All Selected User Test");
//
//		new DeleteUser(driver).deleteAllUser(EmailId, Password);
//		
//		
//	}
//	
//	@Test(priority = 5,alwaysRun=true)
//	public void undoUserDeletionTest() {
//
//		System.out.println("Executing : Undo User Deletion Test");
//
//		new DeleteUser(driver).undoUserDeletion(EmailId, Password);
//
//
//	}
//	
//	@Test(priority = 6,alwaysRun=true)
//	public void purgeAllUserTest() {
//
//		System.out.println("Executing : Purge All User Test");
//
//		new DeleteUser(driver).purgeAllUser(EmailId, Password);
//
//		
//	}
//	
//	@Test(priority = 7,alwaysRun=true)
//	public void addVerifiedUserTest() throws InterruptedException {
//
//		System.out.println("Executing : Add Verified User Test");
//
//		new AddUser(driver).addVerifiedUser(EmailId, Password, "Kevin", "Ms", "kevinms@yopmail.com");
//		
//
//	}
//
//	@Test(priority = 8,alwaysRun=true)
//	public void addUnverifiedUserTest() throws InterruptedException {
//
//		System.out.println("Executing : Add Unverified User Test");
//
//		new AddUser(driver).addUnverifiedUser(EmailId, Password, "Liam", "Neson", "liamneson@yopmail.com");
//		
//
//	}
//
//	@Test(priority = 9,alwaysRun=true)
//	public void bulkUserUploadTest() throws InterruptedException {
//
//		System.out.println("Executing : Bulk User Upload Test");
//
//		new AddUser(driver).userBulkUpload(EmailId, Password, BulkUserPath);
//		
//
//	}
//	
//	@Test(priority = 10,alwaysRun=true)
//	public void newEventCreationTest() {
//
//		System.out.println("Executing : New Event Creation Test");
//
//		new NewEvent(driver).newEventCreation(EmailId, Password, EventFullName, EventShortName);
//
//
//	}
//	
//	@Test(priority = 11,alwaysRun=true)
//	public void addSessionToEventTest() throws ParseException, InterruptedException {
//
//		System.out.println("Executing : Add Session to Event Test");
//		
//		new AddSessions(driver).addSessions(EmailId, Password, EventFullName,SessionTitle,TrackName,Location);
//
//	}
//	
//	@Test(priority = 12,alwaysRun=true)
//	public void addSessionWithTrackAndLocationToEventTest() throws ParseException, InterruptedException {
//
//		System.out.println("Executing : Add Session with Track and Loaction to Event Test");
//		
//		new AddSessions(driver).addSessionsWithTrackAndLocation(EmailId, Password, EventFullName,SessionTitle,TrackName,Location);
//
//	}
//	
//	@Test(priority = 13,alwaysRun=true)
//	public void addSessionWithOutTrackAndLocationToEventTest() throws ParseException, InterruptedException {
//
//		System.out.println("Executing : Add Session without Track and Loaction to Event Test");
//		
//		new AddSessions(driver).addSessionsWithOutTrackAndLocation(EmailId, Password, EventFullName, SessionTitle, Location);
//
//	}
//	
//	@Test(priority = 14,alwaysRun=true)
//	public void addCheckInRegistrationWithTrackSessionTest() throws ParseException, InterruptedException {
//
//		System.out.println("Executing : Add Check In Registration With Track Session to Event Test");
//		
//		new AddSessions(driver).addCheckInRegistrationSession(EmailId, Password, EventFullName, TrackName, Location,true);
//
//	}
//	
//	@Test(priority = 15,alwaysRun=true)
//	public void addCheckInRegistrationWithOutTrackSessionTest() throws ParseException, InterruptedException {
//
//		System.out.println("Executing : Add Check In Registration without Track Location Session to Event Test");
//		
//		new AddSessions(driver).addCheckInRegistrationSession(EmailId, Password, EventFullName, TrackName, Location,false);
//
//	}
//	
//	@Test(priority = 16,alwaysRun=true)
//	public void addBreakfastTypeSessionTest() throws ParseException, InterruptedException {
//
//		System.out.println("Executing : Add Breakfast Type Session to Event Test");
//		
////		Please Add Meal Type as : Breakfast 
//		
//		new AddSessions(driver).addMealBreakSessions(EmailId, Password, EventFullName, TrackName, Location, "Breakfast");
//
//	}
//	
//	@Test(priority = 17,alwaysRun=true)
//	public void addLunchTypeSessionTest() throws ParseException, InterruptedException {
//
//		System.out.println("Executing : Add Lunch Type Session to Event Test");
//		
////		Please Add Meal Type as : Lunch 
//		
//		new AddSessions(driver).addMealBreakSessions(EmailId, Password, EventFullName, TrackName, Location, "Lunch");
//
//	}
//	
//	@Test(priority = 18,alwaysRun=true)
//	public void addTeaTypeSessionTest() throws ParseException, InterruptedException {
//
//		System.out.println("Executing : Add Tea Type Session to Event Test");
//		
////		Please Add Meal Type as : Tea 
//		
//		new AddSessions(driver).addMealBreakSessions(EmailId, Password, EventFullName, TrackName, Location, "Tea");
//
//	}
//	
//	@Test(priority = 19,alwaysRun=true)
//	public void addDinnerTypeSessionTest() throws ParseException, InterruptedException {
//
//		System.out.println("Executing : Add Dinner Type Session to Event Test");
//		
////		Please Add Meal Type as : Dinner 
//		
//		new AddSessions(driver).addMealBreakSessions(EmailId, Password, EventFullName, TrackName, Location, "Dinner");
//
//	}
//	
//	@Test(priority = 20,alwaysRun=true)
//	public void addNetworkingWithTrackSessionTest() throws ParseException, InterruptedException {
//
//		System.out.println("Executing : Add Networking With Track Session to Event Test");
//		
//		new AddSessions(driver).addNetworkingSession(EmailId, Password, EventFullName, TrackName, Location,true);
//
//	}
//	
//	@Test(priority = 21,alwaysRun=true)
//	public void addnetworkingWithOutTrackSessionTest() throws ParseException, InterruptedException {
//
//		System.out.println("Executing : Add Networking Without Track Location Session to Event Test");
//		
//		new AddSessions(driver).addNetworkingSession(EmailId, Password, EventFullName, TrackName, Location,false);
//
//	}
//	
//	@Test(priority = 22,alwaysRun=true)
//	public void addPollWithFreeTextTest() throws ParseException, InterruptedException {
//
//		System.out.println("Executing : Add Poll to Session with Free Text Question Test");
//		
//		new AddSessions(driver).addPoll(EmailId, Password, EventFullName, SessionTitle, true, "Free Text");
//
//	}
//	
//	@Test(priority = 23,alwaysRun=true)
//	public void addPollWithSingleChoiceTest() throws ParseException, InterruptedException {
//
//		System.out.println("Executing : Add Poll to Session with Single Choice Question Test");
//		
//		new AddSessions(driver).addPoll(EmailId, Password, EventFullName, SessionTitle, true, "Single");
//
//	}
//	
//	@Test(priority = 24,alwaysRun=true)
//	public void addPollWithMultipleChoiceTest() throws ParseException, InterruptedException {
//
//		System.out.println("Executing : Add Poll to Session with Multiple Choice Question Test");
//		
//		new AddSessions(driver).addPoll(EmailId, Password, EventFullName, SessionTitle, true, "Multiple");
//
//	}
//	
//	@Test(priority = 25,alwaysRun=true)
//	public void addPollWithDropDownListTest() throws ParseException, InterruptedException {
//
//		System.out.println("Executing : Add Poll to Session with Dropdown List Question Test");
//		
//		new AddSessions(driver).addPoll(EmailId, Password, EventFullName, SessionTitle, true, "Dropdown");
//
//	}
//	
//	@Test(priority = 26,alwaysRun=true)
//	public void uploadLinkTypeResourceTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Upload Link Type Resource Test");
//		
//		new AddSessions(driver).addResources(EmailId, Password, EventFullName, SessionTitle, "Link");
//
//	}
//	
//	@Test(priority = 27,alwaysRun=true)
//	public void uploadFileTypeResourceTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Upload File Type Resource Test");
//		
//		new AddSessions(driver).addResources(EmailId, Password, EventFullName, SessionTitle, "File");
//
//	}
//	
//	@Test(priority = 28,alwaysRun=true)
//	public void seatingArrangementTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Seating Arrangement Test");
//		
//		new AddSessions(driver).seatingArrangement(EmailId, Password, EventFullName, SessionTitle, "Clerk Table", true);
//
//	}
	
	@Test(priority = 29,alwaysRun=true)
	public void addSessionCapacityTest() throws ParseException, InterruptedException, AWTException {

		System.out.println("Executing : Add Session Capacity Test");
		
		new AddSessions(driver).addSessionCapacity(EmailId, Password, EventFullName, SessionTitle);

	}
	
		
//	
//	@Test(priority = 22,alwaysRun=true)
//	public void addSpeakersTest() throws ParseException, InterruptedException {
//
//		System.out.println("Executing : Add Speakers to Event Test");
//		
//		new AddSpeakers(driver).addSpeakers(EmailId, Password, EventFullName, "Jam", "Jelly");
//
//	}
//	
//	@Test(priority = 23,alwaysRun=true)
//	public void mapSessionWithRandomUserTest() throws ParseException, InterruptedException {
//
//		System.out.println("Executing : Map Session with Random User Test");
//		
//		new AddSpeakers(driver).mapSessionWithRandomSpeaker(EmailId, Password, EventFullName);
//
//	}
//	
//	@Test(priority = 24,alwaysRun=true)
//	public void createSpeakerAndMapWithCreateSessionTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Create Speaker and Map with Create Session Test");
//		
//		new AddSpeakers(driver).createSpeakerAndMapWithCreateSession(EmailId, Password, EventFullName, "Himmy", "Deo", "Pre Match");
//
//	}
//	
//	@Test(priority = 25,alwaysRun=true)
//	public void downloadQRCodeTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Download QR Code Test");
//		
//        new AddAttendees(driver).downloadQRCode(EmailId, Password, EventFullName);
//
//	}
//	
//	@Test(priority = 26,alwaysRun=true)
//	public void mapUserRolesTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Map User Roles Test");
//		
//        new AddAttendees(driver).mapUserRoles(EmailId, Password, EventFullName);
//
//	}
//	
//	@Test(priority = 27,alwaysRun=true)
//	public void attendeeVisibilityTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Disable Attendee Visibility Test");
//		
//        new AddAttendees(driver).attendeeVisibility(EmailId, Password, EventFullName);
//
//	}
//	
//	@Test(priority = 28,alwaysRun=true)
//	public void manageGroupTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Manage Group Test");
//		
//        new AddAttendees(driver).manageGroup(EmailId, Password, EventFullName, "Team Ford");
//
//	}
//	
//	@Test(priority = 29,alwaysRun=true)
//	public void matchMakingTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Match Making Test");
//		
//        new AddAttendees(driver).matchMaking(EmailId, Password, EventFullName, "AutoGym");
//
//	}
//	
//	@Test(priority = 30,alwaysRun=true)
//	public void importAttendeesTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Import Attendees Test");
//		
//        new AddAttendees(driver).importAttendees(EmailId, Password, EventFullName, UploadAttendeePath);
//
//	}
//	
//	@Test(priority = 31,alwaysRun=true)
//	public void addExhibitorTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Add Exhibitor Test");
//		
//        new AddExhibitors(driver).addExhibitor(EmailId, Password, EventFullName, "Peter");
//
//	}
//	
//	@Test(priority = 32,alwaysRun=true)
//	public void exhibitorListTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Exhibitor List Test");
//		
//        new AddExhibitors(driver).exhibitorList(EmailId, Password, EventFullName);
//
//	}
//	
//	@Test(priority = 33,alwaysRun=true)
//	public void mapExhibitorWithUserTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Map Exhibitor with User Test");
//		
//        new AddExhibitors(driver).mapExhibitorWithUser(EmailId, Password, EventFullName);
//
//	}
//	
//	@Test(priority = 34,alwaysRun=true)
//	public void mapExhibitorWithUserGroupTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Map Exhibitor with User Group Test");
//		
//        new AddExhibitors(driver).mapExhibitorWithUserGroup(EmailId, Password, EventFullName);
//
//	}
//	
//	@Test(priority = 35,alwaysRun=true)
//	public void addSponsorTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Add Sponsor Test");
//		
//        new AddSponsors(driver).addSponsor(EmailId, Password, EventFullName, "3M");
//
//	}
//	
//	@Test(priority = 36,alwaysRun=true)
//	public void sponsorListTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Sponsor List Test");
//		
//        new AddSponsors(driver).sponsorList(EmailId, Password, EventFullName);
//
//	}
//	
//	@Test(priority = 37,alwaysRun=true)
//	public void mapSponsorWithUserTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Map Sponsor with User Test");
//		
//		new AddSponsors(driver).mapSponsorWithUser(EmailId, Password, EventFullName);
//
//	}
//	
//	@Test(priority = 38,alwaysRun=true)
//	public void mapSponsorWithUserGroupTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Map Sponsor with User Group Test");
//		
//		new AddSponsors(driver).mapSponsorWithUserGroup(EmailId, Password, EventFullName);
//
//	}
//	
//	@Test(priority = 39,alwaysRun=true)
//	public void uploadE2MDataTest() throws ParseException, InterruptedException, AWTException {
//
//		System.out.println("Executing : Upload E2MData Test");
//		
//		new UploadData(driver).e2mDataImport(EmailId, Password, EventFullName);
//
//	}
		
//	@Test(priority = 7,alwaysRun=true)
//	public void cloneToNewEventTest() {
//
//		System.out.println("Executing : Clone To New Event Test");
//
//		new CloneEvent(driver).cloneToNewEvent(EmailId, Password, EventFullName, EventShortName);
//
//	}
//	
//	
//	@Test(priority = 11,alwaysRun=true)
//	public void mapUserToAnEventTest() throws InterruptedException {
//
//		System.out.println("Executing : Map User To An Event Test");
//		
//		new MapUserToEvent(driver).mapUserToEvent(EmailId, Password, "CTech Symposium", "kevinms@yopmail.com");
//
//	}
//	
//	



}
