import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
public class automation {
    public static void main(String[] args) throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability ("deviceName" ,"Android Emulator");
        cap.setCapability ("udid", "547f58b9");
        cap.setCapability ("platformName" , "Android");
        cap.setCapability ("platformVersion" , "14");
        cap.setCapability ("appPackage","io.appium.android.apis");
        cap.setCapability ("appActivity",".ApiDemos");
        cap.setCapability("automationName", "UiAutomator2");

        AndroidDriver driver1 = new AndroidDriver(new URL ("http://127.0.0.1:4723/"),cap);
        System.out.println("test");
        driver1.quit();
    }
}