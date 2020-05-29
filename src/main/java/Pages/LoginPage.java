package Pages;

import org.openqa.selenium.By;

import Accounts.CreateAccount;
import Base.BasePage;

public class LoginPage extends BasePage {
	
	public CreateAccount doLogin() {
		
		driver.findElement(By.xpath(OR.getProperty("email"))).sendKeys("bajaykumar.ak@gmail.com");
		driver.findElement(By.xpath(OR.getProperty("nextBtn"))).click();
		driver.findElement(By.xpath(OR.getProperty("Pswd"))).sendKeys("Suraaga@1192");
		driver.findElement(By.xpath(OR.getProperty("SignIn"))).click();
		
		return new CreateAccount();
		
	}
}


