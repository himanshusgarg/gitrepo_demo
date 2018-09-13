package frames;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterTest;

public class FirefoxP {
	
	WebDriver driver;
  @Test
  public void f() {
	  
	  driver.get("https://www.google.com");
  }
  @BeforeTest
  public void beforeTest() {
	  
	 FirefoxProfile profile = new FirefoxProfile();
	 profile.setPreference("general.useragent.override", "iPhone");
	
	  System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.21.0-win32\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
