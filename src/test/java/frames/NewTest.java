package frames;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	WebDriver driver;
  @Test(enabled = false)
  public void f() throws InterruptedException {
	  
	  driver.get("http://jqueryui.com/dialog/");
	  Actions act=new Actions(driver);
	WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	  driver.switchTo().frame(frame);
	  WebElement close=driver.findElement(By.xpath("//Button[text()='Close']"));
	  Thread.sleep(5000);
	  close.click();
	  driver.switchTo().defaultContent();
	  
  }
  
  @Test(enabled = false)
  
  public void test()
  {
	  driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
	  Actions act2=new Actions(driver);
	  WebElement frame=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
	  driver.switchTo().frame(frame);
	  //2 times frame(0);
	  
	  WebElement frame1=driver.findElement(By.xpath("//iframe[@src='demo_iframe.htm']"));
	  driver.switchTo().frame(frame1);
	 System.out.println("text is"+ driver.findElement(By.xpath("html/body/h1")).getText());
  }
  
  @Test(enabled = false)
  
  public void upload()
  {
	  driver.get("www.wikisend.com");
	  
  }
  
  @Test(enabled = false)
  public void screenshot() throws IOException
  {
	driver.get("https://docs.seleniumhq.org") ;
	File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(srcfile, new File("C:\\test\\abc.png"));
		

  }
	@Test
	
	public void javascript()
	{
	driver.get("https://www.google.com");
	driver.findElement(By.name("q")).sendKeys("selenium hq");
	WebElement element= driver.findElement(By.name("btnK"));
	
	JavascriptExecutor exe= (JavascriptExecutor)driver;
	exe.executeScript("arguments[0].click();", element);
	exe.executeScript("window.scrollBy(0,400);");
	
	}
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver=new ChromeDriver();
	  driver.close();
  }

}
