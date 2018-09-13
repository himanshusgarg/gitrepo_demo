package com.action.demo;

import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class Browser_1 {
	
	WebDriver driver1;
	
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		 
	  ChromeOptions chrome = new ChromeOptions();
	//  chrome.addExtensions(new File("C:\\SeleniumAdvancedTraining\\KatalonChrome.crx"));
	  chrome.addExtensions(new java.io.File("C:\\test\\KatalonChrome.crx"));
	//  chrome.addExtensions("C:\\SeleniumAdvancedTraining\\KatalonChrome.crx");
	 		
	  driver1 = new ChromeDriver(chrome);
	  
	  driver1.manage().window().maximize();
	  driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
  
  }
  @BeforeTest
  public void beforeTest() {
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
