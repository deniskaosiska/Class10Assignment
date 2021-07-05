import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM {
    private static WebDriver driver;


    public POM(WebDriver driver) {
        this.driver = driver;
    }

    public int calculate(){
        driver.findElement(By.id("three")).click();
        driver.findElement(By.id("add")).click();
        driver.findElement(By.id("three")).click();
        driver.findElement(By.id("equal")).click();
        driver.findElement(By.id("screen")).getText();

        return Integer.parseInt(driver.findElement(By.id("screen")).getText());
    }
}
