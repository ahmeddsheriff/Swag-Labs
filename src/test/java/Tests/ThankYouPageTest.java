package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static Tests.LoginTest.thankyou;

public class ThankYouPageTest {
    @Test(priority = 5)
    public void backToHome () throws InterruptedException {
        thankyou.clickBackToHomeButton();
        Thread.sleep(2000);
        System.out.println(thankyou.homePageHeader());
        Assert.assertEquals(thankyou.homePageHeader() , "Products");
    }
}
