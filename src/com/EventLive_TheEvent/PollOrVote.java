package com.EventLive_TheEvent;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.BaseSetup.BaseSetUp;
import com.CommonActions.LoginToAccount;

public class PollOrVote extends BaseSetUp{
	
	
	By searchEvent = By.xpath("//*[@id='ContentPlaceHolder1_txtEventName']");
	
	By selectEvent = By.xpath("//*[@id='ContentPlaceHolder1_AutoCompleteExtender1_completionListElem']");
	
	By clickOnEvent = By.xpath("//*[@onclick='GetPositionForEdit(this);']");
	
	By clickOnLiveEvent = By.xpath("//li[@id='LV']//a[@href='javascript:void(0);']");
	
	By clickOnPollVote = By.xpath("//*[@href='New/Poll/Index']");
	
	By clickOn1stUpdateMapping = By.xpath("//div[@id='recordsFound']/table/tbody/tr[1]/td[3]//*[contains(text(),'Update Mapping')]");
	
	By clickOn2ndUpdateMapping = By.xpath("//div[@id='recordsFound']/table/tbody/tr[2]/td[3]//*[contains(text(),'Update Mapping')]");
	
	By searchSessionName = By.xpath("//*[@id='txtmapsession']");
	
	By clickOn1stSessionChkBox = By.xpath("//div[@id='sldmapsession']//*[@class='ui-menu-item'][1]//*[@class='checkbox']");
	
	By clickOn2ndSessionChkBox = By.xpath("//div[@id='sldmapsession']//*[@class='ui-menu-item'][2]//*[@class='checkbox']");
	
	By clickOn3rdSessionChkBox = By.xpath("//div[@id='sldmapsession']//*[@class='ui-menu-item'][3]//*[@class='checkbox']");
	
	By clickOn4thSessionChkBox = By.xpath("//div[@id='sldmapsession']//*[@class='ui-menu-item'][4]//*[@class='checkbox']");
	
	By save1stSessionName = By.xpath("//*[@id='tbdmapsession']//tr[1]/td[2]/div/div");
	
	By save2ndSessionName = By.xpath("//*[@id='tbdmapsession']//tr[2]/td[2]/div/div");
	
	By save3rdSessionName = By.xpath("//*[@id='tbdmapsession']//tr[3]/td[2]/div/div");
	
	By clickOnDoneButton = By.xpath("//*[@id='sldmapsession']//*[@value='Done']");
	
	By clickOn1stSesnSettings = By.xpath("//tbody[@id='tbdmapsession']/tr[1]/td[6]/div/div[1]");
	
	By clickOn1stTimiers = By.xpath("//tbody[@id='tbdmapsession']/tr[1]/td[6]/div/div[2]");
	
	By clickOn2ndSesnSettings = By.xpath("//tbody[@id='tbdmapsession']/tr[2]/td[6]/div/div[1]");
	
	By clickOn2ndTimiers = By.xpath("//tbody[@id='tbdmapsession']/tr[2]/td[6]/div/div[2]");
	
	By clickOn3rdSesnSettings = By.xpath("//tbody[@id='tbdmapsession']/tr[3]/td[6]/div/div[1]");
	
	By clickOn3rdTimiers = By.xpath("//tbody[@id='tbdmapsession']/tr[3]/td[6]/div/div[2]");
	
//	By activeToggleBtn = By.xpath("//*[@class='col-sm-12 pt-sm-3 pb-sm-3']/div[1]/div[1][@class='checkbox-toggle']/label");
	
	By activeToggleBtn = By.xpath("//*[@class='col-sm-12 pt-sm-3 pb-sm-3']/div[1]/div[1][@class='checkbox-toggle']");
	
	By enableAnonymousBtn = By.xpath("//*[@class='col-sm-12 pt-sm-3 pb-sm-3']/div[3]/div[1][@class='checkbox-toggle']");
	
	By anonymousMandatoryBtn = By.xpath("//*[@class='col-sm-12 pt-sm-3 pb-sm-3']/div[4]/div[1][@class='checkbox-toggle']");
	
	By clickOnSesnActiveSetTime = By.xpath("//*[@class='customradiobuttonholder clearfix pb-3']/div[2]/label[1]");
	
	By clickOnSesnSelectTime = By.xpath("//*[@class='customradiobuttonholder clearfix pb-3']/div[3]/label[1]");
	
	By activeOnDate = By.xpath("//div[@class='datetime-hld form-inline mb-sm-2 col-md-8']/div[1]");
	
	By activeOnTime = By.xpath("//div[@class='datetime-hld form-inline mb-sm-2 col-md-8']/div[2]");
	
	By deactiveOnDate = By.xpath("//div[@class='datetime-hld form-inline  col-md-8']/div[1]");
	
	By deactiveOnTime = By.xpath("//div[@class='datetime-hld form-inline  col-md-8']/div[2]");
	
	By activeOnTimerTime = By.xpath("//div[@class='col-12']//*[@class='col-md-12 mb-md-2']/div/div[1]//input");
	
	By activeBeforeTimer = By.xpath("//div[@class='col-12']//*[@class='col-md-12 mb-md-2']/div/div[2]/select");
	
	By deactiveOnTimerTime = By.xpath("//div[@class='col-12']//*[@class='col-md-12']/div/div[1]/div//input");
	
	By deactiveSessionStatusEnd = By.xpath("//div[@class='col-12']//*[@class='col-md-12']/div/div[3]");
	
	By mappedSession = By.xpath("//*[@id='tbdmapsession']");
	
	By saveBtn = By.xpath("//button[@type='button'][contains(text(),'Save changes')]");
	
	

	public PollOrVote(WebDriver driver) {
		super(driver);

	}
	
	public void commonActivities(String EmailId, String Password,String EventFullName) throws InterruptedException{
		
//		Login to your Account 
		
		new LoginToAccount(driver).loginToAccount(EmailId, Password);
		
//		Searching for Event Name
		
		System.out.println("Searching for Event Name :"+EventFullName);
		
		waitForClickabilityOf(searchEvent);
		
		WebElement search = driver.findElement(searchEvent);
		
		search.sendKeys(EventFullName);
		
//		Pressing Enter Button 
		
		search.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		waitForClickabilityOf(clickOnEvent);
		
		String ActEventName = driver.findElement(clickOnEvent).getText();
		
		System.out.println("Clicking On Event : "+ActEventName);
		
		if (EventFullName.equals(ActEventName)) {
			
			System.out.println("This is Correct Event");
			
		} else {
			
			System.out.println("Failed to Search the Event Name so, searching again ");
			
			search.clear();
			
			search.sendKeys(EventFullName);
			
			Thread.sleep(2000);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
//			Pressing Enter Button 
			
			search.sendKeys(Keys.ENTER);
				
		}
		
//		Clicking on The Event
		
		System.out.println("Clicking on The Event");
		
		waitForClickabilityOf(clickOnEvent);
		
		driver.findElement(clickOnEvent).click();

//		Clicking on Live Event
		
		System.out.println("Clicking on Live Event");
		
		waitForClickabilityOf(clickOnLiveEvent);
		
		driver.findElement(clickOnLiveEvent).click();
		
//		Clicking on Poll/Vote
		
		System.out.println("Clicking on Poll/Vote");
		
		waitForClickabilityOf(clickOnPollVote);
		
		driver.findElement(clickOnPollVote).click();
		
	}
	
	public PollOrVote mapSessionToPoll(String EmailId, String Password,String EventFullName) throws InterruptedException{
		
		commonActivities(EmailId, Password, EventFullName);
		
//		Clicking on Agenda Setup
		
		System.out.println("Clicking on Update Mapping");
		
		waitForClickabilityOf(clickOn1stUpdateMapping);
		
		driver.findElement(clickOn1stUpdateMapping).click();
		
		System.out.println("Mapping with Session");
		
//		Clicking on Search Session Name
		
		System.out.println("Clicking on Search Session Name");
		
		waitForClickabilityOf(searchSessionName);
		
		driver.findElement(searchSessionName).click();
		
//		Selecting 1st Session
		
		System.out.println("Selecting 1st Session");
		
		waitForClickabilityOf(clickOn1stSessionChkBox);
		
		driver.findElement(clickOn1stSessionChkBox).click();
		
//		Clicking On Done Button
		
		System.out.println("Clicking On Done Button");
		
		waitForClickabilityOf(clickOnDoneButton);
		
		driver.findElement(clickOnDoneButton).click();
		
//		Clicking On Session Setting Button
		
		System.out.println("Clicking On Session Setting Button");
		
		waitForClickabilityOf(clickOn1stSesnSettings);
		
		driver.findElement(clickOn1stSesnSettings).click();
		
//		Clicking On Session Settings Button to Active Status
		
		System.out.println("Clicking On Session Settings Button to Active the Status");
		
		waitForClickabilityOf(activeToggleBtn);
			
		driver.findElement(activeToggleBtn).click();
		
//		Enabling Anonymous Submission 
		
		System.out.println("Enabling Anonymous Submission");
			
		waitForClickabilityOf(enableAnonymousBtn);
			
		driver.findElement(enableAnonymousBtn).click();
		
//		Getting No of Existing Sessions Count
		
		waitForClickabilityOf(mappedSession);
		
		List<WebElement> element = driver.findElements(mappedSession);
		
		int NoOfExSession = element.size();
		
		System.out.println(NoOfExSession);
		
		if (NoOfExSession==1) {
			
			System.out.println("Successfully Mapped One Sesson with Poll");
			
		} else {
			
			System.out.println("Failed to Map Session with Poll");

		}
		
//		Clicking On Save Button to Map
				
		waitForClickabilityOf(saveBtn);
		
		driver.findElement(saveBtn).click();
		
		try {
			
			popUpHandeling();
			
		} catch (Exception e) {
						
		}
		
		
		
		return new PollOrVote(driver);
		
		
	}
	
	public PollOrVote mapSessionToPollAnonymousSetTime(String EmailId, String Password,String EventFullName) throws InterruptedException{

		commonActivities(EmailId, Password, EventFullName);
		
//		Clicking on Agenda Setup
		
		System.out.println("Clicking on Update Mapping");
		
		waitForClickabilityOf(clickOn1stUpdateMapping);
		
		driver.findElement(clickOn1stUpdateMapping).click();
		
		System.out.println("Mapping with Session");
		
//		Clicking on Search Session Name
		
		System.out.println("Clicking on Search Session Name");
		
		waitForClickabilityOf(searchSessionName);
		
		driver.findElement(searchSessionName).click();
		
//		Selecting 2nd Session
		
		System.out.println("Selecting 2nd Session");
		
		waitForClickabilityOf(clickOn2ndSessionChkBox);
		
		driver.findElement(clickOn2ndSessionChkBox).click();
		
//		Clicking On Done Button
		
		System.out.println("Clicking On Done Button");
		
		waitForClickabilityOf(clickOnDoneButton);
		
		driver.findElement(clickOnDoneButton).click();
		
//		Getting No of Existing Sessions Count
		
		waitForClickabilityOf(mappedSession);
		
		List<WebElement> element = driver.findElements(mappedSession);
		
		int NoOfExSession = element.size();
						
//		Clicking On Session Setting Button
		
		System.out.println("Clicking On Session Setting Button");
		
		waitForClickabilityOf(clickOn2ndSesnSettings);
		
		driver.findElement(clickOn2ndSesnSettings).click();
		
//		Clicking On Session Settings Button to Active Status
		
		System.out.println("Clicking On Session Settings Button to Active the Status");
		
		waitForClickabilityOf(activeToggleBtn);
			
		driver.findElement(activeToggleBtn).click();
		
//		Enabling Anonymous Submission 
		
		System.out.println("Enabling Anonymous Submission");
			
		waitForClickabilityOf(enableAnonymousBtn);
			
		driver.findElement(enableAnonymousBtn).click();
		
//		Window Scrolling Down
		
		try {
			
			scrollDown(enableAnonymousBtn);
			
		} catch (Exception e) {
			
		}
		
//		Enabling Anonymous Mandatory Button
		
		System.out.println("Enabling Anonymous Mandatory Button");
			
		waitForClickabilityOf(anonymousMandatoryBtn);
			
		driver.findElement(anonymousMandatoryBtn).click();
		
//		Clicking On Session Timer Button
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Session Timer Settings Button");
		
		waitForClickabilityOf(clickOn2ndTimiers);
		
		driver.findElement(clickOn2ndTimiers).click();
		
//		Clicking On Set Date/Time Toggle Button
		
		System.out.println("Clicking On Set Date/Time Toggle Button");
		
		waitForClickabilityOf(clickOnSesnActiveSetTime);
		
		driver.findElement(clickOnSesnActiveSetTime).click();
		
//		Window Scrolling Down
		
		try {
			
			scrollDown(deactiveOnTime);
			
		} catch (Exception e) {
			
		}
		
//		Setting Activate Date
		
		System.out.println("Setting Activate Date");
		
		waitForClickabilityOf(activeOnDate);
		
		driver.findElement(activeOnDate).sendKeys("04/30/2018");
		
//		Setting Activate Time
		
		System.out.println("Setting Activate Time");
		
		waitForClickabilityOf(activeOnTime);
		
		driver.findElement(activeOnTime).sendKeys("9:00 AM");
		
//		Setting Deactivate Date
		
		System.out.println("Setting Deactivate Date");
		
		waitForClickabilityOf(deactiveOnDate);
		
		driver.findElement(deactiveOnDate).sendKeys("04/30/2018");
		
//		Setting Deactivate Time
		
		System.out.println("Setting Deactivate Time");
		
		waitForClickabilityOf(deactiveOnTime);
		
		driver.findElement(deactiveOnTime).sendKeys("9:00 PM");
		
//		Getting No of Existing Sessions Count
		
		waitForClickabilityOf(mappedSession);
		
		List<WebElement> element1 = driver.findElements(mappedSession);
		
		int NoOfExSession1 = element1.size();
		
		System.out.println(NoOfExSession1);
		
		if (NoOfExSession==NoOfExSession1-1) {
			
			System.out.println("Successfully Mapped One Sesson with Poll");
			
		} else {
			
			System.out.println("Failed to Map Session with Poll");

		}
		
//		Clicking On Save Button to Map
				
		waitForClickabilityOf(saveBtn);
		
		driver.findElement(saveBtn).click();
		
		try {
			
			popUpHandeling();
			
		} catch (Exception e) {
						
		}
				
		
		return new PollOrVote(driver);
		
	}
	
	public PollOrVote pollMappingUpdation(String EmailId, String Password,String EventFullName,String MapWith,boolean AnonymousSubmission,boolean SetDateTime,boolean SelectTime) throws InterruptedException{
		
//		Common Feature so calling Common Activities Method
		
		commonActivities(EmailId, Password, EventFullName);
		
//		Clicking on Agenda Setup
		
		System.out.println("Clicking on Update Mapping");
		
		waitForClickabilityOf(clickOn1stUpdateMapping);
		
		driver.findElement(clickOn1stUpdateMapping).click();
		
		Thread.sleep(2000);
		
//		Mapping with Session
		
		if (MapWith.equals("Session")) {
			
			System.out.println("Mapping with Session");
			
//			Clicking on Search Session Name
			
			System.out.println("Clicking on Search Session Name");
			
			waitForClickabilityOf(searchSessionName);
			
			driver.findElement(searchSessionName).click();
			
//			Selecting 1st Session
			
			System.out.println("Selecting 1st Session");
			
			waitForClickabilityOf(clickOn1stSessionChkBox);
			
			driver.findElement(clickOn1stSessionChkBox).click();
			
//			Clicking On Done Button
			
			System.out.println("Clicking On Done Button");
			
			waitForClickabilityOf(clickOnDoneButton);
			
			driver.findElement(clickOnDoneButton).click();
			
//			Clicking On Session Setting Button
			
			System.out.println("Clicking On Session Setting Button");
			
			waitForClickabilityOf(clickOn1stSesnSettings);
			
			driver.findElement(clickOn1stSesnSettings).click();
			
			Thread.sleep(2000);
			
//			Clicking On Session Settings Button to Active Status
			
			System.out.println("Clicking On Session Settings Button to Active the Status");
			
			waitForClickabilityOf(activeToggleBtn);
			
			boolean Status = driver.findElement(activeToggleBtn).isEnabled();
			
			Thread.sleep(2000);
			
			System.out.println(Status);
			
			if (Status==true) {
				
			} else {
				
				driver.findElement(activeToggleBtn).click();

			}
			
//			Enabling Anonymous Submission 
			
			if (AnonymousSubmission==true) {
				
				System.out.println("Enabling Anonymous Submission");
				
				waitForClickabilityOf(enableAnonymousBtn);
				
				boolean Anonymous = driver.findElement(enableAnonymousBtn).isEnabled();
				
				System.out.println(Anonymous);
				
				Thread.sleep(2000);
				
				if (Anonymous==true) {
					
				} else {
					
					driver.findElement(enableAnonymousBtn).click();

				}
				
			} else {
				
				System.out.println("Disabling Anonymous Submission");

			}
			
//			Clicking On Session Timer Button
			
			Thread.sleep(2000);
			
			System.out.println("Clicking On Session Timer Button");
			
			waitForClickabilityOf(clickOn1stTimiers);
			
			driver.findElement(clickOn1stTimiers).click();
			
			Thread.sleep(2000);
			
//			Clicking On Set Date and Time
			
			if (SetDateTime==true) {
				
//				Clicking On Set Date/Time Toggle Button
				
				System.out.println("Clicking On Set Date/Time Toggle Button");
				
				waitForClickabilityOf(clickOnSesnActiveSetTime);
				
				driver.findElement(clickOnSesnActiveSetTime).click();
				
//				Setting Activate Date
				
				System.out.println("Setting Activate Date");
				
				waitForClickabilityOf(activeOnDate);
				
				driver.findElement(activeOnDate).sendKeys("04/30/2018");
				
//				Setting Activate Time
				
				System.out.println("Setting Activate Time");
				
				waitForClickabilityOf(activeOnTime);
				
				driver.findElement(activeOnTime).sendKeys("9:00 AM");
				
//				Setting Deactivate Date
				
				System.out.println("Setting Deactivate Date");
				
				waitForClickabilityOf(deactiveOnDate);
				
				driver.findElement(deactiveOnDate).sendKeys("04/30/2018");
				
//				Setting Deactivate Time
				
				System.out.println("Setting Deactivate Time");
				
				waitForClickabilityOf(deactiveOnTime);
				
				driver.findElement(deactiveOnTime).sendKeys("9:00 PM");
						
				
			} else {
				
				System.out.println("Without Selecting Any Date and Time");

			}
			
			
//			Clicking On Set Date and Time
			
			if (SelectTime==true) {
				
//				Clicking On Select Time Toggle Button
				
				System.out.println("Clicking On Select Time Toggle Button");
				
				waitForClickabilityOf(clickOnSesnSelectTime);
				
				driver.findElement(clickOnSesnSelectTime).click();
				
//				Setting Activate Date
				
				System.out.println("Setting Activate on Time Date");
				
				waitForClickabilityOf(activeOnTimerTime);
				
				driver.findElement(activeOnTimerTime).clear();
				
				driver.findElement(activeOnTimerTime).sendKeys("30");
				
//				Setting Activate Status to Before
				
				System.out.println("Setting Activate Status to Before");
				
				waitForClickabilityOf(activeBeforeTimer);
				
				Select Before = new Select(driver.findElement(activeBeforeTimer));
				
				Before.selectByIndex(2);
								
//				Setting Deactivate Date
				
				System.out.println("Setting Deactivate Time");
				
				waitForClickabilityOf(deactiveOnTimerTime);
				
				driver.findElement(deactiveOnTimerTime).clear();
				
				driver.findElement(deactiveOnTimerTime).sendKeys("10");
				
//				Setting Deactivate Time
				
				System.out.println("Setting Deactivate Session's End");
				
				waitForClickabilityOf(deactiveSessionStatusEnd);
				
				Select End = new Select(driver.findElement(deactiveSessionStatusEnd));
				
				End.selectByIndex(2);
						
				
			} else {
				
				System.out.println("Without Selecting Any Time");

			}
				
			
			
//		Mapping with Event	
			
		}else if (MapWith.equals("Event")) {
			
			System.out.println("Mapping with Event");
			
//		Mapping with Meeting		
			
		}else if (MapWith.equals("Meeting")){
			
			System.out.println("Mapping with Meeting");
			
			

		}
		
//		Clicking On Save Button to Map
		
		System.out.println("Clicking On Save Button to Map");
		
		waitForClickabilityOf(saveBtn);
		
		driver.findElement(saveBtn).click();
		
		try {
			
			popUpHandeling();
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		
		
		
		return new PollOrVote(driver);
		
	}

}
