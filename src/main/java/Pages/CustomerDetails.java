package Pages;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.FileReader;
import java.io.IOException;

public class CustomerDetails {
    WebDriver driver = null;
    JSONParser jsonParser = new JSONParser();
    JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader("Utilities\\read.json"));
    By FirstNameTextbox = By.id("first-name");
    By LastNameTextbox = By.id("last-name");
    By PostalCodeTextbox = By.id("postal-code");
    By ContinueButton = By.id("continue");
    By ProcessInformationHeader = By.className("title");

    public CustomerDetails (WebDriver driver) throws IOException, ParseException {
        this.driver = driver;
    }
    public void enterFirstName (){
        driver.findElement(FirstNameTextbox).sendKeys(jsonObject.get("FirstName").toString());
    }
    public void enterLastName (){
        driver.findElement(LastNameTextbox).sendKeys(jsonObject.get("LastName").toString());
    }
    public void enterPostalCode (){
        driver.findElement(PostalCodeTextbox).sendKeys(jsonObject.get("PostalCode").toString());
    }
    public void clickContinueButton (){
        driver.findElement(ContinueButton).click();
    }
    public String processInformationHeader (){
        return driver.findElement(ProcessInformationHeader).getText();
    }
}
