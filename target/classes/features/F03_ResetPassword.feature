@RunSmoke
Feature: F02_ResetPassword | User should be able to reset his password


  Scenario: Reset password by entering registered email
    Given  User navigates to reset page
    When   Click on Forgot password
    And    Enter registered email
    And    Click on recover button
    Then   User should be reset password and notification message displayed