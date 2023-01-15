package techproed.tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import techproed.pages.XYZBankPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class XYZBankTest {
    //Open 5 Accounts, deposit 100 USD and withdraw 100 USD from any account and delete all accounts.
   /*
Given
    Go to url https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login
When
    Click on "Bank Manager Login" button
And
    Click on "Add Customer" button
And
    Fill inputs and click on "Add Customer" submit button
And
    Accept alert
And
    Add 4 more customers
And
    Click on "Open Account"  button
And
    Click on "Customer" dropdown
And
    Select customer name
And
    Click on "Currency" dropdown
And
    Select "Dollar"
And
    Click on "Process" button
And
    Accept alert
And
    Open 4 more accounts
And
    Click on "Customers" button
And
    Count table row numbers
Then
    Assert that you created 5 customers
When
    Click on "Home" button
And
    Click on "Customer Login" button
And
    Click on "Your Name" dropdown
And
    Select the any name you created
And
    Click on "Login" button
And
    Click on "Deposit" button
And
    Type 100 into "Amount to be Deposited" input
Then
    Assert that "Deposit Successful" is displayed
And
    Click on "Deposit"(Submit) button
And
    Click on "Withdrawal" button
And
    Type 100 into "Amount to be Withdrawn" input
And
    Click on "Withdraw"(Submit) button
Then
    Assert that "Transaction  Successful" is displayed
When
    Click on "Logout" button
And
    Click on "Home" button
And
    Click on "Bank Manager Login" button
And
    Click on "Customers" button
And
    Click on each "Delete" button
And
    Count table row numbers
Then
    Assert that number of customers is 0

 */
    @Test
    public void xyzBankTest() {
        XYZBankPage xyzBankPage = new XYZBankPage();
//        Go to url https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login
        Driver.getDriver().get(ConfigReader.getProperty("xyzBank_URL"));

//        Click on "Bank Manager Login" button
        xyzBankPage.bankManagerLoginButton.click();

//        Click on "Add Customer" button
        xyzBankPage.addCustomerButton.click();

//        Fill inputs and click on "Add Customer" submit button
        Faker faker = new Faker();

        for (int i = 0; i < 5; i++) {

            xyzBankPage.firstnameInput.sendKeys(faker.name().firstName());
            xyzBankPage.lastnameInput.sendKeys(faker.name().lastName());
            xyzBankPage.postCodeInput.sendKeys(faker.address().zipCode());
            xyzBankPage.addCustomerSubmitButton.click();
//        Accept alert
            try {
                Driver.getDriver().switchTo().alert().accept();
            } catch (Exception ignored) {
            }

//        Add 4 more customers

        }

//        Click on "Open Account"  button
        xyzBankPage.openAccountButton.click();

//        Click on "Customer" dropdown
//        Select customer name
        Select customerDD = new Select(xyzBankPage.customerDropdown);
        Select currencyDD = new Select(xyzBankPage.currencyDropdown);

        for (int i=6; i<11; i++){
//        Click on "Currency" dropdown
            customerDD.selectByIndex(i);
//        Select "Dollar"
            currencyDD.selectByIndex(1);
//        Click on "Process" button
            xyzBankPage.processButton.click();
//        Accept alert
            try {
                Driver.getDriver().switchTo().alert().accept();
            }catch (Exception ignored){
            }
//        Open 4 more accounts
        }

//        Click on "Customers" button
        xyzBankPage.customersButton.click();

//        Count table row numbers
        int numberOfCustomerRows = xyzBankPage.numberOfCustomerRows.size();

//        Assert that you created 5 customers
        assertEquals(10,numberOfCustomerRows);

//        Click on "Home" button
        xyzBankPage.homeButton.click();

//        Click on "Customer Login" button
        xyzBankPage.customerLoginButton.click();

//        Select any name you created
        Select yourNameDD = new Select(xyzBankPage.yourNameDropdown);
        yourNameDD.selectByIndex(9);

//        Click on "Login" button
        xyzBankPage.loginButton.click();

//        Click on "Deposit" button
        xyzBankPage.depositButton.click();

//        Type 100 into "Amount to be Deposited" input
        xyzBankPage.depositAmountInput.sendKeys("100");

//        Click on "Deposit"(Submit) button
        xyzBankPage.depositSubmitButton.click();

//        Assert that "Deposit Successful" is displayed
        assertTrue(xyzBankPage.depositSuccessfulMessage.isDisplayed());

//        Click on "Withdrawal" button
        xyzBankPage.withdrawalButton.click();

//        Type 100 into "Amount to be Withdrawn" input
        xyzBankPage.withdrawalAmountInput.sendKeys("100");

//        Click on "Withdraw"(Submit) button
        Actions actions = new Actions(Driver.getDriver());
        actions.click(xyzBankPage.withdrawSubmitButton);
//        xyzBankPage.withdrawSubmitButton.click();

//        Assert that "Transaction  Successful" is displayed
        assertTrue(xyzBankPage.transactionSuccessfulMessage.isDisplayed());

//        Click on "Logout" button
        xyzBankPage.logOutButton.click();

//        Click on "Home" button
        xyzBankPage.homeButton.click();

//        Click on "Bank Manager Login" button
        xyzBankPage.bankManagerLoginButton.click();

//        Click on "Customers" button
        xyzBankPage.customersButton.click();

//        Click on each "Delete" button
        for(WebElement w : xyzBankPage.deleteButtonList){
            w.click();
        }

//        Count table row numbers
//        Assert that number of customers is 0
        assertEquals(0, xyzBankPage.deleteButtonList.size());

    }
}