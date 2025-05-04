package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductListingPage {
	
WebDriver driver;
	
	public ProductListingPage(WebDriver driver){
		this.driver= driver;
	} 
	
	By sort = By.className("c-radio");
	
	By range = By.className("list-group-filter");
	
	By gender = By.xpath("//input[@name = 'faceSize']");
	
	By functions = By.xpath("//input[@name = 'other-functions']");//
	
	By series = By.xpath("//input[@name = 'series']");
	
	By displayType = By.xpath("//input[@name = 'displayType']");
	
	By color = By.className("colortips_wrap");
	
	By brand = By.xpath("//input[@name = 'band']"); 
	
	By WaterResistance = By.xpath("//input[@name = 'waterResistant']"); 
	
	By timeAdjustment = By.xpath("//input[@name = 'timeAdjustment']");
	
	By sensorFunctions = By.xpath("//input[@name = 'sensorFunctions']");
	
	By cleartn = By.className("cmp-button__text");
	
	By product = By.className("cmp-product_panel_list__item");
	
	 public void sortByInitializePrice(String initalizePrice) {
		 List<WebElement> sortbyother =  driver.findElements(sort);
		 for(int i = 0; i < sortbyother.size(); i++ ) {
			 if(sortbyother.get(i).getText().trim().equalsIgnoreCase(initalizePrice)) {
				 sortbyother.get(i).click();
				 break;
			 }
		 }
		 
		 
	 }
	 
	 public void sortByRange(String ranges) {
		 List<WebElement> sortbyrange =  driver.findElements(range);
		 for(int i = 0; i < sortbyrange.size(); i++ ) {
			 if(sortbyrange.get(i).getText().trim().equalsIgnoreCase(ranges)) {
				 sortbyrange.get(i).click();
				 break;
			 }
		 }
		 
		 
	 }
	 
	 public void sortByGender(String genders) {
		 List<WebElement> sortbygender =  driver.findElements(gender);
		 for(int i = 0; i < sortbygender.size(); i++ ) {
			 if(sortbygender.get(i).getText().equalsIgnoreCase(genders)) {
				 sortbygender.get(i).click();
				 break;
			 }
		 }
		 
		 
	 }
	 
	 public void sortByFunction(String function) {
		 List<WebElement> sortByFunction =  driver.findElements(functions);
		 for(WebElement filter : sortByFunction) {
			if( filter.getText().trim().equalsIgnoreCase(function)){
				filter.click();
				 break;
			 }
		 }
	 }
	 
	 public void sortBySeries(String serieses) {
		 List<WebElement> sortBySeries =  driver.findElements(series);
		 for(WebElement filter : sortBySeries) {
			if( filter.getText().trim().equalsIgnoreCase(serieses)){
				filter.click();
				 break;
			 }
		 }
	 }
	
	 public void sortByDisplayTYpe(String type) {
		 List<WebElement> sortByDisplayType =  driver.findElements(displayType);
		 for(WebElement filter : sortByDisplayType) {
			if( filter.getText().trim().equalsIgnoreCase(type)){
				filter.click();
				 break;
			 }
		 }
	 }

	 public void sortBycolor(String colors) {
		 List<WebElement> sortByColor =  driver.findElements(color);
		 for(WebElement filter : sortByColor ) {
			if( filter.getText().trim().equalsIgnoreCase(colors)){
				filter.click();
				 break;
			 }
		 }
	 }
	 

	 public void sortByBrand(String band) {
		 List<WebElement> sortByBrand =  driver.findElements(brand);
		 for(WebElement filter :  sortByBrand) {
			if( filter.getText().trim().equalsIgnoreCase(band)){
				filter.click();
				 break;
			 }
		 }
	 }
	 
	 public void sortByWaterRegistance(String WaterResistanceType) {
		 List<WebElement> sortByWaterRegistance =  driver.findElements(WaterResistance);
		 for(WebElement filter : sortByWaterRegistance ) {
			if( filter.getText().trim().equalsIgnoreCase(WaterResistanceType)){
				filter.click();
				 break;
			 }
		 }
	 }
	 
	 public void sortByTimeAdjustments(String timeAdjustmentType) {
		 List<WebElement> sortByTimeAdjustments =  driver.findElements(timeAdjustment);
		 for(WebElement filter : sortByTimeAdjustments) {
			if( filter.getText().trim().equalsIgnoreCase(timeAdjustmentType)){
				filter.click();
				 break;
			 }
		 }
	 }
	 
	 public void sortBySenserFunctions(String sensorFunctionsType) {
		 List<WebElement> sortBySenserFunctions =  driver.findElements(sensorFunctions);
		 for(WebElement filter : sortBySenserFunctions) {
			if( filter.getText().trim().equalsIgnoreCase(sensorFunctionsType)){
				filter.click();
				 break;
			 }
		 }
	 }
	
	 
	 public void clearBtn() {
		 driver.findElement(cleartn).click();
	 }
	 
	 public List<String> getProductTitles() {
		 List<WebElement> products = driver.findElements(product);
	        return products.stream().map(WebElement::getText).toList();
	    }
	

	

}
