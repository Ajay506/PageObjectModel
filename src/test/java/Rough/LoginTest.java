package Rough;

import Accounts.CreateAccount;
import Pages.HomePage;
import Pages.LoginPage;

public class LoginTest {

	public static void main(String[] args) {
		// FIXME Auto-generated method stub
		
		/*
		 * ChromeOptions options = new ChromeOptions();
		 * 
		 * WebDriverManager.chromedriver().setup();
		 * 
		 * WebDriver driver = new ChromeDriver();
		 * 
		 * options.addArguments("--disable-notifications");
		 * 
		 * options.addArguments("--disable-infobars");
		 * 
		 * driver.get("https://www.zoho.com/in/crm/");
		 * 
		 * driver.manage().window().maximize();
		 * 
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 */
		
		HomePage home = new HomePage();
		
		LoginPage lp = home.goToLogin();
		
		//home.goToLogin();
		
		//LoginPage login = new LoginPage();
		
		CreateAccount accountpage = lp.doLogin();
		
		home.goToAccount();
		
		accountpage.newAccount();
		
		home.goToLeads();
		
		//CreateAccount accountpage = new CreateAccount();
		
		
	
	}

}
