package demo;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by Swarn on 8/11/2017.
 */
public class Login {


/**
 * Created by Swarn on 7/9/2017.
 */

// create global variable
    private static AndroidDriver driver;

    public static void main(String[] args) throws MalformedURLException, InterruptedException
    {
        // Create object of DesiredCapabilities class
        DesiredCapabilities capabilities = new DesiredCapabilities();
       // Optional
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
       // Specify the device name (any name)
        capabilities.setCapability("deviceName", "192.168.175.101:5555");
       // Platform version
        capabilities.setCapability("platformVersion", "4.4.2");
       // platform name
        capabilities.setCapability("platformName", "Android");
       // specify the application package that we copied from appium
        capabilities.setCapability("appPackage", "com.cucumberrntest");
       // specify the application activity that we copied from appium
        capabilities.setCapability("appActivity", "com.cucumberrntest.MainActivity");
        // Start android driver I used 4727 port by default it will be 4723
        driver = new AndroidDriver(new URL("http://127.0.0.1:4727/wd/hub"), capabilities);



// Specify the implicit wait of 5 second

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);



// Enter the text in textbox

        //driver.findElement(By.xpath("//android.widget.EditText[@content-desc='my_text_fieldCD']")).sendKeys("Welcome Swarn");
        driver.findElement(By.xpath("//android.widget.EditText[@index=0]")).sendKeys("t@t.com");
        driver.findElement(By.xpath("//android.widget.EditText[@index=1]")).sendKeys("abcd");
        //driver.findElement(By.xpath("//android.widget.TextView[@index=0]")).click();
        driver.findElement(By.className("android.widget.EditText[@]")).click();

        //driver.findElement(By.className("android.widget.TextView")).click();
        //Thread.sleep(5000);
// click on registration button

        //driver.findElement(By.id("io.selendroid.testapp:id/startUserRegistration")).click();



// Wait for 10 second





// close the application
        driver.quit();



    }



}

