package Common;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Base {
    public static WebDriver driver;
    public static Properties prop;

    public static WebDriver getDriver() throws IOException {
        prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\Ahmet\\IdeaProjects\\Projectgroup2\\src\\test\\java\\Common\\Global.Properties");
        prop.load(fis);
       // System.setProperty("webdriver.chrome.driver","C:\\Users\\Ahmet\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");

        WebDriverManager.chromedriver().setup();
        driver.get(prop.getProperty("urlcampuslife"));
        return driver;


    }

}
