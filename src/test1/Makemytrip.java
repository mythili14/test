package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Makemytrip {
	
@BeforeTest
public void setup(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karish\\Downloads\\chromedriver_win32\\chromedriver.exe");
}

@Test	
	public void searchTrips_validInput_expectedOutput()
	{
		WebDriver cDriver= new  ChromeDriver();
		cDriver.get("https://www.makemytrip.com/");
		System.out.println("hello karish");
		WebElement from = cDriver.findElement(By.id("hp-widget__sfrom"));
	//	WebElement to = cDriver.findElement(By.id("hp-widget__sTo"));
	//	WebElement departDate = cDriver.findElement(By.id("hp-widget__depart"));
	//	WebElement returnDate = cDriver.findElement(By.id("hp-widget__return"));
	//	WebElement passengerClass = cDriver.findElement(By.id("hp-widget__paxCounter_pot"));
		
		from.click();
		from.clear();
		from.sendKeys("Hyder");
		//cDriver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	//	WebDriverWait wait = new WebDriverWait(cDriver, 10);
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='ui-autocomplete-category']")));
		
		from.sendKeys(Keys.ARROW_DOWN);
		from.sendKeys(Keys.ENTER);
				
		
	}
	
}


