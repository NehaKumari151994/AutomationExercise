package stepDefination;

	import cucumber.api.PendingException;
	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.When;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.And;
	import cucumber.api.junit.Cucumber;
	import org.junit.runner.RunWith;

	@RunWith(Cucumber.class)
	public class OrderPlacedAndOrderHistoryStep  {

		@Given("^User has place an order of t-shirt$")
	    public void user_has_place_an_order_of_tshirt() throws Throwable {
	        throw new PendingException();
	    }

	    @When("^User has confirm the payment for order$")
	    public void user_has_confirm_the_payment_for_order() throws Throwable {
	        throw new PendingException();
	    }

	    @Then("^Order has been placed successfully$")
	    public void order_has_been_placed_successfully() throws Throwable {
	        throw new PendingException();
	    }

	    @And("^Order is displayed in the order history page$")
	    public void order_is_displayed_in_the_order_history_page() throws Throwable {
	        throw new PendingException();
	    }
		    


	}

