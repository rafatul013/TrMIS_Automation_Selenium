package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TrainingPage {
    @FindBy(className = "bx--side-nav__submenu")
    List <WebElement> OpenTraining;

    @FindBy(className = "t-mt-3 bx--side-nav__link")
    WebElement ViewTrainingCourse;

    public TrainingPage(WebDriver Driver){
        PageFactory.initElements(Driver,this);
    }
    public void ViewTraining() throws InterruptedException {
        OpenTraining.get(0).click();
        Thread.sleep(100);
        ViewTrainingCourse.click();
    }
}
