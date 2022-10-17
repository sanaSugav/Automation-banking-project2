@Test
Feature: This is  New customer validation page

  Background:
    Given open application url in browser
    When Enter I Enter 'mngr446534' , 'uqapyju' and click on login page

  @Sc03
  Scenario: Edit customer validation page
    When Enter customerID "2008" and click on submit button
    Then Customer should be edit successfully










