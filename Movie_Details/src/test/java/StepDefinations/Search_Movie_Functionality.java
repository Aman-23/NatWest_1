package StepDefinations;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;

import actions.HomePageAction;
import actions.MoviePageAction;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.TestBase;

public class Search_Movie_Functionality extends TestBase{
	
	HomePageAction HomePage ;
	MoviePageAction Moviepage ;
	
	@Before
	public  void setUpBrowser() throws IOException {
		initialization();
	}
	
	@After
	public void deriver_close() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}
	
	@Given("^User open imdb website on browser$")
	public void user_open_imdb_website_on_browser() {
		Assert.assertTrue(driver.getTitle().contains("IMDb"));
	}
	
	
	@When ("^User enter (.*) in search bar$")
	public void user_enter_search_value_in_search_bar(String movieName) throws FileNotFoundException
	{
		HomePage = new HomePageAction(driver);
		HomePage.SearchForMovie(movieName);
		
	}
	
	@Then ("^User get the related suggestion list$")
	public void user_get_the_related_suggestion_list()
	{
		Assert.assertTrue("Movie name not found", HomePage.verifySuggestionList());
	}
	
	
	@And ("^User select a suggestion from the suggestion list$")
	public void user_select_a_suggestion_from_the_suggestion_list()
	{
		HomePage.selectSuggestionFromList();
	}
	
	@Then ("^User get navigated to the selected suggestion page$")
	public void user_get_navigated_to_the_selected_suggestion_page() throws FileNotFoundException
	{
		Moviepage = new MoviePageAction(driver);
		Assert.assertTrue("User is navigated to wrong page",Moviepage.verifyTitleOfThePage("The Conjuring"));
	}
	
	@And ("^User get the plot of the searched value$")
	public void user_get_the_plot_of_the_searched_value()
	{
		Assert.assertTrue("Plot not found",Moviepage.verifyPlotSummary());
		
	}
	
	@And ("^User get the cast of the searched value$")
	public void user_get_the_cast_of_the_searched_value() throws FileNotFoundException
	{
		Assert.assertTrue("Cast not found",Moviepage.verifyCastList());
		
	}

}
