package com.e2eTests.automation;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(features = {"src/spec/features"},
            plugin = {"pretty", "html:target/cucumber-report.html"},
            tags = ("@login-valide"),
            //glue = {"stepDefintions"},
            monochrome = true,
            snippets = CAMELCASE

    )
    public class RunWebSuiteTest {

    }




