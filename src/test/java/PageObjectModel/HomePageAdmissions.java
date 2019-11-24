package PageObjectModel;

import Common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePageAdmissions extends Base {


    public By admission= By.xpath("//span[text()='Admissions']");
    public WebElement getAdmission(){
        return driver.findElement(admission);

    }
    public void hoverOver (){
        Actions ac = new Actions(driver);
        ac.moveToElement(driver.findElement(admission)).build().perform();

    }
    public By applyNowClick=By.xpath("//li[@id='menu-item-2264']//span");
  public WebElement getApplyNowClick(){
      return driver.findElement(applyNowClick);
  }
}
/*
private By admissionsDropdown = By.xpath("//span[text()='Admissions']");
    private By applyNowButtonUnderGraduate = By.xpath("//li[@id='menu-item-2264']//span");
    private By UndergraduatedButtonUnderAdmissionsDropdown=By.xpath("//*[@id='menu-item-1754']/a/span");
    private By admissionGraduateUnderGreduateDegree=By.xpath("//*[@id='menu-item-2267']/a/span");
    private By admissionGulfLanguageSchoolGlsAdmissions=By.xpath("//*[@id='menu-item-2483']/a/span");

    public void getHomePage(){
        Driver.getDriver().get(Driver.getProperyKey("url"));
        // Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.getDriver().manage().window().maximize();
    }
    public void mouseHoverOverAdmissions() {
        WebDriver driver = Driver.getDriver();
        Actions ac = new Actions(driver);
        ac.moveToElement(driver.findElement(admissionsDropdown)).build().perform();
    }
    public void dropdownClickOnApplyButtonUnderGraduate(){
        Driver.getDriver().findElement(applyNowButtonUnderGraduate).click();
    }
    public void UndergraduatedButtonUnderAdmissionsDropdownClick() {
        Driver.getDriver().findElement(UndergraduatedButtonUnderAdmissionsDropdown).click();
    }
    public void admissionGraduateUnderGreduateDegreeClick(){
        Driver.getDriver().findElement(admissionGraduateUnderGreduateDegree).click();
    }

    public void admissionGulfLanguageSchoolGlsAdmissionsClick(){
        Driver.getDriver().findElement(admissionGulfLanguageSchoolGlsAdmissions).click();
    }
}
 */