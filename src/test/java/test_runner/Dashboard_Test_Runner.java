package test_runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Dashboard;
import pages.LoginPage;
import pages.Logout;
import pages.TrainingPage;
import setup.Setup;

public class Dashboard_Test_Runner extends Setup {
    LoginPage loginPage;
    Dashboard dashboard;
    Logout logout;
    TrainingPage trainingPage;

   // @Test(priority = 1,description = "User doLogin with Valid credential")
    @BeforeTest
    public  void LoginWithValidCred() throws InterruptedException {
        LoginPage loginPage=new LoginPage(Driver);
        loginPage.loginValid();
        Thread.sleep(3000);
    }
    @Test(priority = 2,description = "Check Enrolled Participants Available")
    public void TotalParticipants(){
        String msg_actual=Driver.findElements(By.className("t-text-base")).get(0).getText();
        String msg_expected="Participants Enrolled";
        Assert.assertTrue(msg_actual.contains(msg_expected));
    }
    @Test(priority = 3,description = "User Can Select Year")
    public void ChoseYear() throws InterruptedException {
        Dashboard dashboard=new Dashboard(Driver);
        dashboard.Clearyear();
        Thread.sleep(500);
        dashboard.Selctdropdown();
        Thread.sleep(500);
        dashboard.Setyear();
    }
    @Test(priority = 4,description = "User Can Select From Date")
    public void Chosemonth() throws InterruptedException {
        Dashboard dashboard=new Dashboard(Driver);
        dashboard.Setmonth();
    }
    @Test(priority = 5,description = "User Can Select To Date")
    public void ChoseDay() throws InterruptedException {
        Dashboard dashboard=new Dashboard(Driver);
        dashboard.Setday();
       // Thread.sleep(500);
        Driver.navigate().refresh();
    }
    @Test(priority = 6,description = "User Logoutt")
    public void Logout() throws InterruptedException {
        Logout logout=new Logout(Driver);
        logout.Logout();
        Thread.sleep(500);
    }
}
