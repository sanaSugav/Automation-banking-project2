@KG
Feature: This is Mini statement page

 Background:
  Given open application url in browser
  When Enter I Enter 'mngr446534' , 'uqapyju' and click on login page

@AS
 Scenario: Mini statement with Invalid Credentials
  Given Enter account no "200898" and Click on Submit button
  Then  The ministatment submit Successfully
