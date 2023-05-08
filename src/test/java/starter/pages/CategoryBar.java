package starter.pages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
public class CategoryBar extends PageObject {
    private By categoryBar(){
        return By.xpath("//div[@class='v-input__slot']");
    }
    private By signCate(){
        return By.xpath("//div[@class='v-menu__content theme--light menuable__content__active']");
    }
    private By selectCate(){
        return By.xpath("//div[@class='v-list v-select-list v-sheet theme--light theme--light']/div[1]/div[@class='v-list-item__content']");
    }
    private By responsSelect(){return By.xpath("//div[@class='v-alert v-sheet theme--light elevation-2 v-alert--border v-alert--border-top']");}
    private By appearCate(){return By.xpath("//div[@class='v-menu__content theme--light menuable__content__active']");}
    private By invalidCate(){return By.xpath("//div[@class='v-list v-select-list v-sheet theme--light theme--light']/div[@class='v-list-item v-list-item--link theme--light']/div[.='!@#$%']");}
    private By invalidShow(){return By.xpath("//i[@class='v-icon notranslate v-alert__icon fas fa-info-circle theme--light info--text']");}

    @Step
    public void clickCateSelect(){
        $(categoryBar()).click();
    }
    @Step
    public void signSelectCate(){
        $(signCate()).isDisplayed();
    }
    @Step
    public void selectProductCate(){
        $(selectCate()).click();
    }
    @Step
    public void responsCateClick(){
        $(responsSelect()).isDisplayed();
    }
    @Step
    public void appearListCate(){
        $(appearCate()).isDisplayed();
    }
    @Step
    public void clickInvalid(){
        $(invalidCate()).click();
    }
    @Step
    public void showNoProduct(){
        $(invalidShow()).isDisplayed();
    }
}
