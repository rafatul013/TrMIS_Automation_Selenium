package test_runner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.TrainingPage;
import setup.Setup;

public class Training_test_runner extends Setup {
    LoginPage loginPage;
    TrainingPage trainingPage;

    @BeforeTest
//    @Test(priority = 1,description = "User can login")
    public  void LoginWithValidCred() throws InterruptedException {
        LoginPage loginPage=new LoginPage(Driver);
        loginPage.loginValid();
        Thread.sleep(3000);
    }
    @Test(priority = 2,description = "User can Select Training")
    public  void Opentrainingpage() throws InterruptedException {
        TrainingPage trainingPage=new TrainingPage(Driver);
        //Driver.get("https://trmis.inneed.cloud/admin/training/training-courses");
        trainingPage.ViewTraining();
        Thread.sleep(5000);
    }
}
