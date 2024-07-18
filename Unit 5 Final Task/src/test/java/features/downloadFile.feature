Feature: Download File
  I am an user
  I want to download file

  Scenario: I want to search anything and download that as pdf
    Given Open the Main page
    Then Main Page is displayed
    When Input Albert Einstein text in the search field
    And click submit button
    And Click Tool menu button
    And Download as PDF button on the Article page
    And Download file from Download as PDF page
    Then File with the name provided on Download as PDF page is downloaded