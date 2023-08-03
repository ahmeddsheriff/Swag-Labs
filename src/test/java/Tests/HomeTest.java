package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static Tests.LoginTest.home;

public class HomeTest {
    @Test(priority = 1)
    public void addToCartTest () throws InterruptedException {
        home.AddToCart();
        Thread.sleep(2000);
        String ExpectedResult = home.getNumberOfItems();
        String ActualResult ="1";
        Assert.assertEquals(ExpectedResult, ActualResult);
        System.out.println(home.getNumberOfItems());
        home.goToCartPage();
        Thread.sleep(2000);
        System.out.println(home.cartPageHeader());
        Assert.assertEquals(home.cartPageHeader(), "Your Cart");
    }
}
