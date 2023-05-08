package starter.stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.pages.DetailPage;

public class DetailSteps {
    DetailPage detailPage;

    @Given("Iam in AltaShop dashboard")
    public void onAltaShopDetail(){
        detailPage.open();
    }
    @When("I click DETAIL on product")
    public void clickDetail()throws InterruptedException{
        detailPage.detail1();
    }
    @Then("the detail product page will show up")
    public void seeDetail()throws InterruptedException{
        detailPage.detail2();
    }
}
