import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Exercise7{
    private static WebDriver driver;

    @BeforeTest
    public void onceBefore(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Denis.Kozyra\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dgotlieb.github.io/AngularJS/main.html");
    }

    @Test
    public void setName (){
        try {
            driver.findElement(By.xpath("/html/body/label[1]/input")).clear();
            driver.findElement(By.xpath("/html/body/label[1]/input")).sendKeys("Denis");
            String actual = driver.findElement(By.xpath("/html/body/label[1]/input")).getText();
            driver.findElement(By.xpath("/html/body/label[1]/input")).submit();
            Assert.assertEquals(actual, "Denis");
        } catch (Exception e){
            System.out.println("Something went wrong.");
        }

    }
}
