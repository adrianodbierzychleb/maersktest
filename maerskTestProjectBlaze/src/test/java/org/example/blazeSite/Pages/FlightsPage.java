package org.example.blazeSite.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightsPage {

    private WebDriver driver;
    private String randomFlight = "2";
    private By selectFlight;// = By.xpath("/html/body/div[2]/table/tbody/tr["+ randomFlight + "]/td[1]/input");



    public FlightsPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public FlightsPage setRandomFlight(String random){
        randomFlight = random;
        return this;
    }
    public FlightsPage setFligthPath(){
        selectFlight=By.xpath("/html/body/div[2]/table/tbody/tr["+ randomFlight + "]/td[1]/input");
        return this;
    }


    public FlightsPage SelectFlight(){
        driver.findElement(selectFlight).click();
        return this;
    }


}
