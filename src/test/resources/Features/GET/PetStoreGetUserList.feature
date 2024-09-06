Feature: List All users in application
    Scenario: Send request to list all users in application
     Given When i request for list of users through urn
     When request for user list request using urn
     Then user list is return
     And info code should be 201