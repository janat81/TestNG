package techproed.tests.paralleltesting;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import techproed.utilities.ReusableMethods;
import java.time.Duration;
public class Day22_ManagerLogin {
    @Test
    public void customerLogin() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://www.bluerentalcars.com/login");
        driver.findElement(By.id("formBasicEmail")).sendKeys("sam.walker@bluerentalcars.com");
        Thread.sleep(2000);
        driver.findElement(By.id("formBasicPassword")).sendKeys("c!fas_art");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.quit();
    }
}
