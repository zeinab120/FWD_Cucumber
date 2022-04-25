package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/resources/features",
        glue = "StepDefinitions",
        monochrome = true,
        plugin = {"pretty",
                "html:target/cucumber.html",
                "html:target/cucumber-report/cucumber.html",
                "json:target/cucumber-report/cucumber.json",
                "json:target/cucumber.json",
                "junit:target/cukes.xml",
                "rerun:target/rerun.txt"
                },

        dryRun = false,
        tags = "@RunSmoke"
)


public class TestRunner extends AbstractTestNGCucumberTests{

}
