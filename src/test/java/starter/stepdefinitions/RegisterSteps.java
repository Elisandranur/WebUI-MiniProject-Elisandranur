package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;
import starter.pages.RegisterPage;

public class RegisterSteps {
    @Steps
    RegisterPage registerPage;
    @Steps
    LoginPage loginPage;
    @Steps
    LoginSteps loginSteps;
    @Given("Iam on the register page of AltaShop")
    public void registPage()throws InterruptedException {
        registerPage.open();
        registerPage.openLoginPage();
    }
    @When("I fill the box with test data")
    public void fillBoxRegist(){
        registerPage.inputDataField("dicoba9","dicoba9@mail.com","DICOBA9");
    }
    @And("I clicked the registerButton")
    public void clickRegist(){
        registerPage.clickREGButton();
    }
    @Then("I will directed to login page")
    public void toLoginPage() throws InterruptedException {
        registerPage.directLoginPage();
        Thread.sleep(2000);
    }
    @And("I try to login")
    public void tryLOGIN(){
        loginPage.inputEmailPassword("dicoba9@mail.com","DICOBA9");
        loginPage.clickLoginButton();
    }
}
