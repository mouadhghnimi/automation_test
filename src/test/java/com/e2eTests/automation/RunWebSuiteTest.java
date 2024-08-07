package com.e2eTests.automation;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;
import org.junit.runner.RunWith;

public class RunWebSuiteTest {

    @RunWith(Cucumber.class)
    @CucumberOptions(features = {"src/spec/features"},
            plugin = {"pretty" , "html:target/cucumber-report.html"},
            tags = ("@authentification"),
            //glue = {"stepDefintions"},
            monochrome = true,
            snippets = CAMELCASE,

    )
}
