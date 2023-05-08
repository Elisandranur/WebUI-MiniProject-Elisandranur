Feature: User able to register account
  As user
  I have to register first
  So that I can login and buy product

  Scenario: Verify that user that already fill all column can register their account
    Given Iam on the register page of AltaShop
    When I fill the box with test data
    And I clicked the registerButton
    Then I will directed to login page
    And I try to login