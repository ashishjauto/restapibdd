Feature: PetStore Application has data
  Scenario: Fetch All user exist in application
    Given When i send request to the application to fetch  user
    Then User return in json format
    And  body data should be in json format data
    And validate that info code should be 200