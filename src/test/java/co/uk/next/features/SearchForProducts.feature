Feature: Search for products
  As a user
  I want to search for a product
  So I can view the available options

  Background:
    Given I navigate to next.co.uk

  Scenario Outline: User can successfully search for products

    When I enter "<ProductName>" in the search field
    And I click on the search button
    Then a list of "<ProductName>" is displayed
    And I click on one of the result links

    Examples:

      |ProductName|
  # |Ladies shoes|
      |Joggers|
      |Maternity|
     # |girls hoodies|
