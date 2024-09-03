Feature: List All users in application
    Scenario: Collect All the users
     Given i have urn for the application
     When i send get request using urn
     Then user list is return
     And data should be in json format