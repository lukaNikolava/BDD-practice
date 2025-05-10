Feature: Page Information
  As a user
  I want to view page information
  So that I can check the details of the article

  Scenario: View page information for "Bengal tiger" article
    When I open the main page
    And I input "Bengal tiger" in the search field
    And I click the submit button
    When I click the Tools menu on the article page
    And click the Page information button on the tools dropdown
    Then The information page for "Bengal tiger" article is displayed
