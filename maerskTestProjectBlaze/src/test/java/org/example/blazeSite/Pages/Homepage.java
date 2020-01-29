package org.example.blazeSite.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {


    private WebDriver driver;
    private String homepageURL = "http://blazedemo.com/index.php";
    private String randomFrom;// = "3";
    private String randomTo;// = "4";
    private By dropDownFrom; //= By.xpath("/html/body/div[3]/form/select[1]/option[" + randomFrom +"]");
    private By dropDownTo;// = By.xpath("/html/body/div[3]/form/select[2]/option[" + randomTo + "]");
    private By sumbit = By.xpath("/html/body/div[3]/form/div/input");
    private By LoginPath = By.xpath("/html/body/div[1]/div/div/a[3]");

    private By DestinationOfTheWeekPath = By.xpath("/html/body/div[2]/div/p[2]/a");

    public Homepage(WebDriver driver)
    {
        this.driver = driver;

    }

    public Homepage setRandomFrom(String random)
    {
        randomFrom = random;
        return this;
    }

    public Homepage setRandomTo(String random)
    {
        randomTo = random;
        return this;
    }

    public Homepage setDropDownFromPath(){
        dropDownFrom = By.xpath("/html/body/div[3]/form/select[1]/option[" + randomFrom +"]");
        return this;
    }

    public Homepage setDropDownToPath(){
        dropDownTo = By.xpath("/html/body/div[3]/form/select[2]/option[" + randomTo + "]");
        return this;
    }


    public Homepage goToHomeapgeURL(){
        driver.navigate().to(homepageURL);
        return this;
    }

    public Homepage goToLogInPage(){
        driver.findElement(LoginPath).click();
        return this;
    }


    public Homepage selectFromDestination(){
        driver.findElement(dropDownFrom).click();
        return this;
    }

    public Homepage selectFromTo(){
        driver.findElement(dropDownTo).click();
        return this;
    }

    public Homepage submitSelection(){
        driver.findElement(sumbit).click();
        return this;
    }

    public Homepage goToDestinationOfTheWeek(){
        driver.findElement(DestinationOfTheWeekPath).click();
        return this;
    }

}
