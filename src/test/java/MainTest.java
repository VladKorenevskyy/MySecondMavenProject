import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class MainTest {

    WebDriver driver;

    @BeforeTest
    public void setDriver() {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://www.99-bottles-of-beer.net");
        driver.manage().window().maximize();
    }

    @AfterTest
    public void QuitDriver() {
        driver.quit();
    }

    @Test
    public void URLTest() {

        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual, "http://www.99-bottles-of-beer.net/");
    }

    @Test
    public void VerifyHeaderText() {

        WebElement element = driver.findElement(By.xpath("//h2[normalize-space()='Welcome to 99 Bottles of Beer']"));
        Assert.assertEquals(element.getText(), "Welcome to 99 Bottles of Beer");
    }
}
