package stepDefination;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.PendingException;
import cucumber.api.junit.Cucumber;
import pageObject.LoginPage;
import pageObject.MyAccountObjects;

import org.junit.runner.RunWith;
import Cucumber.Ecommerce.Base;

@RunWith(Cucumber.class)
public class MyAccountStep extends Base {

	
	
		 // TODO Auto-generated constructor stub
	//LoginPage ln = new LoginPage(driver);
	@Given("^Browse the Ecommerse website \"([^\"]*)\"$")
    public void browse_the_ecommerse_website_something(String strArg1) throws Throwable {
		driver = initializeDriver();
        driver.get(strArg1);
    }
	@And("^User is signed in to EcommerceWeb with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_is_signed_in_to_ecommerceweb_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
		LoginPage ln = new LoginPage(driver);
		ln.signIn().click();
		ln.Username().sendKeys(strArg1);
		ln.Password().sendKeys(strArg2);
		ln.Submit().click();
	}

	@And("^Navigate to my account personal information update page$")
    public void navigate_to_my_account_personal_information_update_page() throws Throwable {
        MyAccountObjects info = new MyAccountObjects(driver);
        info.PersonalInfo().click();
    }
    @When("^User has to update the first name \"([^\"]*)\" on my account personal information page$")
    public void user_has_to_update_the_first_name_something_on_my_account_personal_information_page(String strArg1) throws Throwable {
    	MyAccountObjects info = new MyAccountObjects(driver);
    	info.FirstName().clear();
    	info.FirstName().sendKeys(strArg1);
    	info.OldPassword().sendKeys("Selenium123.");
    	info.SaveChange().click();
    }

    @Then("^first name on my account has been updated successfully$")
    public void first_name_on_my_account_has_been_updated_successfully() throws Throwable {
        
    }   

}
