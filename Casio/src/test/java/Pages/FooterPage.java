package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FooterPage {
	
	WebDriver driver;
	public FooterPage(WebDriver driver){
		this.driver= driver;
	} 
	
	
	By facebookLink = By.xpath("//img[@src=\"https://www.casioindiashop.com/static/images/facebook-icon.svg\"]");
	
	By instagramLink = By.xpath("//img[@src=\\\"https://www.casioindiashop.com/static/images/insta-icon.svg\\\"]\")");
	
	By twiterLink = By.xpath("//img[@src=\"https://www.casioindiashop.com/static/images/twitter-icon.svg\"]");
	
	
	
	public void Verify_facebookLink() {
		WebElement facebook = driver.findElement(facebookLink);
		facebook.isDisplayed();
	}
	
	public void Verify_instagramLink() {
		WebElement instagram = driver.findElement(instagramLink);
		instagram.isDisplayed();
	}
	
	public void verify_twitter() {
		WebElement twitter = driver.findElement(twiterLink);
		twitter.isDisplayed();
	}
}
