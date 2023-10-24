package Curs13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium {
	
	@Test
	public void openBrowser(){
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://keybooks.ro/");
		
		
		//<a href="https://keybooks.ro/contacts/">Contacts</a>
		driver.findElement(By.linkText("CONTACTS")).click();
		
		/*tagname
		 * linkText
		 * 
		 */
		
	}
	

	
	
}
