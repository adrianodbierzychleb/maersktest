package org.example.blazeSite.Pages;

import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogIn {

    private WebDriver driver;
    private By usernamePath = By.xpath("/html/body/div/div/div/div/div/div[2]/form/div[1]/div/input");
    private By passwoordPath = By.xpath("/html/body/div/div/div/div/div/div[2]/form/div[2]/div/input");
    private By rememberMePath = By.xpath("/html/body/div/div/div/div/div/div[2]/form/div[3]/div/div/label/input");
    private By sumbitPath = By.xpath("/html/body/div/div/div/div/div/div[2]/form/div[4]/div/button");
    private By forgotPasswordpath = By.xpath("/html/body/div/div/div/div/div/div[2]/form/div[4]/div/a");
    private By recoveryEmailPath = By.xpath("/html/body/div/div/div/div/div/div[2]/form/div[1]/div/input");
    private By recoverSubmitPath = By.xpath("/html/body/div/div/div/div/div/div[2]/form/div[2]/div/button");


    public LogIn(WebDriver driver)
    {
        this.driver = driver;
    }


    public LogIn inputUsername(String username)
    {
        driver.findElement(usernamePath).sendKeys(username);
        return this;
    }

    public LogIn inputPassword(String password)
    {
        driver.findElement(passwoordPath).sendKeys(password);
        return this;
    }

    public LogIn selectRememberMe(){
        driver.findElement(rememberMePath).click();
        return this;
    }

    public LogIn submitButton(){
        driver.findElement(sumbitPath).click();
        return this;
    }

    public LogIn forgotPassword(){
        driver.findElement(forgotPasswordpath).click();
        return this;
    }

    public LogIn inputRecoveryEmail(String email){
        driver.findElement(recoveryEmailPath).sendKeys(email);
        return this;
    }

    public LogIn sumbitRecoverPassword(){
        driver.findElement(recoverSubmitPath).click();
        return this;
    }


}
