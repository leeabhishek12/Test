Feature: Test login feature

  Scenario Outline: Check login is successful with valid credential
    Given browser is open
    And user is on login page
    When user enter <username> and <password>
    And user clicks on login
    Then user is navigated to the home page

    Examples: 
      | username | password |
      | Raghav   |    12345 |
      | Ele      |    12345 |
