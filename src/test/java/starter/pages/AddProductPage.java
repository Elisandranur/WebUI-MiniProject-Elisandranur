package starter.pages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class AddProductPage extends PageObject{
    // //div[@class='row align-stretch']/div[1]//button[@class='button-beli ml-3 v-btn v-btn--outlined theme--light v-size--small primary--text']
    // //body/div[@id='app']/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/button[2]
    private By Buy1But(){
        return By.xpath("//div[@class='row align-stretch']/div[1]//button[@class='button-beli ml-3 v-btn v-btn--outlined theme--light v-size--small primary--text']");
    }
    // //div[@class='row align-stretch']/div[3]//button[@class='button-beli ml-3 v-btn v-btn--outlined theme--light v-size--small primary--text']
    // //body/div[@id='app']/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[3]/div[2]/button[2]
    private By Buy2But(){
        return By.xpath("//div[@class='row align-stretch']/div[3]//button[@class='button-beli ml-3 v-btn v-btn--outlined theme--light v-size--small primary--text']");
    }
    // //button[.='0']
    // //header/div[1]/button[1]
    // //*[@id="app"]/div/header/div/button[1]
    private By CartButton(){
        return By.xpath("//header/div[1]/button[1]");
    }
    private By bodyDashboard(){
        return By.xpath("//*[@id=\"app\"]/div/main/div");
    }
    private By numberCartInfo(){return By.xpath("//span[@class='v-badge__badge primary']");}
    @Step
    public void buyProduct()throws InterruptedException  {
        $(Buy1But()).click();
        Thread.sleep(2000);
        $(Buy2But()).click();
        Thread.sleep(2000);
    }
    @Step
    public void numberIconCart()throws InterruptedException {
        $(bodyDashboard()).shouldBeVisible();
        Thread.sleep(3000);
    }
    @Step
    public void cartCheck()throws InterruptedException{
        $(CartButton()).click();
        Thread.sleep(5000);
    }
    @Step
    public void numberCart(){
        $(numberCartInfo()).isDisplayed();
        $(numberCartInfo()).getText();
    }

}
