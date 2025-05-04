package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class ProductDetailsPage {
	
		WebDriver driver;
		
		public ProductDetailsPage(WebDriver driver){
			this.driver= driver;
		} 
		
		By product = By.className("catProdSingleDsk");
		
		By addWishList = By.xpath("//img[@src=\"https://www.casioindiashop.com/static/images/wish-icon.svg\"]");
		
		By wishlist = By.xpath("//img[@src=\"https://www.casioindiashop.com/static/images/wishlist-icon-dsk.svg\"]");
		
		By Move_to_cart = By.xpath("//a[text()='Move to Cart']");
		
		public void productDetail() {
			driver.findElement(product).click();
		}
		
		public void add_to_wishlist() {
			driver.findElement(addWishList).click();
		}
		
		public void add_to_cart() {
			driver.findElement(wishlist).click();
			driver.findElement(Move_to_cart).click();
			
		}
		
		}
