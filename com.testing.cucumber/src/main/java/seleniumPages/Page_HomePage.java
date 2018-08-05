package seleniumPages;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import common.Page_BasePage;
import junit.framework.Assert;
import junit.framework.AssertionFailedError;

public class Page_HomePage extends Page_BasePage {
	WebDriver driver;
	String myName = "surendra";
	public void launchBrowser() {
		//driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "E:\\study\\Apium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public void openGoogleURL() {
		driver.get("http://www.google.com");
	}
		
	public void checkSearchBoxIsDisplayed() {
		if(driver.findElement(By.className("ng-pristine")).isDisplayed()) {
			System.out.println("Search text box is displayed");
		} else {
			System.out.println("Search text box is NOT displayed");
		}
		assertTrue(true);
		//driver.close();
	}
	
	public void openAdoptionPetURL() {
		driver.get("http://www.thetestroom.com/jswebapp/");
	}
	
	public void typeMyName() {
		if(driver.findElement(By.className("ng-pristine")).isDisplayed()) {
			driver.findElement(By.className("ng-pristine")).sendKeys(myName);
		}
		else {
			System.out.println("Name text box is NOT displayed");
		}
	}
	
	@SuppressWarnings("deprecation")
	public void verifyMyName() {
		//String actualName = driver.findElement(By.className("ng-pristine")).getText();
		if(driver.findElement(By.className("ng-binding")).isDisplayed()) {
			String expectedName = driver.findElement(By.className("ng-binding")).getText(); 
			Assert.assertEquals(myName, expectedName);
			assertTrue(true);
		}
		else {
			assertFalse(true);
		}
	}
	
	public void clickOnContinueButton() {
		if(driver.findElement(By.id("continue_button")).isDisplayed()) {
			driver.findElement(By.id("continue_button")).click();
		}
	}
	
	public void selectAnAnimal() {
		Select drpAnimal = new Select(driver.findElement(By.className("ng-pristine")));
		//drpAnimal.selectByIndex(3);
		drpAnimal.selectByVisibleText("Nemo the Fish");
	}
	
	public void selectAnotherAnimal() {
		Select drpAnimal = new Select(driver.findElement(By.className("ng-pristine")));
		drpAnimal.selectByIndex(2);
	}
	
	@SuppressWarnings("deprecation")
	public void verifyConfirmation() {
		if(driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[2]/td/div/p")).isDisplayed()) {
			WebElement confirmation = driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[2]/td/div/p"));
			
			System.out.println("The expected confirmation text is : "+confirmation.getText());
			Assert.assertEquals("Thank you for your selection. Your animal adoption papers will be sent to you shortly with a lovely card from your selected animal.", confirmation.getText());
		}
	}
	
	public void verifyConfirmationForNoSelection(){
		if(driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[2]/td/div/p")).isDisplayed()) {
			System.out.println("The expected confirmation text should not be seen..!!");
			assertFalse(true);
		}
		else {
			assertTrue(true);
		}
	}
	
	public void closeTheBrowser() {
		driver.close();
	}
}
