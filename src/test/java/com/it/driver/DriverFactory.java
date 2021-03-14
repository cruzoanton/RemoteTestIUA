package com.it.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.WatchEvent;
import java.util.concurrent.TimeUnit;

import static com.it.common.Constants.BASE_URL;


public class DriverFactory{
    public static final String USERNAME = "bsuser7502162546";
    public static final String AUTOMATE_KEY = "ypxndyQfLQ32SxXbdExS";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    public static WebDriver getDriver() throws MalformedURLException {

        WebDriver driver = null;
        String driverName = System.getProperty("driver");
        if (driverName != null) {
            if ("fireFox".equals(driverName)) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            } else if ("chrome".equals(driverName)) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            } else if ("remoteWin10".equals(driverName)) {
//                DesiredCapabilities caps = new DesiredCapabilities();
//                caps.setCapability("os", "Windows");
//                caps.setCapability("os_version", "10");
//                caps.setCapability("browser", "Chrome");
//                caps.setCapability("browser_version", "latest");
//                driver = new RemoteWebDriver(new URL(URL), caps);
                } else {
                throw new UnsupportedOperationException();
            }
        } else {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        }
        driver.manage().window().maximize();
       driver.get(BASE_URL);
        return driver;
    }
}
