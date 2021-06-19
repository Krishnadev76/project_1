package com.project.Finalproject.copy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BaseClass {
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Krishna\\eclipse-workspace\\Selenium_Testing\\Drivers\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		PageFactory.initElements(driver,Page1.class);
		
		Page1.USN.sendKeys("Krishna76");
		Page1.PAS.sendKeys("4ZC183");
		Page1.SUB.click();
		
		PageFactory.initElements(driver,Page2.class);
		
		Page2.LOC.click();
		Page2.HL.click();
		Page2.RT.click();
		Page2.NR.click();
		Page2.checkin.sendKeys("14/06/2021");
		Page2.checkout.sendKeys("15/06/2021");
		Page2.adult.click();
		Page2.child.click();
		Page2.submit.click();
		
		PageFactory.initElements(driver, Page3.class);
		
		Page3.bullot.click();
		Page3.conti.click();
		
		
		PageFactory.initElements(driver, Page4.class);
		
		Page4.fn.sendKeys("krishna");
		Page4.ln.sendKeys("dev");
		Page4.address.sendKeys("no 1234 5th street");
		Page4.ccn.sendKeys("1234567891234567");
		Page4.cctype.click();
		Page4.expmonth.click();
		Page4.expyear.click();
		Page4.ccv.sendKeys("248");
		Page4.book.click();
		Page4.logout.click();
		
		
		
	}
	
}	