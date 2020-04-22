package Testleaf.TestAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {
	
	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Cognizant Technology Solutions");
		driver.findElementById("createLeadForm_firstName").sendKeys("samson");
		driver.findElementById("createLeadForm_lastName").sendKeys("edward");
		
		//Select Class used for dropdown Select by value;
		
		Select Source = new Select(driver.findElementById("createLeadForm_dataSourceId"));
		Source.selectByVisibleText("Self Generated");
		
		//Select by Index
		
		Select Marketing  = new Select(driver.findElementById("createLeadForm_marketingCampaignId"));
		Marketing.selectByIndex(3);
		
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("sam");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("samu");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("vanakkam");
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Good Morning");
		driver.findElementById("createLeadForm_departmentName").sendKeys("Master of Computer Applications");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("5.4 Million");
		
		Select Currency = new Select(driver.findElementById("createLeadForm_currencyUomId"));
		Currency.selectByVisibleText("AUD - Australian Dollar");
	
		Select Industry = new Select(driver.findElementById("createLeadForm_industryEnumId"));
		Industry.selectByVisibleText("Finance");
		
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("10,000");
		
		Select Ownership = new Select(driver.findElementById("createLeadForm_ownershipEnumId"));
		Ownership.selectByIndex(6);
		
		driver.findElementById("createLeadForm_sicCode").sendKeys("SE2020");
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("1234567890");
		driver.findElementById("createLeadForm_description").sendKeys("Samson Edward working in Senior Automation Test Engineer");
		driver.findElementById("createLeadForm_importantNote").sendKeys("Selenium with Java, Agile Methodolgy, Docker, AWS,Jenkins");
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("91");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9962 765 260");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("91");
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Jason Roy");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("mailtosam.cts@gmail.com");
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("seleniumorg");
		driver.findElementById("createLeadForm_generalToName").sendKeys("sam");
		driver.findElementById("createLeadForm_generalAttnName").sendKeys("Edward");
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("502 Pleasant Avenue");
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("Devaraj Street, V.O.C Nagar Pammal");
		driver.findElementById("createLeadForm_generalCity").sendKeys("Wisconsin");
		
		Select State = new Select(driver.findElementById("createLeadForm_generalStateProvinceGeoId"));
		State.selectByIndex(6);
		
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("600199");
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("601302");
		
		//driver.findElement(By.xpath("//*[@id='ext-gen605']")).click();
		driver.findElementByName("submitButton").click();
		
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
				
		driver.close();

		
		
		
		
		

}
}