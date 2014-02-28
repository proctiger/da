package abril.da.test.feature;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

/**
*
* @author willians
*/

@RunWith(Cucumber.class)

@Cucumber.Options(
		
		glue = "abril.da.test.steps",
//		tags = {"~@Ignore"},
		features = "src/test/resources/feature_files",
		format = "json:target/cucumber.json")


public class FeatureTest {
}
