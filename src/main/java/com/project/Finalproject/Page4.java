package com.project.Finalproject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Page4 {

	@FindBy(xpath="//*[@id=\"first_name\"]")
	public static WebElement fn;
	@FindBy(xpath="//input[@name='last_name']")
	public static WebElement ln;
	@FindBy(xpath="//textarea[@name='address']")
	public static WebElement address;
	@FindBy(xpath="//input[@name='cc_num']")
	public static WebElement ccn;
	@FindBy(xpath="//*[@id=\"cc_type\"]/option[3]")
	public static WebElement cctype;
	@FindBy(xpath="//*[@id=\"cc_exp_month\"]/option[2]")
	public static WebElement expmonth;
	@FindBy(xpath="//*[@id=\"cc_exp_year\"]/option[12]")
	public static WebElement expyear;
	@FindBy(xpath="//*[@id=\"cc_cvv\"]")
	public static WebElement ccv;
	@FindBy(xpath="//input[@name='book_now']")
	public static WebElement book;
	@FindBy(xpath="//*[@id=\"logout\"]")
	public static WebElement logout;
}
