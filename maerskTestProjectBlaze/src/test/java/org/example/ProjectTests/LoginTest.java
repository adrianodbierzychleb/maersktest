package org.example.ProjectTests;

import org.example.blazeSite.BlazeSite;
import org.example.seleniumConfig.SeleniumConfig;
import org.junit.Before;
import org.junit.Test;

public class LoginTest {


    private static BlazeSite blazeSite;

    @Before
    public void setup(){
        SeleniumConfig seleniumConfig = new SeleniumConfig("chrome", "/Users/tech-a050/Desktop/adrian/maerskTestProjectBlaze/chromedriver");
        blazeSite = new BlazeSite(seleniumConfig.getDriver());
    }


    @Test
    public void shouldGoToLoginPage()
    {
        blazeSite.homepage.goToHomeapgeURL();
        blazeSite.homepage.goToLogInPage();
    }

    @Test
    public void shouldClikcForgotPassword()
    {
        blazeSite.homepage.goToHomeapgeURL();
        blazeSite.homepage.goToLogInPage();
        blazeSite.logIn.forgotPassword();
    }

    @Test
    public void shouldNotLoginAttmptingToLogInWithNoPassword(){
        blazeSite.homepage.goToHomeapgeURL().goToLogInPage();
        blazeSite.logIn.inputUsername("test123@test.com").submitButton();
    }

    @Test
    public void shoudFillIndetailsRememberingMe(){
        blazeSite.homepage.goToHomeapgeURL().goToLogInPage();
        blazeSite.logIn.inputUsername("test123@test.com").inputPassword("test").selectRememberMe();
    }

    @Test
    public void shouldInputRecoveryemail(){
        blazeSite.homepage.goToHomeapgeURL();
        blazeSite.homepage.goToLogInPage();
        blazeSite.logIn.forgotPassword().inputRecoveryEmail("test123@test.com");
    }

    @Test
    public void shouldRecoverPassword(){
        blazeSite.homepage.goToHomeapgeURL();
        blazeSite.homepage.goToLogInPage();
        blazeSite.logIn.forgotPassword().inputRecoveryEmail("test123@test.com").sumbitRecoverPassword();
    }


}
