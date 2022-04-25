@RunSmoke

Feature: F04_Search | User should be able to search successfully

  #Test scenario:
  Scenario: Logged user could search by product name
    Given  user navigates to login page
    And    user can login with valid email and valid password
    When   logged user clicks on search field
    And    logged user searches with name of product
    And    Click on search button
    Then   logged user could find relative results