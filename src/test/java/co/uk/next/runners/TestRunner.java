package co.uk.next.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/co/uk/next/features"},
        plugin = {"pretty","json:target/report.json","de.monochromata.cucumber.report.PrettyReports:target/pretty-cucumber"},
        glue = {"co/uk/next/hooks","co/uk/next/stepDefinitions"}
)

public class TestRunner {
}
