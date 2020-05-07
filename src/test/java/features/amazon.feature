@amazon
Feature: verify amazon page

  Scenario: navigate to the deals section
    Given I am on home Page
    When I tap on search text box
    Then enter the search criteria
      | search     |
      | 65-inch tv |
    And I click on the item

