package sele;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Testng {
	public String baseurl="https://demo.guru99.com/test/newtours/";
	String driverpath="C:\\Users\\hp\\OneDrive\\Desktop\\Selenium\\chromedriver.exe";
	public WebDriver driver;
  @Test
  public void f() {
	  String expectedTitle="Welcome:Mercury Tours";
	  String actualTitle=driver.getTitle();
	  Assert.assertEquals(actualTitle,expectedTitle);
	  System.out.println(driver.getTitle());
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("launching firefox browser");
	  System.setProperty("webdriver.chrome.driver",driverpath);
	  driver=new FirefoxDriver();
	  driver.get(baseurl);
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
