package com.test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features =  "zomoto.feature",
        glue = "stepDefinitions",
        plugin = {"pretty", "html:target/cucumber-reports"}
        )
public class TestRunnner {

}
