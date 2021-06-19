Feature: Searching a Movie and Fetching Its Cast and Plot

 	Scenario Outline: Verifying Searching A Movie and getting Appropriate Suggestions
        Given User open imdb website on browser
        When User enter <movie name> in search bar
        Then User get the related suggestion list
        
        Examples:
        |movie name|
        |Conjuring |
    

	Scenario Outline: Selecting Required Movie from the suggestions list
		Given User open imdb website on browser
        When User enter <movie name> in search bar
        And User select a suggestion from the suggestion list
		Then User get navigated to the selected suggestion page
		
		Examples:
        |movie name|
        |Conjuring |
		
	Scenario Outline: Verifying the Cast and Plot Details Of the Movie
		Given User open imdb website on browser
        When User enter <movie name> in search bar
        And User select a suggestion from the suggestion list
		Then User get navigated to the selected suggestion page
		And User get the plot of the searched value
		And User get the cast of the searched value
		
		Examples:
        |movie name|
        |Conjuring |