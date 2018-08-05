Feature: Homepage
This feature verifies the functionality on  Homepage
 
Scenario: Check that main elements on Homepage are displayed
Given I launch Chrome browser
When I open Homepage
Then I verify that the page displays search text box
And close the browser

Scenario: Check name on the home page
Given I launch Chrome browser
When I open adoption homepage
Then I type my name
And verify my name
And close the browser

Scenario: Adopt an Animal
Given I launch Chrome browser
When I open adoption homepage
Then I type my name
And I click continue button
And select an animal to adopt
And I click continue button
And I verify the confirmation text
And close the browser