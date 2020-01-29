package org.example.blazeSite;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"pretty"},
        features = "/Users/tech-a050/Desktop/adrian/maerskTestProjectBlaze/src/test/resources/Features",
        glue = "org.example.blazeSite.StepDefs")
public class CucumberTestRunner {
}