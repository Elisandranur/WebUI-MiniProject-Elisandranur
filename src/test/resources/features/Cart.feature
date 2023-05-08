Feature: User have to able add product to cart

  Scenario: Verify user can add quantity of product
    Given User already in AltaShop cart page
    When I click ""plus"" icon on product
    Then number of quantity of product will increase

  Scenario:Verify user can remove or substract quantity of product
    Given User already in AltaShop cart page
    When I click minus icon on product
    Then numer of quantity of product will decrease

  Scenario: Verify user can buy after clicked "BAYAR" and already login
    Given User already in AltaShop  cart page
    When I click BAYAR on product
    Then transaction page will show up"