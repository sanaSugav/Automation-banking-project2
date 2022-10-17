@SF
Feature: This is Log out page

 Background:
  Given open application url in browser
  When Enter I Enter 'mngr446534' , 'uqapyju' and click on login page

 @SC11
 Scenario: Log out with invalid credentials
  Given click on logout button
  Then  Log out successfully
