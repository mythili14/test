package test1;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

	public class testdropdown {
WebDriver driver1;
@BeforeTest
		public void setup(){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karish\\Downloads\\chromedriver_win32\\chromedriver.exe");
		}
@Test
public void SelectList() {

// TODO Auto-generated method 
WebDriver driver= new ChromeDriver();
driver.get("https://www.expedia.ca");

Select dropdown = new Select(driver.findElement(By.id("hotel-1-adults-hp-hotel")));
dropdown.selectByIndex(4);
//List noOfAdults = (List) dropdown.getOptions();
WebElement e3= dropdown.getOptions().get(4);
    System.out.println(e3.getText());
List <WebElement> noOfAdults = dropdown.getOptions();
    
    for (int i=0;i<noOfAdults.size();i++)
    {
    System.out.println(noOfAdults.get(i).getText());
    }
   

}
	}
	



		