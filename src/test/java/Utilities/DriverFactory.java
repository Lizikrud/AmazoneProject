package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
    private static WebDriver driver;

    public static WebDriver getDriver () {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "/Users/lizikrud/IdeaProjects/AmazoneProject/src/test/java/recources/drivers/chromedriver");
            driver = new ChromeDriver();
        }
        return driver;
    }
    public static void closeDriver () {
        if (driver != null) {
            driver.close();
            driver = null;
        }
    }

}
