package abril.da.test.suite;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import abril.da.test.feature.FeatureTest;
import abril.da.test.page.BasePage;


/**
 * 
 * @author willians
 */
@RunWith(Suite.class)
@SuiteClasses({ FeatureTest.class })
public class TestSuite {

	@BeforeClass
	public static void startWebDrive() throws Exception {
		BasePage.startFirefoxBrowser();
	}

	@AfterClass
	public static void stopWebDrive() {
		BasePage.stopFirefoxBrowser();
	}

	
}
