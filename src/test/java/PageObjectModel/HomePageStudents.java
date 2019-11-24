package PageObjectModel;

import Common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePageStudents extends Base {
    public By search= By.xpath("//*[@id='menu-item-898']/a/span[1]");
    public WebElement getSearch(){
        return driver.findElement(search);
    }
    public By bursar= By.xpath("//a[text()='Bursar’s Office']");
    public WebElement getBursar(){
        return driver.findElement(bursar);
    }


}
