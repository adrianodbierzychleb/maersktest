package org.example.blazeSite.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DetailsPage {


    private WebDriver driver;
    private By inputNamePath = By.xpath("/html/body/div[2]/form/div[1]/div/input");
    private By inputAddressPath = By.xpath("/html/body/div[2]/form/div[2]/div/input");
    private By inputCityPath = By.xpath("/html/body/div[2]/form/div[3]/div/input");
    private By inputStatePath = By.xpath("/html/body/div[2]/form/div[4]/div/input");
    private By inputZipCodePath = By.xpath("/html/body/div[2]/form/div[5]/div/input");
    private String cardSelector;
    private By selectCardPath; // = By.xpath("/html/body/div[2]/form/div[6]/div/select/option[1]");
    private By inputCardNumberPath = By.xpath("/html/body/div[2]/form/div[7]/div/input");
    private By inputCardMonthPath = By.xpath("/html/body/div[2]/form/div[8]/div/input");
    private By inputCardYearPath = By.xpath("/html/body/div[2]/form/div[9]/div/input");
    private By inputNameOnCard = By.xpath("/html/body/div[2]/form/div[10]/div/input");
    private By selectRememberMePath =By.xpath("/html/body/div[2]/form/div[11]/div/label/input");
    private By sumbmitButtonPath = By.xpath("/html/body/div[2]/form/div[11]/div/input");

    public DetailsPage(WebDriver driver){
        this.driver = driver;
    }

    public DetailsPage setCard(String randomCard){
        cardSelector = randomCard;
        return this;
    }

    public DetailsPage setCardPath()
    {
        selectCardPath = By.xpath("/html/body/div[2]/form/div[6]/div/select/option["+cardSelector +"]");
        return this;
    }

    public DetailsPage fillInName(String name){
        driver.findElement(inputNamePath).sendKeys(name);
        return this;
    }

    public DetailsPage fillInAddress(String address){
        driver.findElement(inputAddressPath).sendKeys(address);
        return this;
    }

    public DetailsPage fillCity(String city){
        driver.findElement(inputCityPath).sendKeys(city);
        return this;
    }

    public DetailsPage fillState(String state){
        driver.findElement(inputStatePath).sendKeys(state);
        return this;
    }

    public DetailsPage fillZipcode(String zip){
        driver.findElement(inputZipCodePath).sendKeys(zip);
        return this;
    }

    public DetailsPage selectCard(){
        driver.findElement(selectCardPath).click();
        return this;
    }

    public DetailsPage fillCardNumber(String number){
        driver.findElement(inputCardNumberPath).sendKeys(number);
        return this;
    }
    public DetailsPage fillCardMonth(String number){
        driver.findElement(inputCardMonthPath).sendKeys(number);
        return this;
    }
    public DetailsPage fillCardYear(String number){
        driver.findElement(inputCardYearPath).sendKeys(number);
        return this;
    }

    public DetailsPage fillCardName(String name){
        driver.findElement(inputNameOnCard).sendKeys(name);
        return this;
    }

    public DetailsPage tickRememberMe(){
        driver.findElement(selectRememberMePath).click();
        return this;
    }

    public DetailsPage submitForm(){
        driver.findElement(sumbmitButtonPath).click();
        return this;
    }





}
