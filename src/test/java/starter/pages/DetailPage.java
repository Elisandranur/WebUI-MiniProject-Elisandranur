package starter.pages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DetailPage extends PageObject{
    // //body/div[@id='app']/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/button[1]
    // //div[@class='row align-stretch']/div[1]//button[@class='button-beli v-btn v-btn--outlined theme--light v-size--small primary--text']
    private By detailButt1(){
        return By.xpath("//div[@class='row align-stretch']/div[2]//button[@class='button-beli v-btn v-btn--outlined theme--light v-size--small primary--text']");
    }
    // //div[@class='v-main__wrap']/div[@class='container']
    private By detailProduct1(){
        return By.xpath("//p[@class='text-h4 text--primary']");
    }
    // .v-main  //body/div[@id='app']/div[1]/main[1]
    private By Homepage(){
        return By.xpath("//h3[.='AltaShop']");
    }
    // //body/div[@id='app']/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[2]/button[1]
    // //div[@class='row align-stretch']/div[2]//button[@class='button-beli v-btn v-btn--outlined theme--light v-size--small primary--text']
    private By detailButt2(){
        return By.xpath("//div[4]//button[@class='button-beli v-btn v-btn--outlined theme--light v-size--small primary--text']");
    }
    // //div[@class='v-main__wrap']/div[@class='container']
    // //body/div[@id='app']/div[1]/main[1]/div[1]/div[1]
    private By detailProduct2(){
        return By.xpath("//p[@class='text-h4 text--primary']");
    }
    @Step
    public void detail1()throws InterruptedException{
        $(detailButt1()).click();
        $(detailProduct1()).isDisplayed();
        Thread.sleep(2000);
        $(Homepage()).click();
    }
    @Step
    public void detail2()throws InterruptedException{
        $(detailButt2()).click();
        $(detailProduct2()).isDisplayed();
        Thread.sleep(2000);
    }
}
