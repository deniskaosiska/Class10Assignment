import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Singelton {
    private static WebDriver driver;

    public static WebDriver getDriverInstance(){
        if(driver == null){
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Denis.Kozyra\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://dgotlieb.github.io/WebCalculator/");
        }

        return driver;
    }
}
