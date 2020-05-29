package TestCases;

import org.testng.annotations.AfterSuite;

import Base.BasePage;

public class BaseTest {

	@AfterSuite
	public void tearDown() {
		
		BasePage.quit();
	}
	
}
