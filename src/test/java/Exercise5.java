import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Exercise5 {
    private static WebDriver driver;

    @BeforeTest
    public void onceBefore() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Denis.Kozyra\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.themarker.com/");
    }

    @Test
    public void wordNews() {
        int i;
        String pageSource = driver.getPageSource();
        boolean result = pageSource.contains("news");
        for ( i = 0; i < pageSource.length(); i++ ) {
            i = i + 1;
            //System.out.println("'the word news mentioned " + i + " times");
        }
        System.out.println("'the word news mentioned " + i + " times");


    }
}
