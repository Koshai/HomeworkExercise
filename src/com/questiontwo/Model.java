package com.questiontwo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Model {
	protected WebDriver driver;
	protected WebElement getfoodname = null;
	
	public Model(WebDriver driver){
		this.driver = driver;
	}
	
	public String getfood(int num){
		getfoodname = driver.findElement(By.xpath("(//[@class='ng-binding'])[position()="+num+"]"));
		return getfoodname.getText();
	}
	
	public List<WebElement> listing(){
		List<WebElement> allfoods = driver.findElements(By.className("ItemContent"));
		return allfoods;
	}
}
