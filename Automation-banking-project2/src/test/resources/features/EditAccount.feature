@SS01
Feature: This is Edit Account validation page

 Background:
  Given open application url in browser
  When Enter I Enter 'mngr446534' , 'uqapyju' and click on login page

 @EC01
 Scenario: Edit Account validation page
   Given   Enter Accountnumber "200898" and click on submitbutton
   Then     customer should be Edit Account successfully
