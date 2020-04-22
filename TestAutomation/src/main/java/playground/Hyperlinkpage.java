package playground;

import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlinkpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/");
		driver.findElementByLinkText("Link").click();
		driver.manage().window().maximize();


	}

}
