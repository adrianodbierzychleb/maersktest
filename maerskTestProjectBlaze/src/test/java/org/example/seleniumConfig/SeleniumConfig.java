package org.example.seleniumConfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumConfig {


    public WebDriver driver;


    public SeleniumConfig(String browser, String driverPath)
    {
        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", driverPath);
            driver = new ChromeDriver();
        }
    }

    public WebDriver getDriver()
    {
        return driver;
    }

}
