package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver = null;
    By AddToCart = By.id("add-to-cart-sauce-labs-backpack");
    By CartLogo = By.className("shopping_cart_link");
    By NumberOfItems = By.className("shopping_cart_badge");
    By CartPageHeader = By.className("title");

    public HomePage ( WebDriver driver) {
        this.driver = driver;
    }
    public void AddToCart (){
        driver.findElement(AddToCart).click();
    }
    public String getNumberOfItems (){
        return driver.findElement(NumberOfItems).getText();
    }
    public void goToCartPage (){
        driver.findElement(CartLogo).click();
    }
    public String cartPageHeader (){
        return driver.findElement(CartPageHeader).getText();
    }
}
