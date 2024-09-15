package Com.Ecommerce.TestCases;

import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;
import Com.Ecommerce.PageClass.TC_Ecommerce_AddToCart;
import Com.Ecommerce.PageClass.TC_Ecommerce_Login_Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_AddToCart extends Ecommerce_BaseClass {
    @Test
    public void AddProduct() throws InterruptedException, IOException {
        logger.info("Open URL");
        TC_Ecommerce_Login_Page TEL = new TC_Ecommerce_Login_Page();
        Thread.sleep(3000);
        TEL.SetUsername(username);
        System.out.println("Hello");
        logger.info("Enter user mailL");
        Thread.sleep(3000);
        TEL.SetPassword(password);
        logger.info("Enter User password");
        Thread.sleep(3000);
        TEL.ClickButton();
        logger.info("Clicked on longin button");
        Thread.sleep(3000);

        TC_Ecommerce_AddToCart TEA = new TC_Ecommerce_AddToCart();

        Actions Act = new Actions(driver);

        WebElement Computer = driver.findElement(By.xpath("//a[contains(text(),'Computers ')]"));

        Act.moveToElement(Computer).perform();
        logger.info("Mouseover on computer");

        TEA.NoteBook();
        logger.info("Clicked on NotebookText");

        TEA.SelectProduct();
        logger.info("Product selected");

        TEA.AdsToCart();
        logger.info("Add to cart");

        TEA.ProductAdded();
        logger.info("Verified message");

        TEA.Close();
        logger.info("Clciked on close Tab");

    }

}
