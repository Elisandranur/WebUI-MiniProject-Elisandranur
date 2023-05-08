package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
import starter.pages.LoginPage;

public class LoginSteps {
    @Steps
    LoginPage loginPage;
    WebDriver driver;

    //INVALID USERNAME AND PASSWORD//
    @Given("Iam on the login page of AltaShop")
    public void onLoginPage()throws InterruptedException {
        loginPage.open();
        loginPage.openLoginPage();
        Thread.sleep(1000);
    }
    @When("I fill the box with invalid email and password")
    public void inputEmail(){
        loginPage.inputEmailPassword("aaaa@mail.com","AAAAA");
    }
    @And("I clicked the Login Button")
    public void clickedLogButton(){
        loginPage.clickLoginButton();
    }
    @Then("I will get message record not found")
    public void getMessageeror(){
        loginPage.getMessage();
    }


    //VALID USERNAME PASSWORD AFTER REGISTER//
    @Given("I on the login page of AltaShop")
    public void loginPageAlta()throws InterruptedException {
        loginPage.open();
        loginPage.openLoginPage();
        Thread.sleep(1000);
    }
    @When("I filled  with valid email and password after regist")
    public void inputValidData(){
        loginPage.inputEmailPassword("elisa@mail.com","ABCDE");
    }
    @And("I click the Login Button")
    public void buttonLoginClick(){loginPage.clickLoginButton();}
    @Then("I will directed to dashboard of AltaShop")
    public void directedDashBoard(){}


    //INVALID PASSWORD VALID EMAIL REGISTERED//
    @Given("Iam at the login page of AltaShop")
    public void loginPages()throws InterruptedException {
        loginPage.open();
        loginPage.openLoginPage();
        Thread.sleep(1000);
        loginPage.openLoginPage();
    }
    @When("I fill the field with valid email and invalid password")
    public void filltheEmailPass(){
        loginPage.inputEmailPassword("elisa@mail.com","12345");
    }
    @And("I clicked the Button to log me in")
    public void clicklogin(){
        loginPage.clickLoginButton();
    }
    @Then("I will get message record not found and I cannot login")
    public void getMessageNotLogin(){
        loginPage.getMessage();
    }
}
