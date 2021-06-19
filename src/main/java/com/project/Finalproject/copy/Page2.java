package com.project.Finalproject.copy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Page2 {
	
	@FindBy (xpath="//*[@id=\"location\"]/option[6]")
	public static WebElement LOC;
	
	@FindBy(xpath="//*[@id=\"hotels\"]/option[2]")
	public static WebElement HL;
	
	@FindBy(xpath="//*[@id=\"room_type\"]/option[2]")
	public static WebElement RT;
	
	@FindBy(xpath="//*[@id=\"room_nos\"]/option[3]")
	public static WebElement NR;
	
	@FindBy(xpath="//input[@id=\"datepick_in\"]")
	public static WebElement checkin;
	
	@FindBy(xpath="//input[@id=\"datepick_out\"]")
	public static WebElement checkout;
	
	@FindBy(xpath="//*[@id=\"adult_room\"]")
	public static WebElement adult;
	
	@FindBy(xpath="//*[@id=\"child_room\"]")
	public static WebElement child;
	
	@FindBy(xpath="//*[@id=\"Submit\"]")
	public static WebElement submit;
	
	

}
