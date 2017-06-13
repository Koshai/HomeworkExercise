package com.questiontwo;

import java.util.LinkedHashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.questiontwo.Model;;

public class Action {
	protected WebDriver driver;
	Model model = null;
	
	public Action(WebDriver driver){
		this.driver = driver;
		model = new Model(driver);
	}
	
	public void getItem(int num){
		String foodname = model.getfood(num);
		System.out.println(foodname);
	}
	
	public void listemout(){
		Map<String, String> maps = new LinkedHashMap<String, String>();
		
		for(int i = 0; i < model.listing().size(); i++){
			maps.put("model.listing().get(i).findElements(By.className('title'))", "model.listing().get(i).findElements(By.className('description'))");
			System.out.println(maps);
		}
	}
}
