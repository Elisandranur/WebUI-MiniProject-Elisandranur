package starter.stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.CategoryBar;
import starter.pages.LoginPage;
import starter.pages.RegisterPage;
public class CategorySteps {
    CategoryBar categoryBar;

    // VERIFY CURSOR CLICK//
    @Given("User already in AltaShop dashboard page")
    public void inDasbord() throws InterruptedException {
        categoryBar.open();
        Thread.sleep(1000);
    }
    @When("I click select on dashboard")
    public void clickSelect(){categoryBar.clickCateSelect();}
    @Then("category of product will appear")
    public void listCategory() throws InterruptedException {categoryBar.signSelectCate();
        Thread.sleep(1000);}



    // PRODUCT APPEAR CLICK CATEGORY//
    @Then("I click one category")
    public void clickCate(){categoryBar.selectProductCate();}
    @And("The product with that category will appear")
    public void listProductShow(){categoryBar.responsCateClick();}

    @When("I click select on dashboard page")
    public void clickSelectbar(){categoryBar.clickCateSelect();
    }
    @And("category of product appear")
    public void categoryappear() throws InterruptedException {categoryBar.appearListCate();
        Thread.sleep(1000);}
    @Then("I click one invalid category")
    public void InvalidCate(){categoryBar.clickInvalid();}
    @And("the page show no product")
    public void noProduct() throws InterruptedException {categoryBar.showNoProduct();
        Thread.sleep(1000);}
}
