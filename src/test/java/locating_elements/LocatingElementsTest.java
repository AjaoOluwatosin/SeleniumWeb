package locating_elements;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class LocatingElementsTest {
    WebDriver driver;
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resource/chromedriver.exe");
        driver = new ChromeDriver();

    }
    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void elementsQuiz()
    {
        //Navigate to the URL.
        driver.get("https://saucedemo.com/");
        //Find Element //Check the state
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element = wait.until(
                ExpectedConditions.presenceOfElementLocated(By.id("user-name")));
        //Take action //Record the result
        assertTrue(element.isDisplayed());


     }
    @Test
    public void typesOfLocators(){

        //Navigate to the URL.
        driver.get("https://saucedemo.com/");
        //Find Element
        WebElement element;
        //ID
        element = driver.findElement(By.id("user-name"));
        //Name
        //driver.findElement(By.name("name of locator"));
        //Tag Name
        driver.findElement(By.tagName("input"));
        //Class name
        driver.findElement(By.className("form_input"));
        //Xpath
        driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));


    }
    @Test
    public void locatorExam(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.saucedemo.com/");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Use CSS selectors
        driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));



        //Use Xpath
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")).click();
        WebDriverWait cartWait = new WebDriverWait(driver, Duration.ofSeconds(20));


        //Use the best locator
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        WebDriverWait containerWait = new WebDriverWait(driver, Duration.ofSeconds(20));

        //Use Id
        driver.findElement(By.id("checkout")).click();
        WebDriverWait checkoutWait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.findElement(By.cssSelector("#first-name")).sendKeys("Oluwatosin");
        driver.findElement(By.id("last-name")).sendKeys("Ajao");
        driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("200824");
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
        WebDriverWait idWait = new WebDriverWait(driver, Duration.ofSeconds(20));
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        driver.findElement(By.cssSelector("#finish")).click();
        WebDriverWait finishWait = new WebDriverWait(driver, Duration.ofSeconds(20));

        Assert.assertTrue(driver.findElement(By.cssSelector("#checkout_complete_container > img")).isDisplayed());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
