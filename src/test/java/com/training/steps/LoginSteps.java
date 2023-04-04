package com.training.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {

	WebDriver driver;

	@Given("User launch the SalesForce application")
	public void user_launch_the_sales_force_application() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
	}

	@When("user enter username")
	public void user_enter_username() {
		driver.findElement(By.id("username")).sendKeys("harshini@software.com");
	}

	@Then("user enter password")
	public void user_enter_password() {
		By Password = By.id("password");
		driver.findElement(Password).sendKeys("Test@123");
	}

	@Then("click on Login Button")
	public void click_on_login_button() {
		By login = By.id("Login");
		driver.findElement(login).click();

	}

	@Then("click on Remember Me")
	public void click_on_remember_me() {
		By RememberMe = By.id("rememberUn");
		driver.findElement(RememberMe).click();

	}
	

@When("user enter username {string}")
public void user_enter_username(String name) {
	driver.findElement(By.id("username")).sendKeys(name);

}
@Then("user enter password {string}")
public void user_enter_password(String pswd) {
	By Password = By.id("password");
	driver.findElement(Password).sendKeys(pswd);
}


}
