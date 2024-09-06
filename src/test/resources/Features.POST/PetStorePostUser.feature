Feature: ADD user  in application
    Scenario: Add user with valid details
     Given Post URN access endpoints
     When i send POST request using urn
     Then user success message  return
     And data should be in json format