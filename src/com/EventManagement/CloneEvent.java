package com.EventManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;

public class CloneEvent extends BaseSetUp{
	
	By emailId = By.xpath("//*[@id='txtLogin']");

	By proceedBtn = By.xpath("//*[@id='btnProceed']");

	By pass = By.xpath("//*[@id='txtPass']");

	By signInBtn = By.xpath("//*[@id='btnLogin']");

	By logoutBtn = By.xpath("//*[@id and @onclick and @data-rel]");
	
	By fstCheckBox = By.xpath("//*[@name='ctl00$ContentPlaceHolder1$gvEvent$ctl02$cloneEventId']");
	
	By eventClone = By.xpath("//*[@id='EventClone']");
	
	By extEvntCheckBox = By.xpath("//*[@id='ContentPlaceHolder1_rbtnNewExisting_1']");
	
	By newEvntCheckBox = By.xpath("//*[@id='ContentPlaceHolder1_rbtnNewExisting_0']");
	
	By cloneProceedBtn = By.xpath("//*[@id='NewExistingEventClone']");
	
	By noRadioBtn = By.xpath("//*[@id='EventClonePopup']//label[2]/div[1]");
	
	By yesRadioBtn = By.xpath("//*[@id='EventClonePopup']//label[2]/div[1]");
	
	By eventFullName = By.xpath("//*[@id='ContentPlaceHolder1_txtCloneEventName']");
	
	By eventShortName = By.xpath("//*[@id='ContentPlaceHolder1_txtCloneEventShortName']");
	
	By cEvntStartDate = By.xpath("//*[@id='txtCloneEventStartDate']");
	
	By goToNextMonth = By.xpath("//*[text()='Next']");
	
//	Selecting the Start date as 31th 
	
	By selectStartDate = By.xpath("//*[text()='31']");
	
	By eventProceed = By.xpath("//*[@name='ctl00$ContentPlaceHolder1$ctl00']");
	
	By eventSetupModule = By.xpath("//*[@id='lbleventStupCat0']");
	
	By agendaModule = By.xpath("//*[@id='lblAgendaCat0']");
	
	By gameModule = By.xpath("//*[@id='lblGamificationCat0']");
	
	By liveModule = By.xpath("//*[@id='lblLiveEventCat0']");
	
	By finalProeedBtn = By.xpath("//*[@id='ContentPlaceHolder1_btncloneEvent']");
	
	
	
	

	public CloneEvent(WebDriver driver) {
		super(driver);
		
	}
	
	public CloneEvent cloneToNewEvent(String EmailId, String Password,String EventFullName,String EventShortName){
		
		System.out.println("Entering Email id  is : " + EmailId);

		waitForClickabilityOf(emailId);

		driver.findElement(emailId).clear();

		driver.findElement(emailId).sendKeys(EmailId);

		System.out.println("Clicking on Proceed Button");

		waitForClickabilityOf(proceedBtn);

		driver.findElement(proceedBtn).click();

		System.out.println("Entering Password  is : " + Password);

		waitForClickabilityOf(pass);

		driver.findElement(pass).clear();

		driver.findElement(pass).sendKeys(Password);

		System.out.println("Clicking on Sign in Button");

		waitForClickabilityOf(signInBtn);

		driver.findElement(signInBtn).click();
		
		System.out.println("Selecting the First Existing Event to Clone");

		waitForClickabilityOf(fstCheckBox);

		driver.findElement(fstCheckBox).click();
		
		System.out.println("Clicking on Clone Event");

		waitForClickabilityOf(eventClone);

		driver.findElement(eventClone).click();
		
		System.out.println("Selecting new Event Radio Button");
		
		waitForClickabilityOf(newEvntCheckBox);
		
		if (driver.findElement(newEvntCheckBox).isSelected()==true) {
			
			System.out.println("Already Selected the New Event Radio Button");
			
		} else {
			
			driver.findElement(newEvntCheckBox).click();

		}
		
		System.out.println("Clicking on Proceed Button");

		waitForClickabilityOf(cloneProceedBtn);

		driver.findElement(cloneProceedBtn).click();
		
		System.out.println("Entering Event Full Name as : "+EventFullName+" Clone Test");

		waitForClickabilityOf(eventFullName);

		driver.findElement(eventFullName).sendKeys(EventFullName+" Clone Test");
		
		System.out.println("Entering Event Short Name as : "+EventShortName+"Clone");

		waitForClickabilityOf(eventShortName);

		driver.findElement(eventShortName).sendKeys(EventShortName+"Clone");
		
		System.out.println("Clicking On Event Date");

		waitForClickabilityOf(cEvntStartDate);

		driver.findElement(cEvntStartDate).click();
		
		waitForClickabilityOf(goToNextMonth);

		driver.findElement(goToNextMonth).click();
		
		System.out.println("Selecting the Date as 31st ");

		waitForClickabilityOf(selectStartDate);

		driver.findElement(selectStartDate).click();
		
		System.out.println("Clicking on Proceed Buttton ");

		waitForClickabilityOf(eventProceed);

		driver.findElement(eventProceed).click();
		
		System.out.println("Selecting All Modules");
		
		System.out.println("Clicking on Proceed Buttton ");

		waitForClickabilityOf(finalProeedBtn);

		driver.findElement(finalProeedBtn).click();
		
		
		return new CloneEvent(driver);
		
	}

}
