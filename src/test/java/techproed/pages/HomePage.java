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
}
