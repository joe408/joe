package sele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class title {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		System.out.println("Title is "+driver.getTitle());
		String expected="gduhf";
		String actual=driver.getTitle();
		if(expected.contentEquals(actual))
		{
			System.out.println("test case is passed");
			
		}
		else
		{
			System.out.println("test case is failed");
		}
		

	}

}
