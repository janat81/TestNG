package techproed.tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import techproed.pages.SaucedemoHomePage;
import techproed.pages.SaucedemoProductsPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.JSUtils;

import static org.testng.AssertJUnit.assertEquals;

public class SaucedemoPrice {
    /*
  Given
    Go to  https://www.saucedemo.com/
  When
    Enter the username  as "standard_user"
  And
    Enter the password as "secret_sauce"
  And
    Click on login button
  Then
    Assert that total price of all products is 129.94 dollars
  And
    Flash each web element you used
   */
    @Test
    public void totalPrice() {
//        Go to  https://www.saucedemo.com/
        Driver.getDriver().get(ConfigReader.getProperty("saucedemo_url"));

//        Enter the username  as "standard_user"
        SaucedemoHomePage saucedemoHomePage = new SaucedemoHomePage();
        JSUtils.flash(saucedemoHomePage.usernameInput);
        saucedemoHomePage.usernameInput.sendKeys(ConfigReader.getProperty("saucedemo_username"));

//        Enter the password as "secret_sauce"
        JSUtils.flash(saucedemoHomePage.passwordInput);
        saucedemoHomePage.passwordInput.sendKeys(ConfigReader.getProperty("saucedemo_password"));

//        Click on login button
        JSUtils.flash(saucedemoHomePage.loginButton);
        saucedemoHomePage.loginButton.click();

//        Assert that total price of all products is 129.94 dollars
        SaucedemoProductsPage saucedemoProductsPage = new SaucedemoProductsPage();
        double totalPrice = 0;
        for (WebElement w : saucedemoProductsPage.prices) {
            JSUtils.flash(w);
            totalPrice += Double.parseDouble(w.getText().replaceAll("\\$", ""));
        }

        assertEquals(129.94, totalPrice);

//        Flash each web element you used


    }

}