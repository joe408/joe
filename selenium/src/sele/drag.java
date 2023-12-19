package sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement from=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement to=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		WebElement from1=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement to1=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		
		
		Actions act=new Actions(driver);
		act.dragAndDrop(from, to).build().perform();
		Actions act1=new Actions(driver);
		act1.dragAndDrop(from1, to1).build().perform();
		
		
		WebElement drag=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement drop=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		WebElement drag1=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement drop1=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		
		Actions we=new Actions(driver);
		we.dragAndDrop(drag, drop).build().perform();
		Actions we1=new Actions(driver);
		we1.dragAndDrop(drag1,drop1).build().perform();
		
		
		
	}

}
