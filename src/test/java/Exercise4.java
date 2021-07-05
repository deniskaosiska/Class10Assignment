import com.paulhammant.ngwebdriver.NgWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Exercise4 {
    private static WebDriver driver;
    private static int x= 6;

   // @BeforeTest
//    public static void onceBeforengWebDriver(){
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Denis.Kozyra\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
//        driver = new ChromeDriver();
//        NgWebDriver ngWebDriver = new NgWebDriver((JavascriptExecutor) driver);
//        ngWebDriver.waitForAngularRequestsToFinish();
//        driver.get("https://dgotlieb.github.io/WebCalculator/");
//    }
    @BeforeTest
    public static void beforeChrome(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Denis.Kozyra\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dgotlieb.github.io/WebCalculator/");
    }
    @Test
    public static void exercise4a(){
       System.out.println( driver.findElement(Constants.ID7).getRect().getWidth());
       System.out.println( driver.findElement(Constants.ID7).getRect().getHeight());
    }
    @Test
    public static void exercise4b(){
        System.out.println("Button 6 is displayed " + driver.findElement(By.id("six")).isDisplayed());
    }
    @Test
    public static void exercise4c(){
        POM pom = new POM(driver);
       int y=  pom.calculate();
       Assert.assertEquals(y,x);
    }
}
