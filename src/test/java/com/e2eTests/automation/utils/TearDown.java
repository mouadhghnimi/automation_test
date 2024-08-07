package com.e2eTests.automation.utils;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TearDown {
    @After
    public void quitDriver (Scenario scenario) {

        if (scenario.isFailed()) {

            final byte[] screenshot = ((TakesScreenshot)  Setup.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png" , "screenshot");
        }

        Setup.getDriver().quit();
        Setup.getLogger().error("Scenario :"  + scenario.getName() + "- finished.Status" + scenario.getStatus());
    }
}
