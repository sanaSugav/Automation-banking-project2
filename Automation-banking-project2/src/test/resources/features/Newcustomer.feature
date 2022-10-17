
 @NC
  Feature: New customer validation
  Background:
    Given open application url in browser
    When Enter I Enter 'mngr446534' , 'uqapyju' and click on login

  @Sc02
  Scenario: Add new customer with valid credencials
    When enter "sana" and click on gender
    And Enter "12-06-2000" and address "pune" and city "latur"
    And Enter state "maharashtra" and pin "413544" and telephone "8149860254"
    And Enter emil "sana@gmail.com" and click on submit
    Then Submit should be succesful







