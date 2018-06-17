package test1;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class testngdemo {
	
	WebDriver driver1;

	@BeforeTest
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karish\\Downloads\\chromedriver_win32\\chromedriver.exe");
	}
	@Parameters({"user","pass"})
	@Test
	public void testLogin(String user,String pass) {
		// TODO Auto-generated method stub
		
		driver1= new  ChromeDriver();
		driver1.get("https://login.salesforce.com/?locale=ca");
		WebElement userName = driver1.findElement(By.id("username"));
		WebElement password = driver1.findElement(By.name("pw"));
		WebElement loginButton= driver1.findElement(By.xpath("//input[@id='Login']"));
		userName.sendKeys(user);
		password.sendKeys(pass);
		loginButton.click();
		//Find element
		WebElement errormessage= driver1.findElement(By.xpath("//div[@id='error']"));
		
		//Get text save in String
		String y= errormessage.getText();
		System.out.println(y);
	Assert.assertEquals(y, "Please check your username and password. If you still can't log in, contact your Salesforce administrator.\r\n" + 
		 		"");
	}
	@AfterTest
	public void Closebrowser() {
		driver1.close();
	}

}
