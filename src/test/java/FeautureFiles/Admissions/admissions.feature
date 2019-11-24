
Feature: Admissions Page Features

  @test
  Scenario: As a user when I click at the “Apply Now” button at the drop down
  menu under the “Graduate” tab I should be
  able to navigate to “apply home page” and start my application.

    Given User is on the HomePage NAU
    When I hover over mouse to Admissions Menu
    And I click Apply Now button under Graduate section
    Then I should be in the NAU admissions page
    And I should see Apply and SignIn Button


  Scenario: As a user, when I hover over the Admissions tab under the NAU Logo on the NAU Home Page,
  I should be able to go to the Undergraduate Students Home Page when I click the Undergraduate from
  the options that pop up to make a selection.

    Given User is on the HomePage NAU
    When I hover over mouse to Admissions Menu
    And I click  Undergraduate section
    Then I should be in the NAU Undergraduate page


  Scenario: As a user when I click at the “Graduate Degrees” button at the drop down menu under the
  “Graduate” tab I should be able to navigate to “Graduate Degrees”  page and see the information
  for each graduate degree and an active link button .

    Given User is on the HomePage NAU
    When I hover over mouse to Admissions Menu
    And I click “Graduate Degrees” button under Graduate section
    Then I should be in the “Graduate Degrees” page


  Scenario: As a user when I click at the “GLS Admissions” button at the drop down menu under the “Gulf Language School”
  tab I should be able to navigate to admissions page for Gulf Language School.

    Given User is on the HomePage NAU
    When I hover over mouse to Admissions Menu
    And I click “GLS Admissions” button under “Gulf Language School” section
    Then I should be in the Gulf Language School

