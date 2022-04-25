@RunSmoke

Feature: F03_Login | User should be able to login to the system


  #Test Scenario1:
  Scenario: Login with valid username and password
    Given User navigates to login page
    When user enters valid username and password
    And  Click on login button
    Then User should be login successfully