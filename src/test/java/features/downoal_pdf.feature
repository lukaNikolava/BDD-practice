Feature: Download PDF
  As a user
  I want to search for an article and download it as PDF
  So that I can save it for offline reading

  Scenario: Search and download file as PDF
    Then The main page is displayed
    And I input "Albert Einstein" in the search field
    And I click the submit button
    When I click the Tools menu on the article page
    And I click the Download as PDF button
    And I download the file from the Download as pdf page
    Then the file with the correct name is downloaded successfully
