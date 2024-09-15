package Com.Ecommerce.PageClass;

import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_Ecommerce_Registration extends Ecommerce_BaseClass {

    public TC_Ecommerce_Registration() {

        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement Registeration;

    @FindBy(id = "FirstName")
    WebElement Firstname;

    @FindBy(id = "LastName")
    WebElement Lastname;

    @FindBy(id = "Email")
    WebElement Email;

    @FindBy(id = "Password")
    WebElement Password;

    @FindBy(id = "ConfirmPassword")
    WebElement ConfirmPass;

    @FindBy(id = "register-button")
    WebElement RegButton;

    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement RegSuccessfully;

    //3
    public void RegistrationForm() {
        Registeration.click();
    }

    public void SetFirstName(String name) {
        Firstname.sendKeys(name);
    }

    public void SetLastName(String name) {
        Lastname.sendKeys(name);
    }

    public void SetEmail(String emailid) {
        Email.sendKeys(emailid);
    }

    public void SetPassoword(String Pass) {
        Password.sendKeys(Pass);
    }

    public void SetConfirmedPassoword(String Pass) {
        ConfirmPass.sendKeys(Pass);
    }

    public void Submit() {
        RegButton.click();
    }

    public void RegSuccess() {

    }
}
