package factoryDevice;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.GetProperties;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Android implements IDevice {
    @Override
    public AppiumDriver create() {
        DesiredCapabilities config = new DesiredCapabilities();
//        config.setCapability("appium:deviceName","Pixel 3 XL API 29");
//        config.setCapability("appium:platformVersion","10.0");
//        config.setCapability("appium:appPackage","com.vrproductiveapps.whendo");
//        config.setCapability("appium:appActivity","com.vrproductiveapps.whendo.ui.HomeActivity");
        config.setCapability("deviceName", GetProperties.getProperties().getDeviceName());
        config.setCapability("platformVersion",GetProperties.getProperties().getPlatformVersion());
        config.setCapability("appPackage",GetProperties.getProperties().getAppPackage());
        config.setCapability("appActivity",GetProperties.getProperties().getAppActivity());
        config.setCapability("platformName","Android");
        config.setCapability("appium:automationName","uiautomator2");
        AppiumDriver device = null;
        try {
            device = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), config);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        // implicit / explicit / fluent
        device.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        return device;
    }
}
