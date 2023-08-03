package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentAndCheckout {
    WebDriver driver = null;
    By CheckoutButton = By.id("checkout");
    By PaymentPageTitle = By.className("title");
    public PaymentAndCheckout(WebDriver driver){
        this.driver = driver;
    }

    public void clickOnCheckoutButton (){
        driver.findElement(CheckoutButton).click();
    }
    public String paymentPageTitle(){
        return driver.findElement(PaymentPageTitle).getText();
    }

}
