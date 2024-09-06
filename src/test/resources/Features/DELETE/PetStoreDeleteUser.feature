Feature: Delete user  in application

  Scenario: Delete user with valid details
    Given Delete URN access endpoints
    Then user deletion success message return with json format
    And delete user body data should be in json format data

