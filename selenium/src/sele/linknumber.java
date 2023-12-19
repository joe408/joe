package sele;



import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linknumber {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 String homepage="https://www.facebook.com/login/";
		 driver.get(homepage);
		 
		 System.out.println("total no. is"+driver.findElements(By.tagName("a")).size());
		 
		 WebElement foot=driver.findElement(By.id("pageFooter"));
		 System.out.println("total number of link in footer"+driver.findElements(By.tagName("a")).size());
		 
		 
	}

}
