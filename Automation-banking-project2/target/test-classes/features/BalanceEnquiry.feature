@HS
Feature: This is Balance Enquiry page

 Background:
  Given open application url in browser
  When Enter I Enter 'mngr446534' , 'uqapyju' and click on login page

 @SC09
 Scenario: Balance enquiry with invalid credentials
  Given enter account no "200898" And click on submit button
  Then  Balance enquiry successfully
