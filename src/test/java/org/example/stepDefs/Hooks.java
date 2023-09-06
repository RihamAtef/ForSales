package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Hooks {
   public static  WebDriver driver = new EdgeDriver();
    @Before
    public void openBrowser() {

        //this function is used to maximize opened window
        driver.manage().window().maximize();
        //this function is used to maximize time to se the running steps
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://www.saucedemo.com/");
    }

    @After
    public void closeBrowser() throws InterruptedException {
        //this function to stay little opened before it close
        Thread.sleep(30000);
        // this function is to close all opened tabs
        driver.quit();

    }
}

