package org.example.stepDefs;
import static org.example.stepDefs.Hooks.driver;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.checkoutpage;
import org.example.pages.homePage;
import org.example.pages.loginPage;
import org.example.pages.shoppingCartPage;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import org.example.stepDefs.checkOut;


public class checkOut {
    loginPage login = new loginPage();
    homePage home = new homePage();
    shoppingCartPage shoppingCart = new shoppingCartPage();
    checkoutpage checkout = new checkoutpage();


    @Given("The Guest user open edge browser,navigate to website and Login")
    public void  TheGuestUserOpenEdgeBrowserNavigateToWebsiteAndLogin() {
        // her we enter name and password in sendkeys by calling the object from class login page
        login.userName.sendKeys("standard_user");
        login.password.sendKeys("secret_sauce");
        login.loginButton.click();

    }

    @And("The Guest user select lowest price item and add it to cart")
    public void theGuestUserSelectLowestPriceItemAndAddItToCart() throws InterruptedException {
        // her we use select class as the drop-down menu is from typ static menu
        Select select = new Select(home.chooseMethod);
        select.selectByValue("lohi");
        home.addToCart.click();
        // I just made this to see it when the product is added to card
        Thread.sleep(3000);

    }

    @When("The Guest user  Proceed to checkout")
    public void theGuestUserProceedToCheckout() throws InterruptedException {
        shoppingCart.shoppingCrtIcon.click();
        Thread.sleep(3000);
        shoppingCart.checkOutBtn.click();
        Thread.sleep(3000);
    }

    @And("The Guest user Add required data in your information screen{string},{string},{string}")
    public void theGuestUserAddRequiredDataInYourInformationScreen(String arg0, String arg1, String arg2) {
        Faker faker= new Faker();
        arg0= faker.name().firstName();
        arg1= faker.name().lastName();
        arg2 = faker.address().zipCode();
        checkout.firstNameCheckOut.sendKeys(arg0);
        checkout.lastNameCheckOut.sendKeys(arg1);
        checkout.postalCode.sendKeys(arg2);
        checkout.continueBtn.click();
    }



    @And("The Guest user Complete checkout process")
    public void theGuestUserCompleteCheckoutProcess() {

        checkout.finishBtn.click();
    }
    SoftAssert soft= new SoftAssert();

    @Then("The Guest user complete order on")
    public void theGuestUserCompleteOrderOn() {
        String Actual = driver.getCurrentUrl();
        String expected = checkout.finishText.getText();
        boolean result = Actual.contains(expected);
        soft.assertTrue(result);

    }
}
