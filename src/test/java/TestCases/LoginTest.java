/**
 * 
 */
package TestCases;

import org.testng.annotations.Test;

import Accounts.CreateAccount;
import Pages.HomePage;
import Pages.LoginPage;

/**
 * @author vilas
 *
 */
public class LoginTest extends BaseTest {

	@Test
	public void loginTest() {

		HomePage home = new HomePage();

		LoginPage lp = home.goToLogin();
		
        CreateAccount accountpage = lp.doLogin();
		
		home.goToAccount();
		
		accountpage.newAccount();
		
		home.goToLeads();
		

	}

}
