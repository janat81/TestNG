package techproed.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;
public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(partialLinkText = "Login")
    public WebElement homePageLoginLink;
    @FindBy(id = "dropdown-basic-button")
    public WebElement userID;
    @FindBy(xpath = "//select[@name='car']")
    public WebElement selectACar;
    @FindBy(name = "pickUpLocation")
    public WebElement pickUpLocation;
    @FindBy(name = "dropOfLocation")
    public WebElement dropOfLocation;
    @FindBy(name = "pickUpDate")
    public WebElement pickUpDate;
    @FindBy(name = "pickUpTime")
    public WebElement pickUpTime;
    @FindBy(name = "dropOffDate")
    public WebElement dropOffDate;
    @FindBy(name = "dropOffTime")
    public WebElement dropOffTime;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement continueReservationButton;

    @FindBy(linkText = "Logout")
    public WebElement logoutLink;

    @FindBy(xpath = "//button[text()='OK']")
    public WebElement OK;
}
