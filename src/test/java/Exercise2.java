import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Exercise2 {
    static private ChromeDriver driver;

    @BeforeClass
    public static void BeforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Denis.Kozyra\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        driver = new ChromeDriver();
        NgWebDriver ngWebDriver = new NgWebDriver(driver);
        ngWebDriver.waitForAngularRequestsToFinish();
        driver.get("https://dgotlieb.github.io/AngularJS/main.html");
    }
    @Test
    public static void exercise2(){
        driver.findElement(ByAngular.model("ng-model")).clear();
        driver.findElement(ByAngular.model("ng-model")).sendKeys("Denis");
       //String actual =  driver.findElement(ByAngular.model("ng-model")).sendKeys("Denis").getAttribute("ng-model");

        // Assert.assertEquals(actual , "Denis");

    }
}