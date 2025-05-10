package hooks;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.browser.Browser;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.EnvDataReader;

public class Hooks {

	protected final Browser browser = AqualityServices.getBrowser();

	@Before
	public void setup() {
		browser.maximize();
		browser.goTo(EnvDataReader.getEnvData().getHost());
	}

	@After
	public void teardown() {
		if (AqualityServices.isBrowserStarted()) {
			browser.quit();
		}
	}
}
