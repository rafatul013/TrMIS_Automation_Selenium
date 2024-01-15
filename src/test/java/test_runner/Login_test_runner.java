package test_runner;

import org.testng.Assert;
import pages.LoginPage;
import org.testng.annotations.Test;
import setup.Setup;

public class Login_test_runner extends Setup {
    LoginPage loginPage;
    @Test(priority = 1, description = "Login with empty username and password")
    public void doLoginWithEmptyCredentials() throws InterruptedException {
        LoginPage loginPage=new LoginPage(Driver);
        loginPage.doLoginWithEmptyCredentials();
      //  Thread.sleep(3000);
        Driver.navigate().refresh();
    }

    @Test(priority = 2,description = "User doLogin with invalid credential")
    public void LoginWithInvalidCred() throws InterruptedException {
        LoginPage loginPage=new LoginPage(Driver);
        String message_actual = loginPage.doLoginWithInvalidCred();
        String message_expected="Invalid Username Or Password";
        Assert.assertTrue(message_actual.contains(message_expected));
       // Thread.sleep(3000);
 }
    @Test(priority = 3,description = "User doLogin with Valid credential")
    public  void LoginWithValidCred() throws InterruptedException {
        LoginPage loginPage=new LoginPage(Driver);
        loginPage.loginValid();
        Thread.sleep(3000);
 }

}
