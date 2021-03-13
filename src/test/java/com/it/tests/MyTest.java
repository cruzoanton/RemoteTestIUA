package com.it.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

public class MyTest extends BaseTest {
    @Test
    public void test() throws InterruptedException {
        app.login.login(validUser);
        Thread.sleep(2000);
        Assert.assertEquals(app.dashboard.getMailUser(), validUser.email);

    }
}
