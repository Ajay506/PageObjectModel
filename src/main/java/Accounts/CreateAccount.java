package Accounts;

import org.openqa.selenium.By;

import Base.BasePage;
import Pages.HomePage;

public class CreateAccount extends BasePage {

	
	public HomePage newAccount() {
			
		driver.findElement(By.xpath(OR.getProperty("NewBtn"))).click();
		
		driver.findElement(By.xpath(OR.getProperty("ActName"))).sendKeys("Nature Cure Hospital");
		
		driver.findElement(By.xpath(OR.getProperty("SaveActsBtn"))).click();
		
		return new HomePage();
		
	}
}
