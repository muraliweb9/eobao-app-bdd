Feature: Get all the available accounts
  As a customer I want to get all the available cccounts so that I can select the most appropriate one

  Scenario: Get all the available accounts
    Given As a new customer
    When I want to see all available accounts
    Then then see a successful response
    And I should get a total of 7 account types