package sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		
		WebElement radio1=driver.findElement(By.id("vfb-7-1"));
		WebElement radio2=driver.findElement(By.id("vfb-7-2"));
		radio1.click();
		System.out.println("option one is selected");
		radio2.click();
		System.out.println("option 2 is selected");
		
		
		WebElement checkbox1=driver.findElement(By.id("vfb-6-0"));
		WebElement checkbox2=driver.findElement(By.id("vfb-6-1"));
		checkbox1.click();
		System.out.println("check box 1 is selected");
		checkbox2.click();
		System.out.println("check box 2 is selected");
		
		
	}

}
