package com.nopcommerce.base;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import sun.plugin.com.Utils;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



public class Basepage {

    WebDriver driver;
    Properties prop;

    public WebDriver intialiseDriver(String browserName) {

        if (!browserName.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if (browserName.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();


        }
        else if(browserName.equals("egde")){
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();

        }else{
            System.out.println(browserName + "Browser is invalid");
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        return driver;
    }

    public Properties initialiseProperties(){
        prop = new Properties();

        try {
            FileInputStream ip = new FileInputStream("C:\\UsersData\\Simy\\Java Classes\\NovPomFramework\\src\\test\\TestData\\Config.properties");

            prop.load(ip);
        }catch(FileNotFoundException ex)
        {
            ex.printStackTrace();
        }catch(IOException ex) {
            ex.printStackTrace();
        }
        return prop;
    }

}

