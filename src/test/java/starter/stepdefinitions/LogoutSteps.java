package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
import starter.pages.LoginPage;
import starter.pages.LogoutPage;
import starter.pages.RegisterPage;

public class LogoutSteps {
    @Steps
    LogoutPage logoutPage;
    @Steps
    RegisterPage registerPage;
    @Steps
    LoginPage loginPage;
    WebDriver driver;
    LoginSteps loginSteps;
    @Given("User already in AltaShop dashboard already login")
    public void onDashboardAlta()throws InterruptedException {
        logoutPage.open();
        loginPage.openLoginPage();
        loginPage.inputEmailPassword("elisa@mail.com","ABCDE");
        loginPage.clickLoginButton();
    }
    @When("I click user icon on up-right page")
    public void clickUserIcon(){logoutPage.clickuserLogout();
    }
    @And("I clicked Logout")
    public void clickLOGOUT(){logoutPage.clickLogout();}
    @Then("I will on the login page")
    public void inLoginPage(){
        registerPage.openLoginPage();
    }
}
