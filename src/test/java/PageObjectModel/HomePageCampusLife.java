package PageObjectModel;

import Common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.sql.Driver;


public class HomePageCampusLife extends Base {
  public   By search = By.xpath("//*[@id='sidebar']/ul/li[11]");
    public WebElement getSearchCamp(){
        return driver.findElement(search);
    }
    public   By searchStudentServices = By.className("page_item page-item-1323");
    public WebElement  getStudentServices() {
         return driver.findElement(searchStudentServices);

    }

}
