package com.e2eTests.automation.utils;

import com.sun.org.apache.bcel.internal.generic.SWITCH;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;



public class Setup {

    public static WebDriver driver;
    private static final Logger LOGGER = (Logger) LogManager.getLogger(Setup.class.getName());
    @Before
    public void setWebDriver (Scenario scenario) {
        LOGGER.error("Scenario :"  + scenario.getName() + "- Started");
        String browser = System.getProperty("browser");

        if  (browser == null) {

            browser = "chrome";
        }

        switch(browser) {

            case "chrome":

                ChromeOptions chromeoptions = new ChromeOptions();
                chromeoptions.addArguments("[start-maximzed]");
                driver = new ChromeDriver(chromeoptions);
                break;

            case "firefox":

            FirefoxOptions firefoxoptions = new FirefoxOptions();
                firefoxoptions.setCapability("platform", Platform.WIN10);
                driver = new FirefoxDriver(firefoxoptions);
                break;

            default :
                throw new IllegalArgumentException(" Browser \"" + browser + "\" is not supported. ");

        }
    }
    /* GETTER */

    public static WebDriver getDriver() {
      return  driver;
    }

    public static Logger getLogger() {

        return LOGGER;
    }
}
