package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "src/test/java/features" },
        glue = { "Steps" },
        monochrome = true,
        tags = {"@amazon"})

public class RunCucke extends AbstractTestNGCucumberTests {

}

