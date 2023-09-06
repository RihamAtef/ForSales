package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.stepDefs.Hooks.driver;
// this class os done for locators in home page
public class shoppingCartPage
{
    public shoppingCartPage()
    {
        PageFactory.initElements(driver,this);
    }
    @FindBy(className = "shopping_cart_link")
    public WebElement shoppingCrtIcon;
    @FindBy(className = "checkout_button")
    public  WebElement checkOutBtn;

}
