import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Test {
    public AppiumDriver driver;
    @BeforeTest
    public void setup() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 8 API 30");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.calculator2.Calculator");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.google.android.calculator");
        capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @org.testng.annotations.Test
    public void additionTest() {
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='2']")).click();
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='plus']")).click();
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='4']")).click();
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='equals']")).click();
        driver.findElement(By.className("android.widget.TextView")).getText();
        Assert.assertEquals(6,6);
    }
    @org.testng.annotations.Test
    public void subtractionTest() {
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='5']")).click();
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='minus']")).click();
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='4']")).click();
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='equals']")).click();
        driver.findElement(By.className("android.widget.TextView")).getText();
        Assert.assertEquals(1,1);
    }
    @org.testng.annotations.Test
    public void multiplicationTest() {
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='3']")).click();
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='multiply']")).click();
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='3']")).click();
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='equals']")).click();
        driver.findElement(By.className("android.widget.TextView")).getText();
        Assert.assertEquals(9,9);
    }
    @org.testng.annotations.Test
    public void divisionTest() {
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='5']")).click();
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='divide']")).click();
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='1']")).click();
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='equals']")).click();
        driver.findElement(By.className("android.widget.TextView")).getText();
        Assert.assertEquals(5,5);
    }
    @AfterTest

    public void tearDown() {

        driver.quit();

    }
}

