package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage{
	
	WebDriver driver;
	public WebElement SearchBox;
	public WebElement SearchButton;
	public List<WebElement> SuggestionBox;
	
	public homePage(WebDriver driver) {
		this.driver = driver;
		SearchBox = driver.findElement(By.xpath("//*[@id='suggestion-search']"));
	}
	
	public List<WebElement> suggestionBox() {
		SuggestionBox = driver.findElements(By.xpath("//div[contains(@class,'_26kHO_8bFBduUIYADnVHFY')]"));
		return SuggestionBox;
	}
	
	

}
