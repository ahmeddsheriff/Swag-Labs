package Pages;

import com.google.gson.JsonParser;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.FileReader;
import java.io.IOException;

public class LoginPage {
    WebDriver driver =null;
    JSONParser jsonParser = new JSONParser();
    JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader("Utilities\\read.json"));
    By userNameLocator = By.id("user-name");
    By passwordLocator = By.id("password");
    By loginButtonLocator = By.id("login-button");
    By homePageHeader = By.className("title");
    public LoginPage (WebDriver driver) throws IOException, ParseException {
        this.driver = driver;
    }
    public void enterUserName (){

        driver.findElement(userNameLocator).sendKeys(jsonObject.get("username").toString());
    }
    public void enterPassword (){
        driver.findElement(passwordLocator).sendKeys(jsonObject.get("password").toString());
    }
    public void clickLogin (){
        driver.findElement(loginButtonLocator).click();
    }
    public String homePageHeader (){
        return driver.findElement(homePageHeader).getText();
    }
}
