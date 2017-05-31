package com.selenium.org.Batch9Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginClass 
{
	WebDriver driver;
	By mailID_locator=By.id("email");
	By password_locator=By.name("pass");
	By click_submit_locator=By.id("loginbutton");
	By creatAccnt_locator=By.xpath("//a[contains(text(),'Create New Account')]");
	By forgtAcct_locator=By.id("forgot-password-link");
	
	public LoginClass(WebDriver driver2)
	{
		driver=driver2;
	}
	
	private void username_functon()
	{
		WebElement username=driver.findElement(mailID_locator);
		username.sendKeys("Vijay");
	}
	private void pass_function()
	{
		WebElement password=driver.findElement(password_locator);
		password.sendKeys("vpassw");
	}
	
	private void loginbutClick()
	{
		WebElement login_btn=driver.findElement(click_submit_locator);
		login_btn.click();	
	}
	public void login_function()
	{
		
		username_functon();
		pass_function();
		loginbutClick();		
	}
	

}
