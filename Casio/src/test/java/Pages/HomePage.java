package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver= driver;
	} 
	
	By login = By.xpath("//img[@src=\"https://www.casioindiashop.com/static/images/user-icon-dsk.png\"]");
	
	
	
	By navigationMenu = By.xpath("//a[@href=\"https://www.casioindiashop.com/watches\"]");

	By banner = By.className("img_wrap");

	
	
	By Search = By.xpath("//input[@placeholder=\"Search for Products, Brands & more\"]");
	
	By submit = By.xpath("//img[@src=\"https://www.casioindiashop.com/static/images/search-icon-dsk.svg\"]");
	
	By close = By.className("myAcctpopupCloseDsk");
	
	
	public void closebtn() {
		driver.findElement(close).click();
	}
	
	
	public void Login() {
		driver.findElement(login).click();
	}
	
	public void navigation() {
		driver.findElement(navigationMenu).click();
		
	}
	
	public boolean isBannerDisplayed() {
	 	WebElement bannerSection = driver.findElement(banner);
	 	return bannerSection.isDisplayed();
	}
	
	public void Search(String keyword) {
		WebElement SearchProduct  = driver.findElement(Search);
		SearchProduct.sendKeys(keyword);
		driver.findElement(submit).click();
	}

}
