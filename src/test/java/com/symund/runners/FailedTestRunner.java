package com.symund.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/failed-html-report"},
        features = "@target/rerun.txt",
        glue = "com/symund/stepdefinitions"
)
public class FailedTestRunner {}
