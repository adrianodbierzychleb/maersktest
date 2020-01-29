package org.example.ProjectTests;

import org.example.blazeSite.BlazeSite;
import org.example.seleniumConfig.SeleniumConfig;
import org.junit.Before;
import org.junit.Test;

public class DetailsTest {

    private static BlazeSite blazeSite;

    @Before
    public void setup(){
        SeleniumConfig seleniumConfig = new SeleniumConfig("chrome", "/Users/tech-a050/Desktop/adrian/maerskTestProjectBlaze/chromedriver");
        blazeSite = new BlazeSite(seleniumConfig.getDriver());
    }


    @Test
    public void shouldGoToFillIndetailsPage(){
        blazeSite.homepage.goToHomeapgeURL();
        blazeSite.homepage.submitSelection();
        blazeSite.flightsPage.setRandomFlight("1").setFligthPath();
        blazeSite.flightsPage.SelectFlight();
    }


    @Test
    public void shouldFillInAddressOnly(){
        blazeSite.homepage.goToHomeapgeURL();
        blazeSite.homepage.submitSelection();
        blazeSite.flightsPage.setRandomFlight("1").setFligthPath();
        blazeSite.flightsPage.SelectFlight();
        blazeSite.detailsPage.fillInAddress("123 Test lane").fillCity("London").fillState("UK").fillZipcode("n14dl");

    }

    @Test
    public void inputingCardNumberAsLetters(){
        blazeSite.homepage.goToHomeapgeURL();
        blazeSite.homepage.submitSelection();
        blazeSite.flightsPage.setRandomFlight("1").setFligthPath();
        blazeSite.flightsPage.SelectFlight();
        blazeSite.detailsPage.fillCardNumber("test 123");
    }


}
