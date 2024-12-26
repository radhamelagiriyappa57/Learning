Feature: Test Login


Background: User is logged in
		Given User is on login page
    When enter <username> and <pwd>
    And click login button
   
 	
 @regress 	
 	Scenario: Check login is successful with valid credentials

   
    Then user is on dashboard page
 
 
 @regress   
    Scenario: Save Biographic
    
    When User navigates to My Profile
    And click profile
    Then Save profile
     

    