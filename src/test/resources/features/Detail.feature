Feature: User have to able to see product detail before add to cart
  As user
  I have to see the detail of product
  So that I can buy the product

  Scenario: Verify that user can access detail of product by click "DETAIL"
    Given Iam in AltaShop dashboard
    When I click DETAIL on product
    Then the detail product page will show up