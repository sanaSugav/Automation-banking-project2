@SH
Feature: This is Cusomized statement page

 Background:
  Given open application url in browser
  When Enter I Enter 'mngr446534' , 'uqapyju' and click on login page

 @SC07
 Scenario: Customized statement with invalid credentials
  Given enter account no "200898" And fill date From "12/06/99" To "12/08/20"
  And   ENter mini transaction value "7765" And transaction "4344565"And click on submit
  Then  Cutomize statement successfully
