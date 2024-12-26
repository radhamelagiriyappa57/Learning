Feature: Test CreateAccount




    
@smoke
Scenario: Create Account
		Given User is in MYL
		
  	When User fills data with "" and ""
    And click create button
    Then user is on Finish My Account Page
    And Fill data in Finish My Account Page
    Then Save About Me
   