package org.example.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.stepDefs.Hooks.driver;
// this class done for locators at home page
public class homePage
{
public homePage()
{
    PageFactory.initElements(driver,this);
}
@FindBy(className = "product_sort_container")
    public WebElement chooseMethod;
@FindBy(id = "add-to-cart-sauce-labs-onesie")
public WebElement addToCart;

}
