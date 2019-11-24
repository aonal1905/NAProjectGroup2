package StepDefinition;

import Common.Base;
import PageObjectModel.HomePageAdmissions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.Assert;
import org.junit.runner.RunWith;


public class StepDefAdmissions extends Base {
    HomePageAdmissions homePageAdmissions;

    @Given("^User is on the HomePage NAU$")
    public void user_is_on_the_homepage_nau() throws Throwable {
    Base.getDriver();
    }

    @When("^I hover over mouse to Admissions Menu$")
    public void i_hover_over_mouse_to_admissions_menu() throws Throwable {
    homePageAdmissions=new HomePageAdmissions();
    homePageAdmissions.hoverOver();
    }

    @Then("^I should be in the NAU admissions page$")
    public void i_should_be_in_the_nau_admissions_page() throws Throwable {

    }

    @And("^I click Apply Now button under Graduate section$")
    public void i_click_apply_now_button_under_graduate_section() throws Throwable {
        homePageAdmissions=new HomePageAdmissions();
        homePageAdmissions.getApplyNowClick().click();
    }

    @And("^I should see Apply and SignIn Button$")
    public void i_should_see_apply_and_signin_button() throws Throwable {
    String title=driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Apply North American University",title);
    }

}




