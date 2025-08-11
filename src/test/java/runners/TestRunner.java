package runners;

import com.kinship.automation.utils.listeners.RetryListener;
import com.kinship.automation.utils.listeners.TestListener;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Listeners;

@CucumberOptions(
    features = "src/test/java/features", // path to your .feature files
    glue = {"stepdefinitions", "hooks"}, // step defs and hooks
    plugin = {
      "pretty",
      "html:target/cucumber-report.html", // HTML report
      "json:target/cucumber-report.json", // JSON report
      "rerun:target/failed_scenarios.txt",
      "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
    }, // file for failed reruns (optional),
    monochrome = true,
    dryRun = false,
    tags = "@smoke")
@Listeners({TestListener.class, RetryListener.class})
public class TestRunner extends AbstractTestNGCucumberTests {}
