Feature: ADD user  in application
    Scenario: Add user with valid details
     Given Post URN access endpoints
     Then user success message  return
     And data should be in json format