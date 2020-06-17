package playground;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public HandlingAlerts() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");
		driver.manage().window().maximize();

		/* Simple Alert */

		WebElement alertbox = driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button");
		alertbox.click();

		Alert alert = driver.switchTo().alert();

		// capture alert message
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		Thread.sleep(5000);
		alert.accept();

		/* Confirmation Alert */

		WebElement confirmbutn = driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button");
		confirmbutn.click();
		Alert confirmalert = driver.switchTo().alert();
		confirmalert.dismiss();

		/* Prompt Alert */

		WebElement promptbox = driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button");
		promptbox.click();
		Alert promptalert = driver.switchTo().alert();

		// capture alert message
		String promptMessage = driver.switchTo().alert().getText();
		System.out.println(promptMessage);

		promptalert.sendKeys("Ducking");
		promptalert.accept();

		// capture alert message

		WebElement sweetalert = driver.findElementByXPath("/html/body/div[1]/div/div[3]/section/div[5]/div/div/button");
		sweetalert.click();

		String sweetmessage = driver.findElementByXPath("/html/body/div[2]/div/div[1]").getText();
		System.out.println(sweetmessage);

		WebElement sweetlert = driver.findElementByXPath("/html/body/div[2]/div/div[2]/div/button");
		sweetlert.click();

		driver.quit();

	}

}
