package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static Tests.LoginTest.customer;

public class CustomerDetailsTest {
    @Test(priority = 3)
    public void fillCustomerData () throws InterruptedException {
        customer.enterFirstName();
        Thread.sleep(2000);
        customer.enterLastName();
        Thread.sleep(2000);
        customer.enterPostalCode();
        Thread.sleep(2000);
        customer.clickContinueButton();
        Thread.sleep(2000);
        System.out.println(customer.processInformationHeader());
        Assert.assertEquals(customer.processInformationHeader() , "Checkout: Overview");
    }
}
