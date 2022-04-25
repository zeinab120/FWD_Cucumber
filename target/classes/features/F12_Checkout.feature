@RunSmoke
Feature: F12_Checkout | Logged user can Checkout products from shoppingCart

#Test scenario:
  Scenario: Logged user can Checkout products
    Given Logged user could add products to Shopping cart
    When user click on checkout button
    Then The checkout page should be opened