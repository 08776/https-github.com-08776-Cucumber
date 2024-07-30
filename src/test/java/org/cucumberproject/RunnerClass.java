package org.cucumberproject;
import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@CucumberOptions(
		features= {"src\\test\\resources\\samples.feature"},
		dryRun=true
		)

public class RunnerClass extends BaseClass   {
	
	@Given("User launch the chrome and maximize the window")
	public void user_launch_the_chrome_and_maximize_the_window() {
		launchbrowser();
	}

	@When("launch chrome URL")
	public void launch_chrome_URL() {
		launchURl("https://www.netflix.com/login?nextpage=https%3A%2F%2Fwww.netflix.com%2Fbrowse");
	}

	@When("pass the data {string} in Email field")
	public void pass_the_data_in_Email_field(String em) {
		Fbloginpojo pojo=new Fbloginpojo();
		   passtext(em,pojo.getEmail());
	}

	@When("pass the data {string} in password field")
	public void pass_the_data_in_password_field(String pass) {
		Fbloginpojo pojo=new Fbloginpojo();
	   passtext(pass,pojo.getPassword());
	}

	@When("click the signIn button")
	public void click_the_signIn_button() {
		Fbloginpojo p=new Fbloginpojo();
		clickbtn(p.getSign());
	}
	
	@When("To check whether to navigate to the home page or not")
	public void to_check_whether_to_navigate_to_the_home_page_or_not() {
		System.out.println("check");
	}

	@Then("close the browser")
	public void close_the_browser() {
		closeentirebrowser();
	}

	
	

	
}








//Scenario: Login with a valid Email and Invalid password
//Scenario: Login with an Invalid Email and a valid password
//Scenario: Login with an Invalid Email and Invalid password
//Scenario: Login with an Empty Email and an Invalid password
//Scenario: Login with an Invalid Email and Empty password
//Scenario: Login with an Empty Email and a valid password
//Scenario: Login with a valid Email and Empty password
//Scenario: Login with an Empty Email and Empty password