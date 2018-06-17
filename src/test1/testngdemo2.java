package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testngdemo2 {
	WebDriver driver1;
	@BeforeTest
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karish\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver1= new  ChromeDriver();
	}
	     @Parameters({"user","pass"})
		@Test
		public void test(String user, String pass) {
		
			
			driver1.get("https://www.facebook.com/");
			driver1.findElement(By.id("email")).sendKeys(user);
			driver1.findElement(By.name("pass")).sendKeys(pass);
			//driver1.manage().timeouts().wait(1);
			driver1.findElement(By.xpath("//*[@id=\'u_0_2\']")).click();
			
		
	}
	@Test    
public void test1() {
	System.out.println("test");
}
		@AfterMethod
		public void Closebrowser() {
			driver1.close();
		}
} 
