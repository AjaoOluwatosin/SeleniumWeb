import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloSeleniumTest {
    @Test //Annotation
    public void firstTest()
    {
        //Telling the system where to find chromedriver.
        System.setProperty("webdriver.chrome.driver", "resource/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //Starts a new chrome browser
        driver.get("https://www.saucedemo.com/");
        driver.quit();

    }

}
