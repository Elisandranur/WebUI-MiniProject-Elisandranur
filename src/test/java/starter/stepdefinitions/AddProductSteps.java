package starter.stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.pages.AddProductPage;

public class AddProductSteps {
    AddProductPage addProductPage;

    // POSITIVE INTO CART//
    @Given("User already in AltaShop dashboard")
    public void iOpenBrowser() throws InterruptedException {
        addProductPage.open();
        Thread.sleep(1000);
    }
    @When("I click BELI on product")
    public void openWebsiteSepulsaCom() throws InterruptedException {
        addProductPage.buyProduct();
    }
    @Then("number on cart icon will appear")
    public void iEnterAValidUsernameAndPassword()throws InterruptedException {
        addProductPage.numberIconCart();
    }

    @And("product are added to the cart")
    public void iClickMasukButton() throws InterruptedException{
        addProductPage.cartCheck();
    }

    // CHECK NUMBER OF CART ICON //
    @When("I click \"BELI\" on some products")
    public void clickBuySome() throws InterruptedException {
        addProductPage.buyProduct();
    }
    @Then("number cart icon will appear")
    public void cartNumber(){
        addProductPage.numberCart();
    }

    // VERIFY PRODUCT FAIL GET ON CART //
    @And("product are not on the cart")
    public void notInCart() throws InterruptedException {
        addProductPage.cartCheck();
        System.out.println("All Product success add to cart, not interupted");
        Thread.sleep(1500);
    }
}
