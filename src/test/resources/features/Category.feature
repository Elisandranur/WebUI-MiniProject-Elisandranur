Feature: User have to able select category of product
  As user
  I have to choose product by their category
  So that I can choose that i want to buy

  Scenario: Verify if cursor click the select table, system show the list of category
    Given User already in AltaShop dashboard page
    When I click select on dashboard
    Then category of product will appear

  Scenario: Verify product will appear by the category that choosen
    Given User already in AltaShop dashboard page
    When I click select on dashboard
    And category of product will appear
    Then I click one category
    And The product with that category will appear

  Scenario: verify that no product appear if choose wrong category
    Given User already in AltaShop dashboard page
    When I click select on dashboard page
    And category of product appear
    Then I click one invalid category
    And the page show no product