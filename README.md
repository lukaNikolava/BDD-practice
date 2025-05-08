# Selenium BDD Test Project

## Description
This project demonstrates automated tests for Wikipedia using Selenium, TestNG, Aquality, and BDD (Behavior-Driven Development). The tests include downloading PDFs, retrieving page information, and searching articles in multiple languages.

## Technologies Used
- **Selenium WebDriver** - For browser automation
- **TestNG** - For structuring and running tests
- **Aquality** - For web element handling and validation
- **BDD** - Behavior-Driven Development for test scenarios

## Test Cases

### Test Case 1: Download PDF
**Host**: [https://www.wikipedia.org](https://www.wikipedia.org)

**Preconditions**:
- Open the main page
- Ensure the main page is displayed
- Input "Albert Einstein" in the search field and click the submit button
- Click the "Tools" menu and select "Download as PDF"
- Verify the file downloads with the provided name

### Test Case 2: Page Information
**Host**: [https://www.wikipedia.org](https://www.wikipedia.org)

**Preconditions**:
- Open the main page
- Ensure the main page is displayed
- Input "Bengal tiger" in the search field and click the submit button
- Click the "Tools" menu and select "Page information"
- Verify the page information for the "Bengal tiger" article is displayed

### Test Case 3: Search Language
**Host**: [https://www.wikipedia.org](https://www.wikipedia.org)

**Preconditions**:
- Open the main page
- Ensure the main page is displayed
- Input "Gabriel García Márquez" in the search field
- Change the search language to Spanish and click the submit button
- Verify the article page for "Gabriel García Márquez" is displayed

## How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/yourrepository.git

2. Install required dependencies:
   ```bash
   mvn install

3. Run the tests using Maven:
   ```bash
   mvn test
