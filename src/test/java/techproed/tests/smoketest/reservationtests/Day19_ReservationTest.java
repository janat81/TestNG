package techproed.tests.smoketest.reservationtests;
import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import techproed.pages.HomePage;
import techproed.pages.LoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
public class Day19_ReservationTest {
    HomePage homePage;
    LoginPage loginPage;
    Faker faker;
    @Test
    public void reservationTest(){
//        Given user is on the home page
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
//        LOGIN THE APP
        homePage=new HomePage();
        loginPage= new LoginPage();
        ReusableMethods.waitFor(3);
        homePage.homePageLoginLink.click();
//        sending credentials and clicking on login button
        ReusableMethods.waitFor(3);
        loginPage.userName.sendKeys("jack@gmail.com");
        ReusableMethods.waitFor(3);
        loginPage.password.sendKeys("12345");
        ReusableMethods.waitFor(3);
        loginPage.loginButton.click();
        ReusableMethods.waitFor(3);
//        Verify login is successful
        ReusableMethods.verifyElementDisplayed(homePage.userID);
//        NOW THAT U LOGGED IN THE APPLICATION, WE CAN ENTER THE REQUIRED FIELDS
//        And select a car

        Select carSelect = new Select(homePage.selectACar);
        carSelect.selectByIndex(3);
//        And enter pick up field
        faker=new Faker();
        homePage.pickUpLocation.sendKeys(Faker.instance(Locale.US).address().cityName());
//        And enter drop off field
        homePage.dropOfLocation.sendKeys(Faker.instance(Locale.US).address().cityName());
//        Pick Up date
//        Pick up time
//        drop off date
//        drop of time
        SimpleDateFormat simpleDateFormat1=new SimpleDateFormat("hhmmaa");
        Calendar calendar=Calendar.getInstance();
//        enter pick up date
        homePage.pickUpDate.sendKeys("10/10/2023");
//        enter pick up hour
        homePage.pickUpTime.sendKeys(simpleDateFormat1.format(calendar.getTime()));
//       enter drop of date
        homePage.dropOffDate.sendKeys("12/11/2023");
//        enter drop of hour
        homePage.dropOffTime.sendKeys(simpleDateFormat1.format(calendar.getTime()));
//        =====================================================
//        And click continue reservation
        homePage.continueReservationButton.click();
//        And verify complete reservation screen pops up
//        And enter card number
//        And enter name on the card
//        And enter expire date and CVC
//        And checks the agreement
//        And click complete reservation
//        Then verify ‘Reservation created successfully’ pop up
//        And naviaged to Reservations screen
//        And verify the last reservation is created
//        When you click on the last reservation
//        Then verify reservation detail page is displayed
//        And verify the table has the following fields: Model, Doors, Seats, Luggage, Transmission, Air Conditioning, Fuel Type, Age
//        And click on back to reservations
//        And verify Reservations page is displayed
//        And click on Home link
//        Then verify the home page is displayed
    }
}
