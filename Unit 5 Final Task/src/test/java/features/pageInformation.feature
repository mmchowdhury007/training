Feature: Page Information
  I am an user
  I want to check page information

  Scenario: I want to check the page information
    Given Open the Main page
    Then Main Page is displayed to check information of Bengal Tigers
    When Input Bengal tiger text in the search field
    And click submit button for Bengal Tiger article page
    And Click Tool menu button on Bengal Tiger article page
    And Click Page information button on the Bengal Tiger article page
    Then Information page for Bengal tiger article is displayed