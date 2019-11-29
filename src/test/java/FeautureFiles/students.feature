Feature:User is going to search for Students page under the home page of NAU
@test
Scenario: User is going to search for Students page under the home page of NAU
  Given User will navigate to the website
  When User searches for Registrar section
  Then The "Registrar" menu will be open

  @test1
  Scenario: Search for Bursar’s Office sub-items of Bursar’s Office page under the Students
    Given User will navigate to the website
    When User searches for Bursar’s Office
    And The " http://web2.na.edu/students/registrar/" will be displayed
    Then Bursar’s Office section will be displayed

  @test
  Scenario: Search for Grievance Procedure sub-items of Grievance Procedure under the Students
    Given User will navigate to the website
    When User searches for Grievance Procedure section
    Then The Grievance Procedure page will be open

  @test
  Scenario: Search for NAU Library part sub-items of NAU Library under the Students
    Given User will navigate to the website
    When User searches for NAU Library
    Then The NAU Library part will be appear

  @test
  Scenario: Search for NAU Moodle part sub-items of NAU Moodle under the Students
    Given User will navigate to the website
    When User searches for NAU Moodle
    Then The NAU Moodle part will be appear

  @test
  Scenario: Search for Registrar's Office part sub-items of Registrar's Office under the Students
    Given User will navigate to the website
    When User searches for Registrar's Office
    Then The Registrar's Office part will be appear
    And And I click  button "STUDENT REQUEST"

  @test
  Scenario: Search for International Student Office part sub-items of International Student Office under the Students
    Given User will navigate to the website
    When User searches for International Student Office
    Then The International Student Office part will be appear
    And I click  button "StudentVisas"

  @test
  Scenario: Search for Gulf Language School part under the Students
    Given User will navigate to the website
    When User searches for Gulf Language School
    Then The Gulf Language School part will be appear

  @test
  Scenario: Search for Housing part under the Students
    Given User will navigate to the website
    When User searches for Housing button
    Then The Housing page will be appear
    And I click "HANDBOOK" button

  @test
  Scenario: As a user, I want to see the page when I click the Student Success button
  under the Student section and click the PEER MENTOR button on the same page.
    Given User is on the HomePage NAU
    When I hover over mouse to Students
    Then I click Student Success button under Students section
    And I should see and be able to click on "PEER MENTOR" Button

