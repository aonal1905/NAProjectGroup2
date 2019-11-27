
Feature: Admissions Page Features

  @run
  Scenario: As a user when Customer click at the “Apply Now” button at the drop down
  menu under the “Graduate” tab Customer should be
  able to navigate to “apply home page” and start my application.

    Given User is on the HomePage NAU
    When Customer hover over mouse to Admissions Menu
    And Customer click Apply Now button under Graduate section
    Then Customer should be in the "NAU admissions" page
    And Customer should see Apply and "SignIn" Button

  @test
  Scenario: As a user, when Customer hover over the Admissions tab under the NAU Logo on the NAU Home Page,
  Customer should be able to go to the Undergraduate Students Home Page when Customer click the Undergraduate from
  the options that pop up to make a selection.

    Given User is on the HomePage NAU
    When Customer hover over mouse to Admissions Menu
    And Customer click  Undergraduate section
    Then Customer should be in the NAU Undergraduate page

  @test
  Scenario: As a user when Customer click at the “Graduate Degrees” button at the drop down menu under the
  “Graduate” tab Customer should be able to navigate to “Graduate Degrees”  page and see the information
  for each graduate degree and an active link button .

    Given User is on the HomePage NAU
    When Customer hover over mouse to Admissions Menu
    And Customer click “Graduate Degrees” button under Graduate section
    Then Customer should be in the “Graduate Degrees” page

  @test
  Scenario: As a user when Customer click at the “GLS Admissions” button at the drop down menu under the “Gulf Language School”
  tab Customer should be able to navigate to admissions page for Gulf Language School.

    Given User is on the HomePage NAU
    When Customer hover over mouse to Admissions Menu
    And Customer click “GLS Admissions” button under “Gulf Language School” section
    Then Customer should be in the Gulf Language School

  @test
  Scenario: As a user when Customer click at the “Graduate Degrees” button at the drop down menu under the
  “Graduate” tab Customer should be able to navigate to “Graduate Degrees” page and see the
  information for each graduate degree and an active link button .

    Given User is on the HomePage NAU
    When Customer hover over mouse to Admissions Menu
    And Customer click “Graduate Degrees” button under Graduate section
    Then Customer should see Master of Business Administration section
    And Customer should see and be able to click on Learn More Button



  @test
  Scenario: As a user when Customer click at the “International” button at the drop down menu under
  the “Graduate” tab Customer should be able to see the “International Students” button.

    Given User is on the HomePage NAU
    When Customer hover over mouse to Admissions Menu
    And Customer click International button under Graduate section
    Then Customer should see "International" page


  @test
  Scenario: As a user when Customer click at the “tuition and fees” button at the drop down
  menu under the “graduate” tab Customer should be able to navigate to “Tuition and Fees”
  page and navigate to “Tuition and Fees” page


    Given User is on the HomePage NAU
    When Customer hover over mouse to Admissions Menu
    And Customer click Tuition and Fees button under Graduate section
    Then Customer should see "Tuition" page

