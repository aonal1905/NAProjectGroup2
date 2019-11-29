package PageObjectModel;

import Common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePageStudents extends Base {
    public By search= By.xpath("//*[@id='menu-item-898']/a/span[1]");
    public WebElement getSearch(){
        return driver.findElement(search);
    }
    public By bursar= By.xpath("//a[text()='Bursar’s Office']");
    public WebElement getBursar(){

        return driver.findElement(bursar);
    }
    public By GrievanceProcedure= By.xpath("//a[text()='Grievance Procedure']");
    public WebElement getGrievance(){

        return driver.findElement(GrievanceProcedure);
    }
    public By NAULibrary= By.xpath("//a[text()='NAU Library']");
    public WebElement getStudentServices(){

        return driver.findElement(NAULibrary);
    }
    public By NAUMoodle= By.xpath("//a[text()='NAUmoodle Login']");
    public WebElement getNAUMoodle(){

        return driver.findElement(NAUMoodle);
    }
    public By RegistrarOffice= By.xpath("//a[text()='Registrar’s Office']");

    public WebElement getRegistrarOffice(){

        return driver.findElement(RegistrarOffice);
    }
    public By StudentRequest=By.xpath("//*[@id=\"post-4207\"]/div/div[2]/div/div[2]/div/div[1]/div/div[1]/a/span");
    public WebElement getStudentRequest(){

        return driver.findElement(StudentRequest);
    }
    public By InternationalStudentOffice= By.xpath("//*[@id=\"post-890\"]/div/div[2]/div/div[1]/div/div[6]/div[3]/div/ul/li[2]/div/a");

    public WebElement getInternationalStudentOffice(){

        return driver.findElement(InternationalStudentOffice);
    }
    public By StudentVisas=By.xpath("//*[@id=\"sidebar\"]/ul/li[4]/ul/li[1]/a");
    public WebElement getStudentVisas(){

        return driver.findElement(StudentVisas);
    }
    public By GulfLanguageSchool= By.xpath("//*[@id=\"text-15\"]/div/a[6]");

    public WebElement getGulfLanguageSchool(){

        return driver.findElement(GulfLanguageSchool);
    }
    public By Housing= By.xpath("//*[@id=\"post-890\"]/div/div[2]/div/div[1]/div/div[6]/div[3]/div/ul/li[3]/div/a");

    public WebElement getHousing(){

        return driver.findElement(Housing);
    }
    public By HandBook= By.xpath("//*[text()='Handbook']");
    public WebElement getHandBook(){

        return driver.findElement(HandBook);
    }
    public By Students= By.xpath("//*[@id='menu-item-898']/a/span");
    public WebElement getStudents(){

        return driver.findElement(Students);
    }
    public void hoverOver(){
        Actions sSuccess= new Actions(driver);
        sSuccess.moveToElement(driver.findElement(Students)).build().perform();
    }
    public By studentSuccess= By.xpath("//*[@id='menu-item-5780']/a/span");
    public WebElement getStudentSuccess() {

        return driver.findElement(studentSuccess);
    }
    public By peerMentor= By.xpath("//*[text()='Peer Mentor']");
    public WebElement getpeerMentor(){

        return driver.findElement(peerMentor);
    }



}
