import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.Test;

public class Excercise6 {
    private static WebDriver driver;
    @Test
    public static void Print() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Denis.Kozyra\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://dgotlieb.github.io/WebCalculator/");
        options.addArguments("--kiosk-printing");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.print();");
    }
}
