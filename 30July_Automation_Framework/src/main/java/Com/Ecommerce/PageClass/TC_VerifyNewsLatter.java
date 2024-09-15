package Com.Ecommerce.PageClass;

import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TC_VerifyNewsLatter extends Ecommerce_BaseClass {


    public TC_VerifyNewsLatter() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//Strong[contains(text(),'Newsletter')]")
    public List<WebElement> News;

    @FindBy(id = "newsletter-email")
    public WebElement Searchbox;

    @FindBy(id = "newsletter-subscribe-button")
    public WebElement subscribe;

    @FindBy(xpath = "//div[@class=\"newsletter-result\"]")
    public WebElement VerifyMessage;

}
