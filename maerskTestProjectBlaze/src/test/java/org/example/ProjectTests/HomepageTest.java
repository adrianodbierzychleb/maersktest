package org.example.ProjectTests;

import io.cucumber.java.nl.Stel;
import org.example.blazeSite.BlazeSite;
import org.example.seleniumConfig.SeleniumConfig;
import org.junit.Before;
import org.junit.Test;

public class HomepageTest {

    private static BlazeSite blazeSite;

    @Before
    public void setup(){
        SeleniumConfig seleniumConfig = new SeleniumConfig("chrome", "/Users/tech-a050/Desktop/adrian/maerskTestProjectBlaze/chromedriver");
        blazeSite = new BlazeSite(seleniumConfig.getDriver());
    }


    @Test
    public void ShouldLoadHomePage(){
        blazeSite.homepage.goToHomeapgeURL();
    }

    @Test
    public void ShouldBookFlightFromParisToLondon(){
        blazeSite.homepage.goToHomeapgeURL();
        blazeSite.homepage.setRandomFrom("1").setDropDownFromPath();
        blazeSite.homepage.selectFromDestination();
        blazeSite.homepage.setRandomTo("3").setDropDownToPath();
        blazeSite.homepage.selectFromTo();
        blazeSite.homepage.submitSelection();
        blazeSite.flightsPage.setRandomFlight("2").setFligthPath();
        blazeSite.flightsPage.SelectFlight();
        blazeSite.detailsPage.setCard("2").setCardPath();
        blazeSite.detailsPage.fillInName("Bogdan").fillInAddress("123 test Address").fillCity("belgrade").fillState("Balkans").fillZipcode("32456").selectCard().fillCardNumber("2761874631784").fillCardMonth("12").fillCardYear("2022").fillCardName("Bogdan Bogdanov");
        blazeSite.detailsPage.tickRememberMe().submitForm();
    }

    @Test
    public void ShouldDisplayFlightsFromBostonToBerlin(){
        blazeSite.homepage.goToHomeapgeURL();
        blazeSite.homepage.setRandomFrom("3").setDropDownFromPath();
        blazeSite.homepage.selectFromDestination();
        blazeSite.homepage.setRandomTo("4").setDropDownToPath();
        blazeSite.homepage.selectFromTo();
        blazeSite.homepage.submitSelection();
    }

    @Test
    public void ShouldSelectStartingPointPhiladeplhia(){
        blazeSite.homepage.goToHomeapgeURL();
        blazeSite.homepage.setRandomFrom("2").setDropDownFromPath();
        blazeSite.homepage.selectFromDestination();
    }

    @Test
    public void ShouldSelectDestinationAsLondon(){
        blazeSite.homepage.goToHomeapgeURL();
        blazeSite.homepage.setRandomTo("3").setDropDownToPath();
        blazeSite.homepage.selectFromTo();
    }


    @Test
    public void shouldSelectPortlandAndDublin(){
        blazeSite.homepage.goToHomeapgeURL();
        blazeSite.homepage.setRandomFrom("4").setDropDownFromPath();
        blazeSite.homepage.selectFromDestination();
        blazeSite.homepage.setRandomTo("6").setDropDownToPath();
        blazeSite.homepage.selectFromTo();
    }

    @Test
    public void ShouldFailBySelectingUnavailableDestination(){
        blazeSite.homepage.goToHomeapgeURL();
        blazeSite.homepage.setRandomTo("8").setDropDownToPath();
        blazeSite.homepage.selectFromTo();
    }

    @Test
    public void shouldGoToDestinationOfTheWeek(){
        blazeSite.homepage.goToHomeapgeURL();
        blazeSite.homepage.goToDestinationOfTheWeek();
    }


}
