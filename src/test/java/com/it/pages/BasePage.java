package com.it.pages;

import com.it.driver.DriverFactory;
import com.it.driver.MyDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;


import static com.it.common.Constants.BASE_URL;

public abstract class BasePage {
    protected Logger log = Logger.getLogger(this.getClass().getCanonicalName());
    protected static MyDriver driver;

    static {
        try {
            driver = MyDriver.getMyDriver();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }



    public BasePage() {
        PageFactory.initElements(driver,this);
    }
}
