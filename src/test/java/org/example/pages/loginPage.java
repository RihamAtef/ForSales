package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.stepDefs.Hooks.driver;
// this class is done for locators of login-page
public class loginPage {
    // this is constructor is done for this class,
    public loginPage()
    {
        PageFactory.initElements(driver,this);
    }
   @FindBy(id="user-name")
//            @FindBy(xpath ="//*[@id=\"user-name\"]" )
   public WebElement userName;
    @FindBy(id="password")
    public WebElement password;
    @FindBy(name="login-button")
    public WebElement loginButton;
}

