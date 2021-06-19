package com.project.Finalproject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Page1 {
	
	@FindBy(xpath = "//*[@id=\"username\"]")
   public static WebElement USN;
	
	@FindBy(xpath = "//*[@type='password']")
	   public static WebElement PAS;
	@FindBy(xpath = "//*[@type='Submit']")
	   public static WebElement SUB;
	
}
