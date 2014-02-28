package abril.da.test.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BasePage {
	public static WebDriver driver;
	public static String baseUrl = "http://qa.dra.scipioneatica.com.br/";

	public static void startFirefoxBrowser() {
		FirefoxProfile profile = new FirefoxProfile();
		profile.setAcceptUntrustedCertificates(true);
		driver = new FirefoxDriver(profile);
	}

	public static void stopFirefoxBrowser() {
		if (driver != null && ((RemoteWebDriver) driver).getSessionId() != null) {
			driver.close();
			driver.quit();
		}
	}
	
	public boolean isElementPresent(By id) {
		WebElement findElement = driver.findElement(id);
		if (findElement == null){
			return false;
		}else{
			return true;
		}
	}
	
}
