Feature: Customer can search for items by clicking on Tabs

  As a user,
  I want to search for items in a department
  By clicking on the department tab

  Background: Given I navigate to next.co.uk

  Scenario Outline:
  User can successfully search department items by clicking on departments tab
    When I click on a "<Department>"
    Then a list of items in "<Department>" is displayed
    And I click on any of the results

    Examples:

      |Department|
      |Girls|
      |Home|