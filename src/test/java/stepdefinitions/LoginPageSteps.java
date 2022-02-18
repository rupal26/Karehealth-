package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pages.*;
import com.qa.factory.*;

public class LoginPageSteps {
	
private WebDriver driver =DriverFactory.getDriver();
 private LoginPage lp=new LoginPage (driver);
 
	
	@Given("User is on Login page")
	public void user_is_on_login_page() {
		driver.get("http://karehealth.menpaniproducts.com/admin/auth/login");
	}

	@Given("User enter username")
	public void user_enter_username() {
		lp.enterUserName();
	}	

	@Given("User enter password")
	public void user_enter_password() {
		lp.enterPassword();	
	}
	
	@Given("User click on login button")
	public void user_click_on_login_button() {
		lp.clickOnLogin();
	}
	
	@Then("User is displayed webpage with tittle {string}")
	public void user_is_displayed_webpage_with_(String  title ) 
	{String pageHeading = driver.findElement(By.tagName("h1")).getText();
	Assert.assertEquals(pageHeading, title);	    
}}
		
	
	    
		