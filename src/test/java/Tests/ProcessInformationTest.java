package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static Tests.LoginTest.info;

public class ProcessInformationTest {
    @Test(priority = 4)
    public void confirmProcess () throws InterruptedException {
        info.clickFinishButton();
        Thread.sleep(2000);
        System.out.println(info.confirmationPageHeader());
        Assert.assertEquals(info.confirmationPageHeader() , "Checkout: Complete!");
    }
}
