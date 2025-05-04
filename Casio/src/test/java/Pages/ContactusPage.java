package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactusPage {
WebDriver driver;
	
	public ContactusPage(WebDriver driver){
		this.driver= driver;
	} 
	
	By Name = By.xpath("//input[@name='name']");
	
	By Email = By.xpath("//input[@name='email']");
	
	By Mobile = By.xpath("//input[@name='mobile']");
	
	By order = By.xpath("//input[@name ='order_id']");
	
	By message = By.xpath("//input[@placeholder=\"Start typing here...\"]");
	
	By  btn = By.xpath("//button[@name = 'submit']");
	
	public void enterName(String name) {
		driver.findElement(Name).sendKeys(name);
		
		
	}
	
	public void enterEmail(String email) {
		driver.findElement(Email).sendKeys(email);
		
		
	}
	public void enterMobile(String mobile) {
		driver.findElement(Mobile).sendKeys(mobile);
		
		
	}
	
	public void enterOrderId(String order_id) {
		driver.findElement(order).sendKeys(order_id);
		
		
	}
	
	public void enterMessage(String Message) {
		driver.findElement(message).sendKeys(Message);
		
		
	}
	public void btnSubmit() {
		driver.findElement(btn).click();
		
		
	}
	
	
}
