package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

import java.util.List;

public class SaucedemoProductsPage {

    public SaucedemoProductsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='inventory_item_price']")
    public List<WebElement> prices;


}
