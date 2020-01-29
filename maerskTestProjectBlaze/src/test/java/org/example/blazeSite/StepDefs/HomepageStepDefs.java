package org.example.blazeSite.StepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.example.blazeSite.BlazeSite;
import org.example.blazeSite.Pages.Homepage;
import org.example.seleniumConfig.SeleniumConfig;

class BlazeHomeStepDefs {
    private static SeleniumConfig seleniumConfig = new SeleniumConfig("chrome", "/Users/tcadmin/Desktop/chromedriver/chromedriver");

    private static BlazeSite blazeSite = new BlazeSite(seleniumConfig.getDriver());
    @Given("I am able to select my flight location")
    public void i_am_able_to_select_my_flight_location() {

        blazeSite.homepage.goToHomeapgeURL();
    }

    @And("Select my locations")
    public void select_my_location(){
        blazeSite.homepage.setRandomFrom("2").setDropDownFromPath().selectFromDestination();
        blazeSite.homepage.setRandomTo("4").setDropDownToPath().selectFromTo();
        blazeSite.homepage.submitSelection();

    }
    @When("I select my flight")
    public void i_select_my_flight() {
        blazeSite.flightsPage.setRandomFlight("2").setFligthPath();
        blazeSite.flightsPage.SelectFlight();
    }
    @And("I fill my details")
    public void i_fill_my_details() {
        blazeSite.detailsPage.setCard("2").setCardPath();
        blazeSite.detailsPage.fillInName("Bogdan").fillInAddress("123 test Address").fillCity("belgrade").fillState("Balkans").fillZipcode("32456").selectCard().fillCardNumber("2761874631784").fillCardMonth("12").fillCardYear("2022").fillCardName("Bogdan Bogdanov");
    }
    @Then("I click upon the submit button")
    public void i_click_the_submit_button(){

        blazeSite.detailsPage.tickRememberMe().submitForm();
    }




}