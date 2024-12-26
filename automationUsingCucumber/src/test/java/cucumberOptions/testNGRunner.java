package cucumberOptions;


import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features", glue ="stepDefinitions", monochrome=true, plugin= {"pretty", "html:target/reports.html", "rerun:target/failed_scenarios.txt"})
public class testNGRunner extends AbstractTestNGCucumberTests {

	
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		
		return super.scenarios();
		
	}

}
