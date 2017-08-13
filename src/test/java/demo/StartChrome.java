package demo;

/**
 * Created by Swarn on 7/8/2017.
 */
        import java.net.MalformedURLException;
        import java.net.URL;
        import io.appium.java_client.android.AndroidDriver;
        import io.appium.java_client.remote.MobileCapabilityType;
        import org.openqa.selenium.By;
        import org.openqa.selenium.Platform;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.remote.BrowserType;
        import org.openqa.selenium.remote.DesiredCapabilities;
        import org.testng.annotations.Test;

public class StartChrome
{


    @Test
    public void test1() throws MalformedURLException {

// Create object of DesiredCapabilities classand specify android platform
        DesiredCapabilities capabilities=DesiredCapabilities.android();


// set the capability to execute test in chrome browser
capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, BrowserType.CHROME);

// set the capability to execute our test in Android Platform
 capabilities.setCapability(MobileCapabilityType.PLATFORM,Platform.ANDROID);

// we need to define platform name
 capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");

// Set the device name as well (you can give any name)
capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"ZY2232335Z");

//set the android version as well
 capabilities.setCapability(MobileCapabilityType.VERSION,"6.0");

// Create object of URL class and specify the appium server address
URL url= new URL("http://127.0.0.1:4727/wd/hub");

// Create object of AndroidDriver class and pass the url and capability that we created
WebDriver driver = new AndroidDriver(url, capabilities);

// Open url
 driver.get("http://www.facebook.com");


// print the title
 System.out.println("Title "+driver.getTitle());

 //driver.findElement(By.xpath("/[@id=\"feed_jewel\"]/a/div")).click();

// enter username
        driver.findElement(By.name("email")).sendKeys("mukesh@gmail.com");

// enter password
   driver.findElement(By.name("pass")).sendKeys("mukesh_selenium");

// click on submit button
        driver.findElement(By.id("u_0_5")).click();

// close the browser
        //driver.quit();

}
}
