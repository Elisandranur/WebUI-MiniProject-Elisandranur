package starter.pages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegisterPage extends PageObject{
    private By loginFieldBut(){
        return By.xpath("//*[@id=\"app\"]/div/header/div/button[2]");}
    private By registbutton(){
        return By.xpath("//a[contains(text(),'Register')]");
    }
    private By namaLengkapField(){
        return By.xpath("//body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
    }
    private By emailRegFiel(){
        return By.xpath("//body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/input[1]");
    }
    private By passRegFil(){
        return By.xpath("//body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[1]/input[1]");
    }
    private By registButton(){
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/form/div[4]/button");
    }

    public void openLoginPage(){
        $(loginFieldBut()).click();
        $(registbutton()).click();
    }
    @Step
    public void inputDataField(String namalengkap,String email, String password){
        $(namaLengkapField()).type(namalengkap);
        $(emailRegFiel()).type(email);
        $(passRegFil()).type(password);
    }
    @Step
    public void clickREGButton(){
        $(registButton()).click();
    }
    @Step
    public void directLoginPage(){
        $(loginFieldBut()).isDisplayed();
    }

}
