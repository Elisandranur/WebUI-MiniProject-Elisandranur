Feature: User have to able add product to their cart
  As user
  I have to choose product and add to my cart
  So that I can purchase my cart

  Scenario: Verify that after click "BELI" product automatically add to cart
    Given User already in AltaShop dashboard
    When I click BELI on product
    Then number on cart icon will appear
    And product are added to the cart

  Scenario: Verify that cart icon will show number of product inside
    Given User already in AltaShop dashboard
    When I click "BELI" on some products
    Then number cart icon will appear

  Scenario: Check the cart if product won't show on cart
    Given User already in AltaShop dashboard
    When I click "BELI" on some products
    Then number on cart icon will appear
    And product are not on the cart

