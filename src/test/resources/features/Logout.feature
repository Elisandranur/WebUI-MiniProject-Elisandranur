Feature: User able to logout from account
  As user
  I have to logout
  So that I can close the altashop

  Scenario: Check if the Log Out button can be used to loggin out user
    Given User already in AltaShop dashboard already login
    When I click user icon on up-right page
    And I clicked Logout
    Then I will on the login page