@RunSmoke

Feature: F01_Registration | User should be able to register successfully

  #Test scenario:
  Scenario: Register with entering valid First name,Last name , Email, Password, and confirm password
    Given  User navigates to registration page
    When   user fill mandatory fields
    And    Click on register button
    Then   User should be registered successfully
    And    user logout to login again