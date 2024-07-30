package org.cucumberproject1;

import java.util.List;

import org.cucumberproject1.BaseClass;
import io.cucumber.datatable.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;
import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import cucumber.api.CucumberOptions;

@CucumberOptions(
		features= {"src\\test\\resources\\sample1.feature"},
		dryRun=true
		)
		
public class RunnnerClass extends BaseClass {
	FBsigninpojo f;
	@Given("To launch the browser")
	public void to_launch_the_browser() {
		launchbrowser();
	}

	@When("To launch the url")
	public void to_launch_the_url() {
		launchURl("https://en-gb.facebook.com/");
	}

	@When("To click the create Account")
	public void to_click_the_create_Account() throws InterruptedException {
		f=new FBsigninpojo();
		clickbtn(f.getNewaccount());
		Thread.sleep(1000);
	}
	
	@When("To pass the first name in first name cell")
public void to_pass_the_first_name_in_first_name_cell(DataTable d)  {
		List<String> l = d.asList();
f=new FBsigninpojo();
org.cucumberproject1.BaseClass.passtext(l.get(2), f.getFirstname());
	}

	@When("To pass the second name in second name cell")
	public void to_pass_the_second_name_in_second_name_cell(DataTable d) {
		List<List<String>> l = d.asLists();
		f=new FBsigninpojo();
		passtext(l.get(0).get(1), f.getSurname());
		
	}

	@When("To pass the mobile number in mobile number cell")
	public void to_pass_the_mobile_number_in_mobile_number_cell() {
		f=new FBsigninpojo();
		passtext("93837429002", f.getMobilenumber());
	}

	@When("To create the new password in new password field")
	public void to_create_the_new_password_in_new_password_field() {
		f=new FBsigninpojo();
	    passtext("vel@123", f.getNewpass());
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
		closeentirebrowser();
	}

}
