# testingCucumber

Cucumber test cases for the user story 'Zoo Adoption'.

***
### Installations and Setups (This test project has been tested for Windows 10)
***

1. Download and install latest version of Java (JDK).  Ideally, any Java 8 version should work fine with Selenium.
2. Setup Java Environment Variables. This project mainly requires JAVA_HOME and PATH.
3. Download and install Eclipse IDE for Java.
4. Download Apache Maven, setup maven environmental variables.
5. Import the Cucumber project into eclipse as maven project.
    1. Clone the cucumber project from following git repository and import it into eclipse as a general project. With this, the project would be stored to hard drive. [https://github.com/surendra2016/testingCucumber.git] (https://github.com/surendra2016/testingCucumber.git)
    2. Import the project from hard drive as a Maven project into eclipse.
6. The imported project contains all the capabilities defined in order to invoke the tests. 'pom.xml' file contains all the necessary dependencies.
7. Following is the project structure:
    1. The sourceFolder src/main/java contains 4 packages namely common, seleniumPages(contains selenium code), stepDefinitions (contains step definitions file), testRunners (contains test rnnuer class that connects feature file to step definitions file).
    2. The sourceFolder resources contains a package 'features'. This package contains the feature file.
8. Expand the src/testRunners package and execute the file 'TestRunner_HomePage.java'.

***
### scenarios covered
***
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

Scenario: Adopt an Nemo and verify confirmation text
Given I launch Chrome browser
When I open adoption homepage
Then I type my name
And I click continue button
And select an animal to adopt
And I click continue button
And I verify the confirmation text
And close the browser

Scenario: Adopt another Animal and verify confirmation text
Given I launch Chrome browser
When I open adoption homepage
Then I type my name
And I click continue button
And select another animal to adopt
And I click continue button
And I verify the confirmation text
And close the browser

Scenario: Try to Adopt an animal without entering name
Given I launch Chrome browser
When I open adoption homepage
And I verify that I must enter the name
And I try to click continue button
And close the browser

Scenario: Try to Adopt an animal without selecting any animal
Given I launch Chrome browser
When I open adoption homepage
Then I type my name
And I click continue button
And do not select an animal
And I click continue button
And I should not see the confirmation text
And close the browser
