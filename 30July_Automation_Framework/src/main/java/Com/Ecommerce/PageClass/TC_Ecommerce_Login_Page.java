package Com.Ecommerce.PageClass;

import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_Ecommerce_Login_Page extends Ecommerce_BaseClass {
    //1.
    public TC_Ecommerce_Login_Page() {
        PageFactory.initElements(driver, this);
    }

    //2.
    @FindBy(id = "Email")
    public WebElement Username;

    @FindBy(id = "Password")
    public WebElement Password;

    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    public WebElement LoginBtn;

    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    public WebElement Logout;

    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    public WebElement Log;

    //3
    public void SetUsername(String Uname) {
        Username.sendKeys(Uname);
    }

    public void SetPassword(String Pass) {
        Password.sendKeys(Pass);
    }

    public void ClickButton() {
        LoginBtn.click();
    }

    public void Logout() {
        Logout.click();
    }
}
