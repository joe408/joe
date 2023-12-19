package sele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class title2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		
		System.out.println("Title is " + driver.getTitle());
		String expected="Login • Instagram";
		String actual=driver.getTitle();
		if(expected.contentEquals(actual))
		{
			System.out.println("Test case is passed");
			
		}
		else {
			System.out.println("Test case is failed");
		}
		
		
	}
	

}
