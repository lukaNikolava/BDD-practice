# Wikipedia Automation Testing – BDD with Cucumber

This project contains automated test scenarios for verifying key functionalities of the Wikipedia website using **Selenium WebDriver**, **Cucumber (BDD)**, and **TestNG**. It focuses on simulating real-world user actions and validating expected behavior for searching, accessing page information, and downloading articles as PDF.

---

## 📌 Features Covered

### 1. View Page Information
- Search for an article
- Access the "Tools" menu
- Navigate to "Page Information" page

### 2. Search Articles in Different Languages
- Change the search language
- Search for content in a specific language (e.g., Spanish)
- Verify the article page opens in the selected languagea

### 3. Download Article as PDF
- Search for an article
- Access "Download as PDF" option from Tools
- Download and verify the correct file is saved

---

## 🛠 Technologies Used

- **Java**
- **Selenium WebDriver**
- **Cucumber**
- **TestNG**
- **Maven**
- **Aquality Framework**

---

## 🔁 CI/CD with Jenkins

This project is integrated with **Jenkins** for continuous integration and test automation.

- ✅ Tests are triggered automatically on code push
- ✅ Test reports are generated and archived after each run
- ✅ Configured as a Jenkins Freestyle Job

## 🚀 Getting Started

### Prerequisites

Make sure you have the following installed:

- Java 8+
- Maven
- ChromeDriver or any WebDriver
- IntelliJ IDEA / VS Code (or any IDE)

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/your-repo-name.git
   cd your-repo-name

2. Instal Dependencies:
   ```bash
   mvn clean install

3. Runnin Tests:
   ```bash
   mvn test
   
