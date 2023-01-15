package techproed.tests.smoketest.logintests;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import techproed.pages.HomePage;
import techproed.pages.LoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;
public class Day19_NegativeLoginTest {
    HomePage homePage;
    LoginPage loginPage;
    @Test
    public void US100208_Negative_Login(){
//        As customer, I should not be able to log in the application
        //going blue rental car home page
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
//        click on home page login link
        homePage = new HomePage();
        loginPage= new LoginPage();
        ReusableMethods.waitFor(3);
        homePage.homePageLoginLink.click();
//        sending credentials and clicking on login button
        ReusableMethods.waitFor(3);
//        Customer email: fake@bluerentalcars.com
//        Customer password: fakepass
        loginPage.userName.sendKeys("fake@bluerentalcars.com");
        ReusableMethods.waitFor(3);
        loginPage.password.sendKeys("fakepass");
        ReusableMethods.waitFor(3);
        loginPage.loginButton.click();
        ReusableMethods.waitFor(3);
//        Error: User with email fake@bluerentalcars.com not found
        String errorMessage = loginPage.errorMessage_incorrectEmailPass.getText();
        Assert.assertEquals(errorMessage,"User with email fake@bluerentalcars.com not found");
    }
}
