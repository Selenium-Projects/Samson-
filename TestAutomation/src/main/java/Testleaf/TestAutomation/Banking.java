package Testleaf.TestAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Banking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(20l, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElementById("txtUsername").sendKeys("Admin");
		driver.findElementById("txtPassword").sendKeys("admin123");
		driver.findElementByClassName("button").click();
		
		
		
		
	driver.close();

	}

}
