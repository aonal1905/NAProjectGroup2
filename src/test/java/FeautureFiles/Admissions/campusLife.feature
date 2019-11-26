
Feature: Campus Life Features

  Scenario: Search for student services under the campus life section and pop up menu of this section

    Given user will navigate to the website
    When user searches for student service section
    Then  The "student services" menu and pop up menu displayed


  Scenario: Search for student organization under the student organization section and pop up menu of this section

  Given user will navigate to the website
  When user hover over mouse to Campus life
  And I click on Student organization button
  Then I should able to see the title

  Scenario: Search for housing under the student organization section and pop up menu of this section

    Given user will navigate to the website
    When user hover over mouse to Campus life
    And I click on housing button
    Then I should able to see the handbook

  Scenario: Search for parking enforcement under the student organization section and pop up menu of this section

  Given user will navigate to the website
  When user hover over mouse to Campus life
  Then I click on parking enforcement
  And I should able to see the parking enforcement title

  Scenario: Search for campus security under the parking and security section and pop up menu of this section

    Given user will navigate to the website
    When user hover over mouse to Campus life
    Then I click on campus security
    And I should able to see the campus security title
  @test
  Scenario: Search for campus crime report under the parking and security section and pop up menu of this section

    Given user will navigate to the website
    When user hover over mouse to Campus life
    Then I click on campus crime report
    And I should able to see the campus crime report title