@RunSmoke
Feature: F09_ AddToCompare | Logged user could add different products to compare list


  Scenario: Logged user could add different products to Compare list
    Given logged user can add First Product to Compare list
    And logged user can add Second Product to Compare list
    When logged user navigates to Compare products list
    Then logged user could compare between the selected products

