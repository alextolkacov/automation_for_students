Feature: Try first cucumber scenario

  Scenario: Our first cucumber scenario
    Given Koke home page
    Then we are pressing registration btn
    Then we are on Registration page
    When we are filling in registration form:
      | iin      | 132452146234  |
      | email    | test@test.com |
      | phone    | 712345678     |
      | password | Test1234      |
    And we are pressing Submit button
    Then we are on the Step 2 page