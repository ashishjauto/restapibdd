Feature: Get one user which exist in application
  Scenario: Fetch one  user exist in application
    Given When i send request to the application to fetch one user which exist
    When  send get request using urn
    Then one user is return
    And  body data should be in json format
    And validate that info code should be 200