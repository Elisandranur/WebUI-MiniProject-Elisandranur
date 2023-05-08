package starter.pages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LogoutPage extends PageObject{
    private By logoutBut(){
        return By.xpath("//header/div[1]/button[2]");}
    private By logoutButton(){
        return By.xpath("//body[1]/div[1]/div[2]/div[1]/div[2]");
    }
    @Step
    public void clickuserLogout(){
        $(logoutBut()).click();
    }
    @Step
    public void clickLogout(){
        $(logoutButton()).click();
    }
}
