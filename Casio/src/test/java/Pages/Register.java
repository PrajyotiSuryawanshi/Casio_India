package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Register {
	
	
	WebDriver driver;
	
	
	public Register(WebDriver driver) {
		this.driver = driver;
	}
	
	//By name = By.xpath("//input[@name = 'name']");
	
	By mobile = By.xpath("//input[@name = 'mobile']");
	
	By email = By.xpath("//input[@name = 'email']");
	
	By gender = By.xpath("//input[@name = 'gender']");
	
	By birthdate = By.xpath("//input[@placeholder=\"Birthday*\"]"); //placeholder="Anniversary"
	
	By AniversaryDate = By.xpath("//input[@placeholder=\"Anniversary\"]");
	
	//By password = By.xpath("//input[@name = 'password']");
	
	//By confirmPassword = By.xpath("//input[@name = 'passwordconfirmation']");
	
	//By chkbox = By.cssSelector("div.control__indicator.terms_condition_control");
	
	By submitbtn = By.xpath("//button[@type= 'submit']");
	
	 Alert alert = driver.switchTo().alert();
	
	
	
	
public void MobileChk(String Mobile) {
	
	//driver.findElement(name).sendKeys(Name);
	
	driver.findElement(mobile).sendKeys(Mobile);
	
	
}

public void EmailChk(String Email) {
	driver.findElement(email).sendKeys(Email);
	
}
	public void genderCheck(String genders) {
		WebElement selectGender = driver.findElement(gender);
		Select dropDown = new Select(selectGender);
		dropDown.selectByVisibleText(genders);
	}
	public void BirthdateChk(String birthdates) {
		WebElement selectBirthdate = driver.findElement(birthdate);
		Select dropdwonDate = new Select(selectBirthdate);
		dropdwonDate.selectByVisibleText(birthdates);
		
	}
	
	public void AniversaryCheck(String Aniversery) {
		WebElement selectAniversary = driver.findElement(AniversaryDate);
		Select dropdwonAniversaryDate = new Select(selectAniversary);
		dropdwonAniversaryDate.selectByVisibleText(Aniversery);
	//driver.findElement(password).sendKeys(Password);
//	driver.findElement(confirmPassword).sendKeys(ConfirmPassword);
	//driver.findElement(chkbox).click();
	driver.findElement(submitbtn).click();
}

}
