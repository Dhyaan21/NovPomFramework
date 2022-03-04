package com.nopcommerce.Pages;

import com.nopcommerce.Utilities.Utils;
import com.nopcommerce.base.Basepage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class Registerpage {


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

    public Registerpage(WebDriver driver) {
        this.driver = driver;
        utils = new Utils(driver);
    }

    public String getPageTitle(){
        String title = driver.getTitle();
        return title;
    }

}