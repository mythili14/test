package test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class footerlink {
	WebDriver driver;
/*	
@BeforeTest	
public void setup (){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karish\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://qaclickacademy.com/practice.php");
}*/
		
@Test
public void pageLink() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karish\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://qaclickacademy.com/practice.php");

	Thread.sleep(2000L);
List <WebElement> allLinks = driver.findElements(By.tagName("a"));
System.out.println("Number of links in this page: "+ allLinks.size());
System.out.println("The links are: ");
for(int i=0; i<allLinks.size(); i++)
{  
System.out.println(allLinks.get(i).getText());
}
}
@Test
		public void linkOfFooter(){
		//taking panel as element
		WebElement panel = driver.findElement(By.id("gf-BIG"));
		//taking all links under a panel
		List <WebElement> footer= panel.findElements(By.tagName("a"));
		System.out.println("Number of links is footer:"+footer.size());
		System.out.println("The actual footer links are:");
		for(int x= 0; x<footer.size(); x++)
		{
		System.out.println(footer.get(x).getAttribute("href"));
		}
		}

}
