package Com.Ecommerce.BaseClass;

import Com.Ecommerce.Configuration.Readconfiguration;
import Com.Ecommerce.Utilitities.TestUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class Ecommerce_BaseClass {

    Readconfiguration readconfig = new Readconfiguration();

    public String BaseURL = readconfig.getApplicationURL();
    public String username = readconfig.getUsername();
    public String password = readconfig.getPassword();
    public static WebDriver driver;
    public static Logger logger;

    @Parameters("Browser")
    @BeforeMethod
    public void initialization(String Browsernames) {

        logger = logger.getLogger("30JulyEcommerce");
        PropertyConfigurator.configure("Log4j.properties");

        if (Browsernames.equals("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (Browsernames.equals("FireFox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (Browsernames.equals("Edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtils.IMPLICIT_WAIT));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtils.PAGE_LOAD_TIMEOUT));
        driver.get(BaseURL);
    }

    public String getScreenshotAs(String TestCasename) throws IOException {

        TakesScreenshot ts = (TakesScreenshot) driver;

        File source = ts.getScreenshotAs(OutputType.FILE);

        String Timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String Name = "- Screenshot -" + Timestamp;

        String destination = System.getProperty("user.dir") + "/Screenshot/" + TestCasename + "" + Name + ".png";

        FileUtils.copyFile(source, new File(destination));

        return destination;

    }

    @AfterMethod
    public void TearDown() {
        driver.quit();
    }
}
