Feature: User have to able to login
  As user
  I want to have active account
  So that I can buy product

  Scenario: Verify that user haven't register account cannot login
    Given Iam on the login page of AltaShop
    When I fill the box with invalid email and password
    And I clicked the Login Button
    Then I will get message record not found

  Scenario: Verify user with valid email and password can login to dashboard
    Given I on the login page of AltaShop
    When I filled  with valid email and password after regist
    And I click the Login Button
    Then I will directed to dashboard of AltaShop

  Scenario:  Verify user with invalid email and password cannot login
    Given Iam at the login page of AltaShop
    When I fill the field with valid email and invalid password
    And I clicked the Button to log me in
    Then I will get message record not found and I cannot login

