package Pages;

import org.openqa.selenium.By;

import Accounts.CreateAccount;
import Base.BasePage;

public class HomePage extends BasePage {
	
	public void goToSupport() {
		
	}
	
	public LoginPage goToLogin() {
		
		driver.findElement(By.xpath("//div[@class='zgh-utilities']//a[@class='zgh-login'][contains(text(),'LOGIN')]")).click();
		
		return new LoginPage();
	}
	
	public void goToLeads() {
		
		driver.findElement(By.xpath(OR.getProperty("LeadsMenu"))).click();
		
		driver.findElement(By.xpath(OR.getProperty("NewLeadBtn"))).click();
		
		driver.findElement(By.xpath(OR.getProperty("CompanyName"))).sendKeys("OnePlus");
		
		driver.findElement(By.xpath(OR.getProperty("FName"))).sendKeys("Suraaga");
		
		driver.findElement(By.xpath(OR.getProperty("LName"))).sendKeys("Kemuel");
		
		driver.findElement(By.xpath(OR.getProperty("SaveBtn"))).click();
		
		
	}
	
	public CreateAccount goToAccount() {
		
		driver.findElement(By.xpath(OR.getProperty("AcctMenu"))).click();
		return new CreateAccount();
	}
}

