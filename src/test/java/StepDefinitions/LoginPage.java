package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.xmlbeans.SystemProperties;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    WebDriver driver;
    @Given("user lands on Amazon Page")
    public void user_lands_on_Amazon_Page() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
    }

    @When("User enters username")
    public void user_enters_username() {
        driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("t6297374@gmail.com");

    }

    @When("clicks on continue button")
    public void clicks_on_continue_button() {
        driver.findElement(By.xpath("//input[@id='continue']")).click();

    }

    @When("User enters  password")
    public void user_enters_password() {
        driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("1q2w3e4rt5");
    }

    @When("clicks on Sign in button")
    public void clicks_on_Sign_in_button() {
        driver.findElement(By.xpath("//*[@id='signInSubmit']")).click();
    }

    @Then("User should be able see home page")
    public void user_should_be_able_see_home_page() {
        boolean expected = true;
        boolean actual = driver.findElement(By.xpath("//*[@id='nav-tools']//*[contains(text(), 'Hello')]")).isDisplayed();
        Assert.assertEquals("Account name doesnt visible",expected, actual );
    }

}
