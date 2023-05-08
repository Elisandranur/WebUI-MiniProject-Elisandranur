package starter.pages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    private By loginField(){
        return By.xpath("//*[@id=\"app\"]/div/header/div/button[2]");
    }
    private By emailField(){
        return By.xpath("//body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
    }
    private By passwordField(){
        return By.xpath("//body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/input[1]");
    }
    private By LoginButton(){
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/form/div[3]/button");
    }

    public void openLoginPage(){
        $(loginField()).click();
    }
    @Step
    public void inputEmailPassword(String email, String password){
        $(emailField()).type(email);
        $(passwordField()).type(password);
    }
    @Step
    public void clickLoginButton(){
        $(LoginButton()).click();
    }
    @Step
    public void getMessage(){
        $(loginField()).isDisplayed();
    }


}
