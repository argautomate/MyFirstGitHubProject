import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest {

    public static WebDriver driver;


    @BeforeSuite
    public void setUp()
    {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("http://gmail.com");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @Test
    public void doLogin() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("argautomate@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();

        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".I0VJ4d > div:nth-child(1) > input:nth-child(1)")).sendKeys("se1en1um");
        driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();
        driver.manage().window().maximize();
    }

    @AfterSuite
    public void tearDown()
    {
        driver.quit();
    }
}
