package com.action.demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	WebDriver driver;
    
   
	
  @Test(enabled=false)
  public void f() {
	  
	  
	  driver.get("https://www.homeshop18.com");
	  Actions act3=new Actions(driver);
	  WebElement digital=driver.findElement(By.xpath("//a[text()='Digital'][1]"));
	  act3.moveToElement(digital).perform();
  } 
	  
	  @Test(enabled=false)
	  
	 public void test2()
	 {
		  
		 driver.get("https://www.google.com"); 
		 Actions act2=new Actions(driver);
		 WebElement guj=driver.findElement(By.xpath("//a[text()='']"));
		  act2.keyDown(Keys.CONTROL).click(guj).build().perform();
	 }
	  
	  @Test(enabled=false)
	  
	  
	  public void test3()
	  {
		  driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html"); 
		  Actions act=new Actions(driver);
		  WebElement rc=driver.findElement(By.xpath("//span[text()='right click me']"));
	      act.contextClick(rc).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	      driver.switchTo().alert().accept();
			 
	  }
	  
	 @Test (enabled=false)
	 
	 public void test4() 
	 {
		 driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		 Actions act4=new Actions(driver);
		 
	 }
	 
	 @Test
	 public void test5() throws InterruptedException
	 {
		 driver.get("http://jqueryui.com/resources/demos/resizable/default.html");
		 Actions act5=new Actions(driver);
		 WebElement resize= driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));
		 Thread.sleep(1000);
		 act5.dragAndDropBy(resize, 400, 200).perform();
		 Thread.sleep(10000);
		 driver.close();
	 }
  @BeforeTest
  public void beforeTest() {
	  
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
