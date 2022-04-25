@RunSmoke
Feature: F05_ChangeCurrency | User should be able to change currency


  Scenario: change currency by clicking on EURO
    Given  Open drop down list
    When   Select currency
    Then   Products currency should be changed