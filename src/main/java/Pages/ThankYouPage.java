package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ThankYouPage {
    WebDriver driver = null ;
    By BackToHomeButton = By.id("back-to-products");
    By HomePageHeader = By.className("title");
    public ThankYouPage (WebDriver driver){
        this.driver = driver ;
    }
    public void clickBackToHomeButton (){
        driver.findElement(BackToHomeButton).click();
    }
    public String homePageHeader (){
        return driver.findElement(HomePageHeader).getText();
    }
}
