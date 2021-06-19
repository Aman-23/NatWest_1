package actions;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.MoviePage;

public class MoviePageAction{
	
	WebDriver driver;
	MoviePage Moviepage ;
	
	public MoviePageAction(WebDriver driver) {
		this.driver = driver;
		Moviepage = new MoviePage(driver);
	}
	
    public boolean verifyCastList() throws FileNotFoundException{
    	WebElement cast_list = Moviepage.MovieCast;
    	System.out.println("=================<Movie Cast>==================");
        System.out.println(cast_list.getText());
        if (cast_list.isDisplayed()) {return true;}
        else {return false;}
    }
    
    public boolean verifyPlotSummary(){
        WebElement plot = Moviepage.MoviePlot;
        System.out.println("==================<Movie Plot>=================");
        System.out.println(plot.getText());
        if (plot.isDisplayed()){ return true; }
        else{ return false; }  
    }

	public boolean verifyTitleOfThePage(String PageTitle) {
		
		return driver.getTitle().contains(PageTitle);
	}

}
