package StepDefinitions;

import Utilities.Driver;
import io.cucumber.java.After;

public class Hooks{

	@After
	public void afterScenario() {
		Driver.tearDown();
	}
}
