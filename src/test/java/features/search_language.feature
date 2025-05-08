Feature: Search articles in different languages
  As a Wikipedia user
  I want to search for articles in my preferred language
  So that I can read content in the language I understand

  Scenario: Search for "Gabriel García Márquez" in Spanish
    Given The main page is displayed
    When I change the search language to "es"
    And I input "Gabriel García Márquez" in the search field
    And I click the submit button
    Then The article page for "Gabriel García Márquez" is displayed
