package org.example.testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"src/test/resources/features"}
        ,glue = {"org/example/stepdefination"}
        ,tags = "@SC01"
       // ,dryRun = true
)

public class Testrunner {
}
