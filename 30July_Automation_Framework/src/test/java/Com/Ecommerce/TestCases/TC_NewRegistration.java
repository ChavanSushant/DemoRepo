package Com.Ecommerce.TestCases;

import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;
import Com.Ecommerce.PageClass.TC_Ecommerce_Registration;
import org.openqa.selenium.By;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_NewRegistration extends Ecommerce_BaseClass {

    @Test
    public void Registration() throws IOException {

        TC_Ecommerce_Registration TER = new TC_Ecommerce_Registration();
        TER.RegistrationForm();
        TER.SetFirstName("Sushant");
        TER.SetLastName("Chavan");
        TER.SetEmail("e@gmail.com");
        TER.SetPassoword("Dell1234");
        TER.SetConfirmedPassoword("Dell1234");
        TER.Submit();

        boolean test = driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]")).isDisplayed();

        if (test == true) {
            logger.info("User created");
            AssertJUnit.assertTrue(true);
        } else {
            logger.info("User creation failed");
            getScreenshotAs("Registration");
            AssertJUnit.assertTrue(false);


        }
    }


}
