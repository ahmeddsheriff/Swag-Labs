package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProcessInformation {
    WebDriver driver = null ;
    By FinishButton = By.id("finish");
    By ProcessConfirmation = By.className("title");
    public ProcessInformation (WebDriver driver){
        this.driver = driver ;
    }
    public void clickFinishButton (){
        driver.findElement(FinishButton).click();
    }
    public String confirmationPageHeader (){
        return driver.findElement(ProcessConfirmation).getText();
    }
}
