package org.cucumberproject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbloginpojo extends BaseClass {
	public Fbloginpojo()
	{
		PageFactory.initElements(drive, this);
	}
	@FindBy(xpath="//input[@autocomplete='email']")
	private static WebElement email;
	
	@FindBy(xpath="//input[@autocomplete='password']")
	private static WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private  WebElement signIn;

	public static WebElement getEmail() {
		return email;
	}

	public static WebElement getPassword() {
		return password;
	}

	public WebElement getSign() {
		// TODO Auto-generated method stub
		return signIn;
	}

}
