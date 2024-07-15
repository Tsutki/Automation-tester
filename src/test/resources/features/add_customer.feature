Feature: Add Customer

  Scenario Outline: Add a new customer
    Given User is on the add customer page
    When User enters customer details "<name>" and "<email>"
    And User clicks on add customer button
    Then Customer should be added successfully

    Examples:
      | name    | email          |
      | John Doe| john@example.com|
      | Jane Doe| jane@example.com|
