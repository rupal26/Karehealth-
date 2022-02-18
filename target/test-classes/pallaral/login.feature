Feature: Succeessful Login with valid Cridentials

  Scenario: check login with correct credentials
    Given User is on Login page
    And User enter username
    And User enter password 
    And User click on login button
    Then User is displayed webpage with tittle "Admin  | Dashboard"
