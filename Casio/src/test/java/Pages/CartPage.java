package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
	
WebDriver driver;
	
	public CartPage(WebDriver driver){
		this.driver= driver;
	} 
	
	By plus = By.className("plus");
	By minus = By.className("minus");
	
	
	public void increaseItem() {
		
		driver.findElement(plus).click();
	}
	
	public void decreaseItem() {
		driver.findElement(minus).click();
	}
	
	

}
