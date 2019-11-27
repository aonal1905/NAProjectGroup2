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

        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Welcome to North American University | Houston TX", title);

    }

    @When("^Customer hover over mouse to Admissions Menu$")
    public void customer_hover_over_mouse_to_admissions_menu() throws Throwable {
        homePageAdmissions = new HomePageAdmissions();
        homePageAdmissions.hoverOver();
    }

    @Then("^Customer should be in the \"([^\"]*)\" page$")
    public void customer_should_be_in_the_something_page(String strArg1) throws Throwable {

    }

    @And("^Customer click Apply Now button under Graduate section$")
    public void customer_click_apply_now_button_under_graduate_section() throws Throwable {
        homePageAdmissions = new HomePageAdmissions();
        homePageAdmissions.getApplyNowClick().click();
    }

    @And("^Customer should see Apply and \"([^\"]*)\" Button$")
    public void customer_should_see_apply_and_something_button(String strArg1) throws Throwable {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Apply North American University", title);
    }


    @And("^Customer click  Undergraduate section$")
    public void customer_click_undergraduate_section() throws Throwable {
        homePageAdmissions = new HomePageAdmissions();
        homePageAdmissions.getUndergraduatedButtonUnderAdmissionsDropdown().click();
    }

    @Then("^Customer should be in the NAU Undergraduate page$")
    public void customer_should_be_in_the_nau_undergraduate_page() throws Throwable {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Undergraduate - North American University", title);
    }

    @And("^Customer click “Graduate Degrees” button under Graduate section$")
    public void customer_click_graduate_degrees_button_under_graduate_section() throws Throwable {
        homePageAdmissions = new HomePageAdmissions();
        homePageAdmissions.getadmissionGraduateUnderGreduateDegree().click();
    }

    @Then("^Customer should be in the “Graduate Degrees” page$")
    public void customer_should_be_in_the_graduate_degrees_page() throws Throwable {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Graduate Degrees - North American University", title);
    }

    @And("^Customer click “GLS Admissions” button under “Gulf Language School” section$")
    public void customer_click_gls_admissions_button_under_gulf_language_school_section() throws Throwable {
        homePageAdmissions = new HomePageAdmissions();
        homePageAdmissions.getAdmissionGulfLanguageSchoolGlsAdmissions().click();
    }

    @Then("^Customer should be in the Gulf Language School$")
    public void customer_should_be_in_the_gulf_language_school() throws Throwable {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Welcome to North American University | Houston TX", title);
    }


    @Then("^Customer should see Master of Business Administration section$")
    public void customer_should_see_master_of_business_administration_section() throws Throwable {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Graduate Degrees - North American University", title);
    }

    @And("^Customer should see and be able to click on Learn More Button$")
    public void customer_should_see_and_be_able_to_click_on_learn_more_button() throws Throwable {

    }


    @And("^Customer click International button under Graduate section$")
    public void customer_click_international_button_under_graduate_section() throws Throwable {
        homePageAdmissions = new HomePageAdmissions();
        homePageAdmissions.getAdmissionGraduateInternational().click();
    }

    @And("^Customer click Tuition and Fees button under Graduate section$")
    public void customer_click_tuition_and_fees_button_under_graduate_section() throws Throwable {
        homePageAdmissions = new HomePageAdmissions();
        homePageAdmissions.getAdmissionGrauteTutionAndFees().click();
        Thread.sleep(2000);
    }

    @Then("^Customer should see \"([^\"]*)\" page$")
    public void customer_should_see_something_page(String strArg1) throws Throwable {
        String title = driver.getTitle();
        System.out.println(title);

        Assert.assertTrue(title.contains(strArg1));
        Thread.sleep(500);
    }
}




