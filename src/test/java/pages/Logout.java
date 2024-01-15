package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
public class Logout {
    @FindBy(xpath = "/html/body/div/header/div/div/button")
    WebElement Avatoricon;
    @FindBy(className = "bx--switcher__item")
    List <WebElement> LogoutButton;
    public Logout(WebDriver Driver) { PageFactory.initElements(Driver,this);}
    public void Logout() throws InterruptedException {
        Avatoricon.click();
        Thread.sleep(100);
        LogoutButton.get(3).click();
    }
}
