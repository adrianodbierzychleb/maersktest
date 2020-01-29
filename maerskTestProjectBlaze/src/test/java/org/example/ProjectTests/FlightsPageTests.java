package org.example.ProjectTests;

import org.example.blazeSite.BlazeSite;
import org.example.seleniumConfig.SeleniumConfig;
import org.junit.Before;
import org.junit.Test;

public class FlightsPageTests {


    private static BlazeSite blazeSite;

    @Before
    public void setup(){
        SeleniumConfig seleniumConfig = new SeleniumConfig("chrome", "/Users/tech-a050/Desktop/adrian/maerskTestProjectBlaze/chromedriver");
        blazeSite = new BlazeSite(seleniumConfig.getDriver());
    }


    @Test
    public void shouldLoadFlightsPage(){
        blazeSite.homepage.goToHomeapgeURL().submitSelection();
    }

    @Test
    public void shouldSelectFirstAvailableFlight(){
        blazeSite.homepage.goToHomeapgeURL().submitSelection();
        blazeSite.flightsPage.setRandomFlight("1").SelectFlight();
    }

    @Test
    public void shouldSelectCheapestFlight(){
        blazeSite.homepage.goToHomeapgeURL().submitSelection();
        blazeSite.flightsPage.setRandomFlight("3").SelectFlight();
    }

    @Test
    public void shouldFailBySelectingFlightNotAvailable(){
        blazeSite.homepage.goToHomeapgeURL().submitSelection();
        blazeSite.flightsPage.setRandomFlight("7").SelectFlight();
    }


}
