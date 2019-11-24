package StepDefinition;

import Common.Base;
import PageObjectModel.HomePageCampusLife;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import org.junit.Assert;

public class StepDefCampusLife  extends Base {
    HomePageCampusLife cam;

    @Given("^user will navigate to the website$")
    public void user_will_navigate_to_the_website() throws Throwable {
        Base.getDriver();
    }

    @When("^user searches for student service section$")
    public void user_searches_for_student_service_section() throws Throwable {
        cam = new HomePageCampusLife();
        cam.getSearchCamp().click();

    }

    @Then("^The \"([^\"]*)\" menu and pop up menu displayed$")
    public void the_menu_and_pop_up_menu_displayed(String arg1) throws Throwable {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("NAU Student Services - North American University", title);
        driver.close();




    }

    @When("^I click on Student organization button$")
    public void i_click_on_Student_organization_button() throws Throwable {
        cam = new HomePageCampusLife();
        cam.getStudentOrg().click();


    }

    @Then("^I should able to see the title$")
    public void i_should_able_to_see_the_title() throws Throwable {
        String title = driver.getTitle();
        Assert.assertEquals("NAU Student Organizations - North American University", title);
        driver.close();

    }

    @When("^user hover over mouse to Campus life$")
    public void user_hover_over_mouse_to_campus_life() throws Throwable {
        cam = new HomePageCampusLife();
        cam.hoveroverCampusLife();
    }

    @And("^I click on housing button$")
    public void i_click_on_housing_button() throws Throwable {
        cam = new HomePageCampusLife();
        cam.getHousing().click();
    }

    @Then("^I should able to see the handbook$")
    public void i_should_able_to_see_the_handbook() throws Throwable {
        cam = new HomePageCampusLife();
        cam.getHandBook().click();
        driver.close();
    }
}