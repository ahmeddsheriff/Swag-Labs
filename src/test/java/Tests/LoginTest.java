package Tests;

import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class LoginTest {
    WebDriver driver =null;
    LoginPage loginPage;
    public static HomePage home;
    public static PaymentAndCheckout payment;
    public static CustomerDetails customer;
    public static ProcessInformation info;
    public static ThankYouPage thankyou;
    @BeforeTest
    public void Configuration () throws IOException, ParseException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        home = new HomePage(driver);
        payment = new PaymentAndCheckout(driver);
        customer = new CustomerDetails(driver);
        info = new ProcessInformation(driver);
        thankyou = new ThankYouPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    @Test (priority = 0)
    public void loginTest () throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        loginPage.enterUserName();
        Thread.sleep(2000);
        loginPage.enterPassword();
        Thread.sleep(2000);
        loginPage.clickLogin();
        Thread.sleep(2000);
        System.out.println(loginPage.homePageHeader());
        Assert.assertEquals(loginPage.homePageHeader(), "Products");
    }
    @AfterTest
    public void quitDriver(){
        driver.quit();
    }
}
