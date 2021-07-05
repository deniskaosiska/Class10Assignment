import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Main {
 private static WebDriver driver;
 private static WebDriverWait wait;

 @BeforeTest
    public static void beforeChromeImplicityWait(){
     System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Denis.Kozyra\\\\Downloads\\\\geckodriver-v0.29.1-win64\\\\geckodriver.exe");
     driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     driver.get("https://dgotlieb.github.io/Selenium/synchronization.html");
 }
    @BeforeTest
    public static void beforeChromeExplicityWait(){
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Denis.Kozyra\\\\Downloads\\\\geckodriver-v0.29.1-win64\\\\geckodriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://dgotlieb.github.io/Selenium/synchronization.html");
    }

 @Test
    public static void exercise1a(){
     driver.findElement(By.id("btn"));
     driver.findElement(By.id("checkbox"));
     driver.findElement(By.id("hidden")).click();

 }
@Test
        public static void excercise1b() throws InterruptedException {
    driver.findElement(By.id("hidden")).click();
    Thread.sleep(5000);
    driver.findElement(By.id("finish1"));
}
@Test
    public static void exercise1c(){
     driver.findElement(By.id("render")).click();
     wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("finish2")));

}

//3. PageLoadTimeOut - This sets the time to wait for a page to load completely before throwing an error






}
