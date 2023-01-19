package techproed.tests;

import org.checkerframework.checker.signature.qual.DotSeparatedIdentifiersOrPrimitiveType;
import org.testng.annotations.Test;
import techproed.pages.SaucedemoHomePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class SaucedemoPrice {
   /* Given
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
    public void totalPrice(){
        Driver.getDriver().get(ConfigReader.getProperty("saucedemo_url"));

        SaucedemoHomePage saucedemoHomePage = new SaucedemoHomePage();
        saucedemoHomePage.username.Input
    }

}
