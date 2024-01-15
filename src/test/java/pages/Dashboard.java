package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Dashboard {
    @FindBy(className = "bx--list-box__menu-item__option")
    List <WebElement> Setyear;
    @FindBy(className = "bx--list-box__menu-icon")
    List <WebElement> Selctdropdownyear;
    @FindBy(className = "bx--list-box__selection")
    WebElement Clearyear;

    @FindBy(className = "bx--list-box__menu-icon")
    List <WebElement> Selectdropdownmonth;

    @FindBy(className = "bx--list-box__menu-item__option")
    List <WebElement> Setmonth;

    public Dashboard(WebDriver Driver){
        PageFactory.initElements(Driver,this);
    }
    public void Selctdropdown(){
       // ChooseYear.clear();
        Selctdropdownyear.get(0).click();
    }
    public void Clearyear(){
        Clearyear.click();
    }
    public void Setyear(){
        Setyear.get(1).click();
    }
    public void Setmonth(){
        Selectdropdownmonth.get(1).click();
        Setmonth.get(1).click();
    }
    public void Setday(){
        Selectdropdownmonth.get(2).click();
        Setmonth.get(5).click();
    }
}
