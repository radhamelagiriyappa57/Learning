package stepDefinitions;


import io.cucumber.testng.Cucumber;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/main/resources/Features",glue= {"stepDefinitions"}, monochrome=true, plugin= {"pretty","junit:target/JUNITReports/report.xml"},

tags="@regress")
public class runnerEditAccount {

}
