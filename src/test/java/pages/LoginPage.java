package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(name="username")
    WebElement username;
    @FindBy(name="password")
    WebElement pass;

    @FindBy(css = "[type=submit]")
    WebElement loginBtn;

    @FindBy(tagName = "p")
    WebElement invalidCred;

    public LoginPage(WebDriver driver){

        PageFactory.initElements(driver,this);
    }
    public void doLoginWithEmptyCredentials() throws InterruptedException {
        username.sendKeys("");
        pass.sendKeys("");
        loginBtn.click();
        Thread.sleep(100);
    }
    public String doLoginWithInvalidCred() throws InterruptedException {
     username.sendKeys("superadmin");
     pass.sendKeys("@Ntp@");
     loginBtn.click();
     return invalidCred.getText();
    }
    public void loginValid() {
        username.clear();
        username.sendKeys("superadmin");
        pass.clear();
        pass.sendKeys("TrMISsuperAdmin@Ntp@");
        loginBtn.click();
    }

}
