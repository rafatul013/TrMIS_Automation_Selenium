package setup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class Setup {
    public WebDriver Driver ;
    @BeforeSuite
    public void start() {
        String browser = System.getProperty("browser","chrome");
       // System.setProperty("webdriver.chrome.driver", "/home/rafatul/Documents/Automated_Testing/Selenium/chromedriver-linux64/chromedriver");

        if(browser.contains("chrome")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.setHeadless(true);

            WebDriverManager.chromedriver().setup();
            Driver = new ChromeDriver(options);
        }
        else if(browser.contains("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            Driver = new FirefoxDriver();
        }
        else {
            WebDriverManager.edgedriver().setup();
            Driver = new EdgeDriver();
        }
        Driver.manage().window().maximize();
        Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        Driver.get("https://trmis.inneed.cloud/admin");
    }
    @AfterSuite
    public void close(){
       //   setup.Driver.close();

    }
}
