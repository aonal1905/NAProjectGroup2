package PageObjectModel;

import Common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.sql.Driver;


public class HomePageCampusLife extends Base {
    public By search = By.xpath("//*[@id='sidebar']/ul/li[11]");

    public WebElement getSearchCamp() {

        return driver.findElement(search);
    }

    public By searchStudentServices = By.className("page_item page-item-1323");

    public WebElement getStudentServices() {
        return driver.findElement(searchStudentServices);

    }

    public void hoveroverCampusLife() {
        Actions ac = new Actions(driver);
        ac.moveToElement(driver.findElement(By.xpath("//*[@id='menu-item-897']/a"))).build().perform();
    }

    public By clickStudentOrg = By.xpath("//*[@id='menu-item-5754']/a/span");

    public WebElement getStudentOrg() {
        return driver.findElement(clickStudentOrg);
    }

    public By clickHousing = By.xpath("//*[@id='menu-item-5758']/a/span");

    public WebElement getHousing() {
        return driver.findElement(clickHousing);

    }

    public By clickHandbook = By.xpath("//*[@id=\"post-1305\"]/div/div[2]/div/div[1]/div/div[1]/a");

    public WebElement getHandBook() {
        return driver.findElement(clickHandbook);

    }

    public By clickparking = By.xpath("//*[@id='menu-item-5763']/a");

    public WebElement getParking() {
        return driver.findElement(clickparking);
    }

    public By clickSecurity = By.xpath("//li[@id='menu-item-5764']/a");

    public WebElement getSecurity() {
        return driver.findElement(clickSecurity);

    }

    public By clickCrime = By.xpath("//li[@id='menu-item-5767']/a");

    public WebElement getCrime() {
        return driver.findElement(clickCrime);
    }
}