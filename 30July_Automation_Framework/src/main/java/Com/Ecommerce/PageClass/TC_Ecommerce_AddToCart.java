package Com.Ecommerce.PageClass;

import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_Ecommerce_AddToCart extends Ecommerce_BaseClass {

    //1.
    public TC_Ecommerce_AddToCart() {

        PageFactory.initElements(driver, this);
    }

    //2.
    @FindBy(xpath = "//a[contains(text(),'Computers ')]")
    public WebElement Com;

    @FindBy(xpath = "//a[contains(text(),'Notebooks ')]")
    public WebElement Notebook;

    @FindBy(xpath = "(//a[@title=\"Show details for Apple MacBook Pro 13-inch\"])[2]")
    public WebElement SelectMackbook;

    @FindBy(id = "add-to-cart-button-4")
    private WebElement Addtocart;

    @FindBy(xpath = "//p[contains(text(),'The product has been added to your ')]")
    public WebElement Message;

    @FindBy(xpath = "//span[@title=\"Close\"]")
    public WebElement CloseTab;

    //3.
    public void NoteBook() {
        Notebook.click();
    }

    public void SelectProduct() {
        SelectMackbook.click();
    }

    public void AdsToCart() {
        Addtocart.click();
    }

    public void ProductAdded() {
        Message.isDisplayed();
    }

    public void Close() {
        CloseTab.click();
    }
}

