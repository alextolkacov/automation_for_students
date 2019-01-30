package stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BaseFunc;
import pages.HomePage;
import pages.RegistrationPage;

import java.util.Map;

public class FirstCucumberStepDefs {
    private String URL = "https://staging.koke.kz";

    private BaseFunc baseFunc = new BaseFunc();
    HomePage homePage;
    RegistrationPage registrationPage;

    @Given("Koke home page")
    public void open_home_page() {
        baseFunc.openPage(URL);
        homePage = new HomePage(baseFunc);
    }

    @Then("we are pressing registration btn")
    public void push_registration_btn() {
        homePage.clickOnLoan();
    }

    @Then("we are on Registration page")
    public void get_registration_page() {

    }

    @When("we are filling in registration form:")
    public void fill_forms(Map<String, String> params) {

    }

    @When("we are pressing Submit button")
    public void press_submit_btn() {

    }

    @Then("we are on the Step 2 page")
    public void get_step_two_page() {

    }
}
