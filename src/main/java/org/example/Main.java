package org.example;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;

public class Main {
    public static void main(String[] args) {
        XCUITestOptions xcuiTestOptions = new XCUITestOptions();
        xcuiTestOptions.setDeviceName("iPhone 11 Simulator")
                .setPlatformVersion("14.5");
        IOSDriver driver = new IOSDriver(xcuiTestOptions);
        driver.get("https://www.google.com");

    }
}