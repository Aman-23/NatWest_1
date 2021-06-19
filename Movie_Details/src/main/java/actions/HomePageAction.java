package actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.homePage;

public class HomePageAction{
	
	homePage HomePage ;
	List<WebElement> myElements;
	WebDriver driver;
	
	public HomePageAction(WebDriver driver) {
		this.driver = driver;
		 HomePage = new homePage(driver);
	}
	
	public void SearchForMovie(String Movie) {
		HomePage.SearchBox.click();
		HomePage.SearchBox.sendKeys(Movie);
	}
	
	public boolean verifySuggestionList(){
		myElements = HomePage.suggestionBox();
		boolean condition = false;
		for(WebElement e : myElements) {
			String movie_name =  e.getText();
			System.out.println(movie_name);
			if (movie_name.contains("Conjuring")) {
				System.out.println(movie_name);
				condition = true;	
			}
		}
		return condition;
	}
	
	public void selectSuggestionFromList() {
		myElements = HomePage.suggestionBox();
    	for(WebElement e : myElements) {
    		String movie_name =  e.getText();
    		if (movie_name.equalsIgnoreCase("The Conjuring")) {
    			e.click();
    			System.out.println(movie_name+" is selected");
    			break;
    		}
    	}
    	
    }

}
