import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumTest {
    //Navigate to this URL using another browser https://the-internet.herokuapp.com
    //Navigate to this URL https://example.cypress.io
    //Navigate to https://react-shopping-cart-67954.firebaseapp.com/
    //Using WebDriverManager

    @Test
    public void edgeTest() throws InterruptedException{
        System.setProperty("webdriver.edge.driver", "resource/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com");
        Thread.sleep(5000);
        driver.quit();

    }


}
