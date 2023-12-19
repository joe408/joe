package sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/login.html");
		
		driver.findElement(By.id("email")).sendKeys("gddbh");
		driver.findElement(By.id("passwd")).sendKeys("67886");
		driver.findElement(By.id("SubmitLogin")).click();
		

	}

}
