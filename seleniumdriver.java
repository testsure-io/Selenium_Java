package packagedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Chrome.ChromeDriver;


public class seleniumdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vithika Patel\\eclipse-workspace\\SeleniumWithJava\\server\\chrome-win64");
		
		driver = new ChromeDriver();
		driver.get("https://chromedriver.chromium.org/downloads");
		
		
		
		
		
	}

}
