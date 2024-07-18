Feature: Search Language
  I am an user
  I want to change the search language

  Scenario: I want to change the search language
    Given Open the Main page
    Then Main Page is displayed for search language
    When I Input Gabriel García Márquez text in the search field
    And change search language to Español
    And click submit button for changed language
    Then Article page for Gabriel García Márquez is open
