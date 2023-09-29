Feature: Get all the available accounts
  As a customer I want to get all the available cccounts so that I can select the most appropriate one

  Scenario: Get all the available accounts
    Given the service is up
    When I ask for all available accounts
    Then then I should get A, B, C