package playground;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		Thread.sleep(10000);
		
		driver.manage().window().maximize();

		driver.get("http://leafground.com/pages/Edit.html");
		//driver.findElementByLinkText("Edit");
		
		WebElement email=driver.findElementById("email");
		email.sendKeys("duck@gmail.com");
			
		WebElement append=driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input");
		append.sendKeys("Welcome to Selenium");
		
		WebElement gettextbox=driver.findElementByName("username");
		String value=gettextbox.getAttribute("value");
		System.out.println("value");
		
		WebElement clearfield=driver.findElementByName("username");
		clearfield.clear();
		
		WebElement disablebox=driver.findElementByXPath("/html/body/div/div/div[3]/section/div[5]/div/div/input");
		boolean enable=disablebox.isEnabled();
		System.out.println("enable");
		
		
		driver.close();
		

	}

}
