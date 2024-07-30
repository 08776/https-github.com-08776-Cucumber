package org.cucumberproject1;
import org.cucumberproject1.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class FBsigninpojo extends BaseClass {
	public FBsigninpojo()
	{
		PageFactory.initElements(drive, this);
	}
	@FindBy(xpath="//a[text()='Create new account']")
	private WebElement newaccount;
	
	@FindBy(name = "firstname")
	private WebElement firstname;
	
	@FindBy(xpath="(//input[@class=\"inputtext _58mg _5dba _2ph-\"])[2]")
	private WebElement surname;
	
	@FindBy(xpath="(//input[@class=\"inputtext _58mg _5dba _2ph-\"])[3]")
	private WebElement mobilenumber;
	
	@FindBy(xpath="//input[@autocomplete=\"new-password\"]")
	private WebElement newpass;

	public WebElement getNewaccount() {
		return newaccount;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getSurname() {
		return surname;
	}

	public WebElement getMobilenumber() {
		return mobilenumber;
	}

	public WebElement getNewpass() {
		return newpass;
	}
	
	

}
