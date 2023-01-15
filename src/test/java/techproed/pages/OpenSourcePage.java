package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class OpenSourcePage {

    public OpenSourcePage(){
//        Used to initiate the page objects
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //   public WebElement username = driver.findElement(By.xpath("//input[@name='username")); TRADITIONAL
    @FindBy(xpath = "//input[@name='username']")
    public WebElement userName;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;


}
