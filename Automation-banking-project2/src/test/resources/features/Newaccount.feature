@CF01
Feature: This is New account validation page

 Background:
  Given open application url in browser
  When Enter I Enter 'mngr446534' , 'uqapyju' and click on login page

 @CN
 Scenario: New account validation page
  Given enter customerID "2008" And add initial deposite "12345" And click on submit button
  Then customer should be delete successfully
