package core;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverFactory {
    private static WebDriver driver;
    private static WebDriverWait wait;

    private DriverFactory() {

    }

    public static WebDriver getDriver(){
        if(driver == null) {
            switch (Propriedades.browser) {
                //case FIREFOX: driver = new FirefoxDriver(); break;
                case CHROME:
                    System.setProperty("webdriver.chrome.driver","chromedriver.exe");
                    driver = new ChromeDriver(); break;
            }
            driver.manage().window().setSize(new Dimension(1200, 765));
            driver.get("http://sampleapp.tricentis.com/101/app.php");
        }
        return driver;
    }
    public static WebDriverWait getWait(WebDriver driver){
        driver = getDriver();
        wait= new WebDriverWait(driver,60);
        return wait;
    }

    public static void killDriver(){
        if(driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
