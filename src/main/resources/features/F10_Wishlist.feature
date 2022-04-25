@RunSmoke

Feature: F10_Wishlist | User should be able to add product successfully

  #Test scenario:
  Scenario: Logged user could add product to wish list
    Given  Add product1
    And    Add product2
    When   click on wishlist click
    Then   logged user navigates to his Wishlist page