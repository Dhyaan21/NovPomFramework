package com.nopcommerce.tests;

import com.nopcommerce.Pages.Registerpage;
import com.nopcommerce.Utilities.Utils;
import com.nopcommerce.base.Basepage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Properties;

public class RegisterpageTest {

    Basepage basepage;
    Properties prop;
    Registerpage registerpage;
    WebDriver driver;
    Utils utils;


    By Register = By.className("ico-register");
    By Female = By.id("gender-female");
    By FirstName = By.id("FirstName");
    By Lastname = By.id("LastName");
    By dobDay = By.id("DateOfBirthDay");
    By dobMonth = By.id("DateOfBirthMonth");
    By dobYear = By.id("DateOfBirthYear");
    By email = By.id("Email");

    @BeforeMethod
    public void openbrowser() {
        basepage = new Basepage();

        prop = basepage.initialiseProperties();

        String browser = prop.getProperty("browser");
        driver = basepage.intialiseDriver(browser);
        driver.get(prop.getProperty("url"));
        registerpage = new Registerpage(driver);
    }

    @Test(priority = 1)
    public void VerifyRegistationPageTitleTest()
    {
        Assert.assertEquals(registerpage.getPageTitle(), "nopCommerce demo store. Register");
    }
    @Test(priority = 2)
    public void VerifyFemalePageTitleTest()
    {
        //Assert.assertEquals();
    }
}


