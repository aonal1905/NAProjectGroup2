package StepDefinition;

import Common.Base;
import PageObjectModel.HomePageStudents;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class StepDefStudents extends Base{
    HomePageStudents stu;
    @Given("^User will navigate to the website$")
    public void user_will_navigate_to_the_website() throws Throwable {
        Base.getDriver();

    }

    @When("^User searches for Registrar section$")
    public void user_searches_for_Registrar_section() throws Throwable {
        stu= new HomePageStudents();
        stu.getSearch().click();
    }

    @Then("^The \"([^\"]*)\" menu will be open$")
    public void the_menu_will_be_open(String arg1) throws Throwable {
        System.out.println(1);
    }

    @When("^User searches for Bursar’s Office$")
    public void user_searches_for_bursars_office() throws Throwable {
        stu= new HomePageStudents();
        stu.getBursar().click();
    }

    @Then("^Bursar’s Office section will be displayed$")
    public void bursars_office_section_will_be_displayed() throws Throwable {
        String title= driver.getTitle();
        System.out.println("Bursar's title: "+title);
        Assert.assertEquals("Bursar's Office - North American University",title);
    }

    @And("^The \"([^\"]*)\" will be displayed$")
    public void the_something_will_be_displayed(String strArg1) throws Throwable {
        System.out.println(2);
    }
    @When("^User searches for Grievance Procedure section$")
    public void user_searches_for_grievance_procedure_section() throws Throwable {
        stu= new HomePageStudents();
        stu.getGrievance().click();
    }

    @Then("^The Grievance Procedure page will be open$")
    public void the_grievance_procedure_page_will_be_open() throws Throwable {
        String title= driver.getTitle();
        System.out.println("Grievance Procedure : "+title);
        Assert.assertEquals("Grievance Procedure - North American University",title);
        System.out.println(3);
    }
    @When("^User searches for NAU Library$")
    public void user_searches_for_NAU_Library() throws Throwable {
        stu=new HomePageStudents();
        stu.getStudentServices().click();
    }

    @Then("^The NAU Library part will be appear$")
    public void the_NAU_Library_part_will_be_appear() throws Throwable {
        String title= driver.getTitle();
        System.out.println(4);
    }
    @When("^User searches for NAU Moodle$")
    public void user_searches_for_NAU_Moodle() throws Throwable {
        stu=new HomePageStudents();

    }

    @Then("^The NAU Moodle part will be appear$")
    public void the_NAU_Moodle_part_will_be_appear() throws Throwable {
        String title= driver.getTitle();
        System.out.println("myNAU Login");
    }
    @When("^User searches for Registrar's Office$")
    public void user_searches_for_Registrar_s_Office() throws Throwable {
        stu= new HomePageStudents();
        stu.getRegistrarOffice().click();
    }

    @Then("^The Registrar's Office part will be appear$")
    public void the_Registrar_s_Office_part_will_be_appear() throws Throwable {
        String title= driver.getTitle();
        System.out.println("Registrar's Office title: "+title);
        //Assert.assertEquals("",title);

        System.out.println(1);
    }

    @And("^And I click  button \"([^\"]*)\"$")
    public void and_I_click_button(String arg1) throws Throwable {
        stu= new HomePageStudents();
        stu.getStudentRequest().click();

    }
    @When("^User searches for International Student Office$")
    public void user_searches_for_International_Student_Office() throws Throwable {        stu= new HomePageStudents();
        stu= new HomePageStudents();
        stu.getInternationalStudentOffice().click();
    }

    @Then("^The International Student Office part will be appear$")
    public void the_International_Student_Office_part_will_be_appear() throws Throwable {        String title= driver.getTitle();
        System.out.println("International Student Office title: "+title);
        //Assert.assertEquals("",title);

        System.out.println(1);
    }

    @And("^I click  button \"([^\"]*)\"$")
    public void i_click_button_something(String strArg1) throws Throwable {
        stu= new HomePageStudents();
        stu.getStudentVisas();
    }
    @When("^User searches for Gulf Language School$")
    public void user_searches_for_Gulf_Language_School() throws Throwable {
        stu= new HomePageStudents();
        stu.getGulfLanguageSchool().click();
    }

    @Then("^The Gulf Language School part will be appear$")
    public void the_Gulf_Language_School_part_will_be_appear() throws Throwable {
        String title= driver.getTitle();
        System.out.println("The Gulf Language School: "+title);
        //Assert.assertEquals("",title);

        System.out.println(1);
    }
    @When("^User searches for Housing button$")
    public void user_searches_for_Housing_button() throws Throwable {
        stu= new HomePageStudents();
        stu.getHousing().click();

    }

    @Then("^The Housing page will be appear$")
    public void the_Housing_page_will_be_appear() throws Throwable {        String title= driver.getTitle();
        System.out.println("Housing: "+title);
        //Assert.assertEquals("",title);

        System.out.println(1);
    }
    @And("^I click \"([^\"]*)\" button$")
    public void i_click_something_button(String strArg1) throws Throwable {
        stu= new HomePageStudents();
        stu.getHandBook().click();
    }
    public Object HPobject;
    @Given("^User is on the HomePage NAU$")
    public void user_is_on_the_HomePage_NAU() throws Throwable {
        Base.getDriver();
    }
    @When("^I hover over mouse to Students$")
    public void i_hover_over_mouse_to_Students() throws Throwable {
        stu= new HomePageStudents();
        stu.hoverOver();
    }

    @Then("^I click Student Success button under Students section$")
    public void i_click_Student_Success_button_under_Students_section() throws Throwable {
        stu = new HomePageStudents();
        stu.getStudentSuccess().click();

    }
    @And("^I should see and be able to click on \"([^\"]*)\" Button$")
    public void i_should_see_and_be_able_to_click_on_something_button(String strArg1) throws Throwable {
        stu= new HomePageStudents();
        stu.getpeerMentor().click();
    }



}


