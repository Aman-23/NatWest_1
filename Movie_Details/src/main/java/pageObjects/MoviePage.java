package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MoviePage{
	
	public WebElement MoviePlot ;
	public WebElement MovieCast  ;
	
	public MoviePage(WebDriver driver) {
		MoviePlot = driver.findElement(By.xpath("//div[contains(@class,'Storyline')]"));
		MovieCast = driver.findElement(By.xpath("//div[contains(@class,'title-cast__grid')]"));
	}

}
