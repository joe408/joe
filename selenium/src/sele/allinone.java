package sele;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class allinone {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String homepage="https://www.facebook.com/login/";
		driver.get(homepage);
		
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenshot,new File("C:\\Users\\hp\\OneDrive\\Desktop\\Joepaul\\one.jpeg"));
		
		
		System.out.println("Title is"+driver.getTitle());
		String expected="hgjhkd";
		String actual=driver.getTitle();
		
		
		if(expected.contentEquals(actual))
		{
			System.out.println("Test case is passed");
		}
		else {
			System.out.println("test case is failed");	
		}
		
		
		System.out.println("total no. is"+driver.findElements(By.tagName("a")).size());
		 WebElement foot=driver.findElement(By.id("pageFooter"));
		 System.out.println("total number of link in footer"+driver.findElements(By.tagName("a")).size());
		
		 
		 driver.findElement(By.linkText("Forgotten account?")).click();
		 Set<String> a=driver.getWindowHandles();
		 Iterator<String> it=a.iterator();
		 while(it.hasNext())
		 {
		 String childwindow=it.next();
		 driver.switchTo().window(childwindow);
		 }
		
		}
	}

