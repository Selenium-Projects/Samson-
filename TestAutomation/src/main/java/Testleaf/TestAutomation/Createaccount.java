package Testleaf.TestAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Createaccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Initialize Chrome Driver//

	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
				
		//Launch the browser//
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		WebElement login=driver.findElementById("username");
		login.sendKeys("demosalesmanager");
		
		WebElement pass=driver.findElementById("password");
		pass.sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		
		//Create account //
		driver.findElementByLinkText("Create Account").click();

		WebElement accountname = driver.findElement(By.id("accountName"));
		accountname.sendKeys("Samson");

		WebElement groupName = driver.findElementById("groupNameLocal");
		groupName.sendKeys("sam");
		
		WebElement sitename=driver.findElementById("officeSiteName");
		sitename.sendKeys("Open taps");
		
		WebElement annual=driver.findElementById("annualRevenue");
		annual.sendKeys("125000M");
	
		WebElement uom=driver.findElementById("currencyUomId");
		uom.sendKeys("CHF - Swiss Franc");
		
		Thread.sleep(4000);
		
		//Select Class used for dropdown Select by value;
		Select Currency = new Select(driver.findElementById("currencyUomId"));
		Currency.selectByVisibleText("AUD - Australian Dollar");
		Currency.selectByIndex(5);
		Thread.sleep(4000);
		Currency.selectByVisibleText("BYR - Belorussian Ruble");
		
		Select industry = new Select(driver.findElementByName("industryEnumId"));
		industry.selectByVisibleText("Computer Software");
		
		driver.findElementById("numberEmployees").sendKeys("10,000");
		
		Select owner=new Select(driver.findElementByName("ownershipEnumId"));
		owner.selectByIndex(2);
		
		WebElement code=driver.findElementById("sicCode");
		code.sendKeys("1234567890");
		
		WebElement ticker=driver.findElementById("tickerSymbol");
		ticker.sendKeys("ASDFGH");
		
		Select source=new Select(driver.findElementById("dataSourceId"));
		source.selectByIndex(5);
		
		Select market=new Select(driver.findElementById("marketingCampaignId"));
		market.selectByIndex(2);
		
		Select initial=new Select(driver.findElementById("initialTeamPartyId"));
		initial.selectByIndex(2);
		
		WebElement Description=driver.findElementByName("description");
		Description.sendKeys("Learn Automation Now ");
		
		WebElement Important =driver.findElementByName("importantNote");
		Important.sendKeys("Learn API Automation Now ");
		
		WebElement area=driver.findElementById("primaryPhoneAreaCode");
		area.sendKeys("91");
		
		WebElement phone=driver.findElementById("primaryPhoneNumber");
		phone.sendKeys("9884423492");
		
		WebElement ext=driver.findElementById("primaryPhoneExtension");
		ext.sendKeys("600 075");
		
		WebElement person=driver.findElementById("primaryPhoneAskForName");
		person.sendKeys("Anandhi J");
		
		WebElement email=driver.findElementById("primaryEmail");
		email.sendKeys("Duck@gmail.com");
		
		WebElement url=driver.findElementById("primaryWebUrl");
		url.sendKeys("www.corona.com");
		
		WebElement name=driver.findElementById("generalToName");
		name.sendKeys("Kevin");
		
		WebElement Attn=driver.findElementById("generalAttnName");
		Attn.sendKeys("Donald");
		
		WebElement address=driver.findElementById("generalAddress1");
		address.sendKeys("No 5, Pleasant Avenue");
		
		WebElement address1=driver.findElementById("generalAddress2");
		address1.sendKeys("5th Highway Road");
		
		WebElement city=driver.findElementById("generalCity");
		city.sendKeys("Wisconsin");
		
		Select country=new Select(driver.findElementById("generalCountryGeoId"));
		country.selectByVisibleText("Philippines");
		
		WebElement postal=driver.findElementById("generalPostalCode");
		postal.sendKeys("601 326");
		
		WebElement postalcode=driver.findElementById("generalPostalCodeExt");
		postalcode.sendKeys("91");
		
		WebElement create=driver.findElementByClassName("smallSubmit");
		create.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
	
		
		
		
		
				
				

	}

}
