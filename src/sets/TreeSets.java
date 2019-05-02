package sets;

import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TreeSets {
	
public static void main(String[] args) {
	
	
	System.setProperty("webdriver.chrome.driver", 
			"/Users/Guga/Documents/Libraries/drivers/chromedriver");
	
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.get("https://www.etsy.com");
	driver.findElement(By.id("search-query")).sendKeys("wooden spoon"+ Keys.ENTER);
	
	
	List<WebElement> spoons=driver.findElements(By.xpath("//a[starts-with(@class,'buyer-card card')]")); 
	
	System.out.println("Number of spoons links: "+ spoons.size());	
	
	//Set<String> spoonTitles= new HashSet<>();		
	SortedSet<String> spoonTitles= new TreeSet<>();
	
	Iterator <WebElement> spoonsIt=spoons.iterator();
	while(spoonsIt.hasNext()){
				//WebElement link=spoonsIt.next();
		String title=spoonsIt.next().getText();
		spoonTitles.add(title);	
	}
		
	System.out.println("Number of unique spoons: "+ spoonTitles.size());
	
	System.out.println(spoonTitles);
	

}
	
}
