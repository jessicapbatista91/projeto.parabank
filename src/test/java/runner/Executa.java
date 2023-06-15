package runner;

import org.openqa.selenium.chrome.ChromeDriver;

import drivers.Drivers;

public class Executa extends Drivers {
	
	public static void abrirNavegador() {
		String url = "https://parabank.parasoft.com/parabank/index.htm";
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

}
