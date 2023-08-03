package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static Tests.LoginTest.payment;

public class PaymentAndCheckoutTest {
    @Test(priority = 2)
    public void checkout () throws InterruptedException {
        payment.clickOnCheckoutButton();
        Thread.sleep(2000);
        System.out.println(payment.paymentPageTitle());
        Assert.assertEquals(payment.paymentPageTitle(), "Checkout: Your Information");
    }
}
