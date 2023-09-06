package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.stepDefs.Hooks.driver;
// this class is done for locators in check out page
public class checkoutpage {
    public checkoutpage()
    {

        PageFactory.initElements(driver,this);
    }
  @FindBy(id="first-name")
    public WebElement firstNameCheckOut;
    @FindBy(id="last-name")
    public  WebElement lastNameCheckOut;
    @FindBy(name="postalCode")
    public  WebElement postalCode;
    @FindBy(name="continue")
    public WebElement continueBtn;
    @FindBy(name="finish")
    public  WebElement finishBtn;
    @FindBy (className = "complete-header")
    public  WebElement finishText;
}
