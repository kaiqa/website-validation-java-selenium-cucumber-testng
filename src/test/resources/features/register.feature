Feature: Register

  @Regression
  Scenario: 2.1 Sign up the website using a valid email.
    Given I delete all cookies
    And   I am on the home page
    Then  I click on the cookie accept button
    And   I click on the home page login button
    Then  I click on the sign up link
    And   I click on the button create account with email
    And   I fill in the home page register form name field with "user2"
    And   I fill in the home page register form email field with "c9u8z+9o9k92e81kk6a@sharklasers.com"
    And   I fill in the home page register form password field with "asdfqwer1234"
    And   I fill in the home page register form password repeat field with "asdfqwer1234"
    And   I enable the home page register form agreement tick box
    And   I click on the home page register form button sign up