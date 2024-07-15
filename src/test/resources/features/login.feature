Feature: Login Journey

  Scenario Outline: User Login
    Given the user is on the login page
    When the user logs in with username "<username>" and password "<password>"
    Then the user should be logged in successfully

    Examples:
      | username | password |
      | user1    | pass1    |
      | user2    | pass2    |
