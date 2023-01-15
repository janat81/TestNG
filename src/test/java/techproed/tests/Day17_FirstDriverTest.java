package techproed.tests;
import org.testng.annotations.Test;
import techproed.utilities.Driver;
public class Day17_FirstDriverTest {
    @Test
    public void firstDriverTest(){
//        driver  ->  Driver.getDriver()
        Driver.getDriver().get("https://www.techproeducation.com");

//        close the driver
        Driver.closeDriver();
    }
}