@CD01
Feature: This is Delete Account validation page

 Background:
  Given open application url in browser
  When  Enter I Enter 'mngr446534' , 'uqapyju' And click on login page

 @AD01
 Scenario: Delete Account validation page
   Given   Enter accountnumber "200898" And Click on Submitbutton
   Then    Account should be Delete successfully