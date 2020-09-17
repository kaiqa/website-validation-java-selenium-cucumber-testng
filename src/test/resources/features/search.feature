
Feature: Search

  @Regression
  Scenario: 2.4 Advanced search to look for a specific author
    Given I delete all cookies
    Given I am on the home page
    Then  I click on the cookie accept button
    And   I open the advanced search page
    Then  I fill in the advanced search form name field with "UTAGAWA KUNIYOSHI"
    And   I fill in the advanced search form title field with "DE CHOFU TAMA"
    Then  I enable the advanced search form tick box only with images
    And   I fill in the advanced search form field start year with "1846"
    Then  I fill in the advanced search form field end year with "1850"
    And   I click on the advanced search form button find
    And   I see the advanced search results with "4" pictures