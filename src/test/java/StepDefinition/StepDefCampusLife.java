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
    cam= new HomePageCampusLife();
    cam.getSearchCamp().click();

    }
    @Then("^The \"([^\"]*)\" menu and pop up menu displayed$")
    public void the_menu_and_pop_up_menu_displayed(String arg1) throws Throwable {
        String title= driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("NAU Student Services - North American University",title);


    }



}
