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

}

