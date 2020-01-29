package org.example.blazeSite;

import org.example.blazeSite.Pages.*;
import org.openqa.selenium.WebDriver;

public class BlazeSite {



    public WebDriver driver;
    public DetailsPage detailsPage;
    public FlightsPage flightsPage;
    public Homepage homepage;
    public LogIn logIn;


    public BlazeSite(WebDriver driver){
        this.driver = driver;
        this.detailsPage = new DetailsPage(driver);
        this.flightsPage = new FlightsPage(driver);
        this.homepage = new Homepage(driver);
        this.logIn = new LogIn(driver);

    }

    public DetailsPage getDetailsPage() {
        return detailsPage;
    }

    public FlightsPage getFlightsPage() {
        return flightsPage;
    }

    public Homepage getHomepage(){
        return homepage;
    }

    public LogIn getLogIn(){
        return logIn;
    }



}
