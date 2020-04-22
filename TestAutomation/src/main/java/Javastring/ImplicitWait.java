package Javastring;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// Implicit Wait - Here the specified Implicit Wait time frame is 15 seconds.
		// It waits 15 seconds of time frame for the element to load.
		// It throws an exception, if the element is not loaded within the specified
		// time frame
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		// To open a website "SoftwareTestingo"
		
		driver.get("https://www.softwaretestingo.com");
		
		// To maximize the browser window
		 
		// To close the browser
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.close();

	}

}
