package Package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.google.common.base.Strings;

public class Snippet {
	public static void main(Strings[] args) {
		
		WebDriver driver;
		@Test
	    System.setProperty("webdriver.gecko.driver", "");
	    
	    System.setProperty("webdriver.gecko.driver", pathToGeckoDriver + "\\geckodriver.exe");
	    driver = new FirefoxDriver();
	    driver.get("http://artoftesting.com");
	    driver.quit();

		
	}
}

