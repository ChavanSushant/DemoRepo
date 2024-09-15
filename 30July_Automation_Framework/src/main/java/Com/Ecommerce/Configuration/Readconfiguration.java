package Com.Ecommerce.Configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readconfiguration {
    Properties pro;

    public Readconfiguration() {
        File src = new File(
                "D:/DemoRepo/30July_Automation_Framework/src/main/java/Com/Ecommerce/Configuration/Config.properties");
        FileInputStream fis;
        try {
            fis = new FileInputStream(src);
            pro = new Properties();
            try {
                pro.load(fis);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {

            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public String getApplicationURL() {
        String url = pro.getProperty("baseURL");
        return url;
    }

    public String getUsername() {
        String username = pro.getProperty("username");
        return username;
    }

    public String getPassword() {
        String password = pro.getProperty("password");
        return password;
    }
}
