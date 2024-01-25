
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Task2 {
    AppiumDriver driver;

    @Test
    public void setup() throws MalformedURLException, InterruptedException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("automationName", "UiAutomator2");
        dc.setCapability("platformName", "Android");
        dc.setCapability("platformVersion", "14.0"); // Replace with your device's Android version
        dc.setCapability("deviceName", "Android Emulator"); // Replace with your device's name

        dc.setCapability("app", "/Users/abira/Downloads/nopstationCart_4.40 1.apk");
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723"), dc);
         Thread.sleep(5000);
         //scenario_01
        driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/btnAccept")).click();
        driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"Placeholder\"])[5]")).click();
        driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"Placeholder\"])[9]")).click();
        driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/btnPlus\"]")).click();
        driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/btnAddToCart\"]\n")).click();
      ////scenario_02

        Thread.sleep(5000);
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Placeholder\"]")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/tvProductPrice\" and @text=\"$349.00 \"]")).click();
        driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/btnGuestCheckout")).click();
        driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etFirstName")).sendKeys("Abir");
        driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etLastName")).sendKeys("Arshad");
        driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etEmail")).sendKeys("abirarshad0@gmail.com");
        driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/countrySpinner")).click();
        driver.findElement(By.id("(//android.widget.TextView[@resource-id=\"android:id/text1\"])[3]")).click();
        driver.findElement(By.xpath("//android.widget.Spinner[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/stateSpinner\"]")).click();
        driver.findElement(By.id("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"Alaska\"]")).click();
        driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etCity")).sendKeys("Dhaka");
        driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etStreetAddress")).sendKeys("Gulshan");
        driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etStreetAddress2")).sendKeys("11");
        driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etZipCode")).sendKeys("1212");
        driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etPhone")).sendKeys("01718333267");
        driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etFax")).sendKeys("2323");
        driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/btnContinue")).click();
        driver.findElement(By.xpath("(//android.widget.TextView[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/tvShippingMethodName\"])[4]")).click();
        driver.findElement(By.xpath("(//android.widget.Button[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/btnContinue\"])[2]")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/tvPaymentMethodName\" and @text=\"Check / Money Order\"]")).click();
        driver.findElement(By.xpath("(//android.widget.Button[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/btnContinue\"])[2]")).click();

        driver.findElement(By.xpath("//android.widget.Button[@text=\"Next\"]")).click();
        driver.findElement(By.xpath("//android.widget.ScrollView[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/rootScrollViewBillingAddress\"]")).click();
        driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/md_button_negative\"]"));





    }
}


