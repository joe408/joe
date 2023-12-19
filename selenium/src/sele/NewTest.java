package sele;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	  public String baseurl="http://demo.guru99.com/test/newtours/";
	  String driverpath="C:\\Users\\hp\\OneDrive\\Desktop\\Selenium\\chromedriver.exe";
	  public WebDriver driver;
	  public String expected=null;
	  public String actual=null;
  @Test(priority=0)
  public void f() {
      driver.findElement(By.linkText("REGISTER")).click() ;
      expected = "Register: Mercury Tours";
      actual = driver.getTitle();
      Assert.assertEquals(actual, expected);
  }
  @Test(priority = 1)
public void support() {
    driver.findElement(By.linkText("SUPPORT")).click() ;
    expected = "Under Construction: Mercury Tours";
    actual = driver.getTitle();
    Assert.assertEquals(actual, expected);
  }
  @BeforeMethod
  public void beforeMethod() {
	  String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);

  }

  @AfterMethod
  public void afterMethod() {
          driver.findElement(By.linkText("Home")).click() ;

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
