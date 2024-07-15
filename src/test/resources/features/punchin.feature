Feature: PunchIn Message Verification

  Scenario: Verify toast message after PunchIn
    Given User is on the dashboard
    When User performs PunchIn
    Then Toast message should be displayed saying "PunchIn successful"
