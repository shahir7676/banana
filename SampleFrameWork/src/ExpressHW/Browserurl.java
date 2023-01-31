package ExpressHW;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Browserurl {
	
	ChromeDriver driver = null;
	public ChromeDriver getDriver() {
		driver = new ChromeDriver();
		driver.get("https://www.express.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
		
	}
	
	public void closebrowser() {
		driver.quit();
	}
}
