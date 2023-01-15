package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

import java.util.List;

public class XYZBankPage {

    public XYZBankPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[.='Bank Manager Login']")
    public WebElement bankManagerLoginButton;

    @FindBy(xpath = "//button[@ng-class='btnClass1']")
    public WebElement addCustomerButton;

    @FindBy(xpath = "//input[@placeholder='First Name']")
    public WebElement firstnameInput;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    public WebElement lastnameInput;

    @FindBy(xpath = "//input[@placeholder='Post Code']")
    public WebElement postCodeInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement addCustomerSubmitButton;

    @FindBy(xpath = "//button[@ng-class='btnClass2']")
    public WebElement openAccountButton;

    @FindBy(id = "userSelect")
    public WebElement customerDropdown;

    @FindBy(id = "currency")
    public WebElement currencyDropdown;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement processButton;

    @FindBy(xpath = "//button[@ng-class='btnClass3']")
    public WebElement customersButton;

    @FindBy(xpath = "//tbody//td[1]")
    public List<WebElement> numberOfCustomerRows;

    @FindBy(xpath = "//button[.='Home']")
    public WebElement homeButton;

    @FindBy(xpath = "//button[.='Customer Login']")
    public WebElement customerLoginButton;

    @FindBy(id = "userSelect")
    public WebElement yourNameDropdown;

    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginButton;

    @FindBy(xpath = "//button[@ng-class='btnClass2']")
    public WebElement depositButton;

    @FindBy(xpath = "//input[@placeholder='amount']")
    public WebElement depositAmountInput;

    @FindBy(xpath = "//button[.='Deposit']")
    public WebElement depositSubmitButton;

    @FindBy(xpath = "//span[.='Deposit Successful']")
    public WebElement depositSuccessfulMessage;

    @FindBy(xpath = "//button[@ng-class='btnClass3']")
    public WebElement withdrawalButton;

    @FindBy(xpath = "//input[@placeholder='amount']")
    public WebElement withdrawalAmountInput;

    @FindBy(xpath = "//button[.='Withdraw']")
    public WebElement withdrawSubmitButton;

    @FindBy(xpath = "//span[@ng-show='message']")
    public WebElement transactionSuccessfulMessage;

    @FindBy(xpath = "//button[.='Logout']")
    public WebElement logOutButton;

    @FindBy(xpath = "//button[.='Delete']")
    public List<WebElement> deleteButtonList;
}
