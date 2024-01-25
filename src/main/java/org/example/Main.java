package org.example;

import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.CapabilityType;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.internal.filters.AppiumIdempotencyFilter;
import io.appium.java_client.internal.filters.AppiumUserAgentFilter;
import java.net.MalformedURLException;
import java.net.URL;
public class Main{

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        UiAutomator2Options options= new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
        options.setDeviceName("Android Emulator");
        options.setApp(System.getProperty("G:\\New folder\\nopstationCart_4.40 1.apk"));

        AndroidDriver driver= new AndroidDriver (new URL("http://127.0.0.1:4723"),options);
        Thread.sleep(4000);
    }

}
