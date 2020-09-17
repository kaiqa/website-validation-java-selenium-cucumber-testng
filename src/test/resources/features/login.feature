Feature: Login

  @Regression
  Scenario: 2.2 Log into the website
    Given I delete all cookies
    And   I am on the home page
    Then  I click on the cookie accept button
    Then  I click on the home page login button
    And   I fill in the home page login form email field with "m9u8zi+9o9k92e81kk6g@sharklasers.com"
    And   I fill in the home page login form password field with "asdfqwer1234"
    Then  I click on the home page login form button login

  @Regression
  Scenario: 2.3 Create first collection
            2.3.1 User should be logged in
            2.3.2 Press on Explore Rijksstudio (magnifying glass) on the top menu and
                  search for “Johannes Vermmer”
            2.3.3 Press the heart icon displayed at the bottom of the “The Milkmaid” picture and
                  add it to your first collection.

    Given I am on the home page
    Then  I click on the home page profile button
    And   I see the title "Collected works of user1 - All Rijksstudio's - Rijksstudio - Rijksmuseum"
    Then  I navigate back
    Then  I click on the search icon button
    And   I fill in the search field with "Johannes Vermeer"
    Then  I click on the search icon button
    And   I see the title "Search - Rijksmuseum"
    Then  I locate the picture the milkmaid
    And   I click on the picture the milkmaid heart icon button
    Then  I click on the modal dialog button my first collection
    And   I click on the x of the dialog first time added hint
    And   I click on the home page profile button
    Then  I click on the button get started
    Then  I click on the collection item the milkmaid
    And   I click on the x of the dialog start the tour
    Then  I see the title and author of the milkmaid picture