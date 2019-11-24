Feature:
@Students
Scenario: User is going to search for Students page under the home page of NAU
  Given User will navigate to the website
  When User searches for Registrar section
  Then The "Registrar" menu will be open

  @Bursar’s
  Scenario: Search for Bursar’s Office sub-items of Bursar’s Office page under the Students
    Given User will navigate to the website
    When User searches for Bursar’s Office
    And The " http://web2.na.edu/students/registrar/" will be displayed
    Then Bursar’s Office section will be displayed