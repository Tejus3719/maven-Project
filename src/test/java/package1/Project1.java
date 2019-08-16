package package1;

import org.openqa.selenium.WebDriver;

public class Project1 {
	
    WebDriver driver;
    
    System.setProperty("webdriver.gecko.driver", pathToGeckoDriver + "\\geckodriver.exe");
    
    driver = new FirefoxDriver();
    
    driver.get("http://artoftesting.com");
    
    driver.quit();


}
