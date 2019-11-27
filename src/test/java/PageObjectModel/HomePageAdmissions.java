package PageObjectModel;

import Common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePageAdmissions extends Base {


    public By admissionsDropdown = By.xpath("//span[text()='Admissions']");

    public WebElement getAdmission() {
        return driver.findElement(admissionsDropdown);

    }

    public void hoverOver() {
        Actions ac = new Actions(driver);
        ac.moveToElement(driver.findElement(admissionsDropdown)).build().perform();

    }

    public By applyNowClick = By.xpath("//li[@id='menu-item-2264']//span");

    public WebElement getApplyNowClick() {
        return driver.findElement(applyNowClick);
    }

    public By UndergraduatedButtonUnderAdmissionsDropdown = By.xpath("//*[@id='menu-item-1754']/a/span");

    public WebElement getUndergraduatedButtonUnderAdmissionsDropdown() {
        return driver.findElement(UndergraduatedButtonUnderAdmissionsDropdown);
    }

    public By admissionGraduateUnderGreduateDegree = By.xpath("//*[@id='menu-item-2267']/a/span");

    public WebElement getadmissionGraduateUnderGreduateDegree() {
        return driver.findElement(admissionGraduateUnderGreduateDegree);
    }

    public By admissionGulfLanguageSchoolGlsAdmissions = By.xpath("//*[@id='menu-item-2483']/a/span");

    public WebElement getAdmissionGulfLanguageSchoolGlsAdmissions() {
        return driver.findElement(admissionGulfLanguageSchoolGlsAdmissions);
    }

    public By admissionGraduateInternational=By.xpath("//*[@id='menu-item-2481']/a/span");
public WebElement getAdmissionGraduateInternational(){
    return driver.findElement(admissionGraduateInternational);
}
    public By admissionGrauteTutionAndFees = By.xpath("//*[@id='menu-item-2341']/a/span");
    public WebElement getAdmissionGrauteTutionAndFees() {
        return driver.findElement(admissionGrauteTutionAndFees);
    }
}