package com.it.pages;

import com.it.driver.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

import static com.it.common.Constants.BASE_URL;

public abstract class BasePage {
        protected static WebDriver driver;

    static {
        try {
            driver = DriverFactory.getDriver();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public BasePage() {
        PageFactory.initElements(driver,this);
    }
}
