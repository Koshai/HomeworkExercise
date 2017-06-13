package com.questiontwo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.questiontwo.Action;

public class BaseScript {
	protected WebDriver driver;
	private static final String URL = "Your URL goes here";
	
	@BeforeMethod
	  public void beforeMethod() {
		  driver = new FirefoxDriver();
		  driver.get(URL);
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
	  }

	  @AfterMethod
	  public void afterMethod() {
		  driver.quit();
	  }
	  
	  public Action modelget(){
		  return new Action(driver);
	  }
}
