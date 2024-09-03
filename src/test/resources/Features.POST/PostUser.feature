Feature: ADD user  in application
    Scenario: Add user with valid details
     Given i have urn for the application
     When i send POST request using urn
     Then user success message  return
     And data should be in json format