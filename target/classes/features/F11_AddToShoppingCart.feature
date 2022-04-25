@RunSmoke


Feature: F11_AddToCart | Logged user can add products to shoppingCart

#Test scenario:
    Scenario: Logged user can add products to shoppingCart
      Given Logged user could add First products to Shopping cart
      And  user add Second products to Shopping cart
      When user click on cart button
      Then The cart page should be opened