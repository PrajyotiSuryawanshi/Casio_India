package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
WebDriver driver;
	
	
	public Login(WebDriver driver) {
		this.driver = driver;
	}
	
	By mobile = By.xpath("//input[@placeholder=\"Email / Mobile*\"]");
	By password = By.xpath("//input[@placeholder='Password*']");
	
	By loginbtn = By.xpath("//button[@type=\"submit\"]");
	
	
	public void VerifyLogin(String Mobile, String Password) {
		driver.findElement(mobile).sendKeys(Mobile);
		driver.findElement(password).sendKeys("Password");
		driver.findElement(loginbtn).click();
	}
}
