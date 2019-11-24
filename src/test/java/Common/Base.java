package Common;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Base {
    public static WebDriver driver;
    public static Properties prop;

    public static WebDriver getDriver() throws IOException {
        prop = new Properties();
        FileInputStream fis = new FileInputStream("/Users/mehmetakin/IdeaProjects/NAProjectGroup2/src/test/java/Common/Global.Properties");
        prop.load(fis);

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get(prop.getProperty("urladmission"));
        driver.manage().window().maximize();
        return driver;


    }

}
