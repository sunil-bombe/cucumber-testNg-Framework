# 🚀 Cucumber-TestNG-Framework

A scalable and maintainable **UI Automation Framework** built using **Java**, **Selenium 4**, **Cucumber BDD**, **TestNG**, and **PicoContainer Dependency Injection**.

This framework follows industry-standard design patterns such as **Page Object Model (POM)** and **Dependency Injection (DI)** to improve code reusability, maintainability, and scalability.

---

# 📑 Table of Contents

- Features
- Technology Stack
- Project Structure
- Framework Architecture
- Installation
- Running Tests
- Dependency Injection
- Page Object Model
- Driver Management
- Utilities
- Configuration
- Best Practices
- Future Enhancements

---

# ✨ Features

- Selenium 4 (Selenium Manager)
- Cucumber BDD
- TestNG Integration
- PicoContainer Dependency Injection
- Page Object Model (POM)
- Cross Browser Support
- Explicit Wait Utilities
- Configuration using Properties File
- Centralized Driver Management
- Reusable Utilities
- Easy Maintenance
- Parallel Execution Ready
- CI/CD Ready

---

# 🛠 Technology Stack


| Technology    | Version |
| ------------- | ------- |
| Java          | 21+     |
| Selenium      | 4.x     |
| Cucumber      | 7.x     |
| TestNG        | Latest  |
| Maven         | Latest  |
| PicoContainer | Latest  |

---

# 📂 Project Structure

```text
cucumber-testNg-Framework
│
├── src
│
├── main
│   └── java
│       └── com.webwork
│
│           ├── constants
│           │      └── GlobalConstants.java
│           │
│           ├── context
│           │      └── TestContextSetup.java
│           │
│           ├── pages
│           │      ├── DashboardPage.java
│           │      ├── LoginPage.java
│           │      └── PageObjectManager.java
│           │
│           └── utils
│                  ├── AutomationUtils.java
│                  ├── GenericUtils.java
│                  ├── PropertyFileUtils.java
│                  ├── TestBase.java
│                  ├── UtilsManager.java
│                  └── WebDriverManager.java
│
├── test
│   ├── java
│   │   └── com.webwork
│   │
│   │      ├── runner
│   │      │      └── TestRunner.java
│   │      │
│   │      └── stepdefs
│   │             ├── DashboardPageStepDefinition.java
│   │             ├── Hooks.java
│   │             └── LoginPageStepDefinition.java
│   │
│   └── resources
│       ├── configs
│       │      └── global.properties
│       │
│       └── features
│              └── Login.feature
│
└── pom.xml
```

---

# 🏗 Framework Architecture

```
                    Feature Files
                          │
                          ▼
                 Step Definitions
                          │
                          ▼
                  TestContextSetup
                          │
          ┌───────────────┴───────────────┐
          ▼                               ▼
 PageObjectManager                UtilsManager
          │                               │
          ▼                               ▼
    Page Objects                  Utility Classes
          │
          ▼
   WebDriverManager
          │
          ▼
      Selenium Driver
```

---

# 💉 Dependency Injection

This framework uses **PicoContainer** for Constructor Dependency Injection.

Each Scenario gets its own

- TestContextSetup
- WebDriver
- Page Objects
- Utility Objects

Example

```java
public class LoginPageStepDefinition {

    private final LoginPage loginPage;

    public LoginPageStepDefinition(TestContextSetup context) {
        loginPage = context.getPageObjectManager().getLoginPage();
    }

}
```

No object is manually created inside Step Definitions.

---

# 📄 Page Object Model

Every page contains

- Locators
- Page Actions
- Assertions

Example

```
pages
│
├── LoginPage
├── DashboardPage
```

Example

```java
public class LoginPage {

    public void enterUsername(String username){

    }

    public void enterPassword(String password){

    }

    public void clickLogin(){

    }

}
```

---

# 🚗 Driver Management

The framework uses Selenium Manager.

No browser driver download is required.

Example

```java
WebDriver driver = new ChromeDriver();
```

Supported browsers

- Chrome
- Firefox
- Edge

---

# ⚙ Configuration

Configuration is stored in

```
src/test/resources/configs/global.properties
```

Example

```properties
browser=chrome
baseUrl=https://example.com
implicitWait=10
explicitWait=20
```

---

# 🛠 Utility Classes

### AutomationUtils

Contains reusable Selenium helper methods.

Examples

- Click
- Send Keys
- Scroll
- JavaScript Actions

---

### GenericUtils

Contains common Java utility methods.

Examples

- Random String
- Date Utilities
- Screenshot Name Generator

---

### PropertyFileUtils

Responsible for reading configuration values.

Example

```java
PropertyFileUtils.getProperty("browser");
```

---

### WebDriverManager

Responsible for

- Browser Initialization
- Driver Creation
- Driver Closing

---

### UtilsManager

Centralized utility object provider.

---

### TestBase

Framework base class used for browser initialization and setup.

---

# 📋 Test Execution

Run all tests

```bash
mvn clean test
```

Run smoke tests

```bash
mvn test -Dcucumber.filter.tags="@Smoke"
```

Run regression

```bash
mvn test -Dcucumber.filter.tags="@Regression"
```

Run on Chrome

```bash
mvn test -Dbrowser=chrome
```

Run on Firefox

```bash
mvn test -Dbrowser=firefox
```

---

# 📖 Sample Feature

```gherkin
Feature: Login

  Scenario: Successful Login

    Given User launches application
    When User enters username
    And User enters password
    And User clicks login button
    Then User should navigate to Dashboard
```

---

# 📌 Design Patterns Used

- Page Object Model (POM)
- Dependency Injection (PicoContainer)
- Singleton (Manager Classes)
- Factory Pattern (Driver Creation)
- Builder Pattern (Future Scope)

---

# ✅ Best Practices

- Follow Page Object Model
- Keep locators inside Page classes
- Avoid hard-coded values
- Use Explicit Waits
- Never use Thread.sleep()
- Keep reusable methods inside utility classes
- One responsibility per class
- Constructor-based Dependency Injection
- Maintain independent test scenarios

---

# 🚀 Future Enhancements

- Selenium Grid
- Docker Support
- Jenkins Pipeline
- GitHub Actions
- Allure Reporting
- Extent Reports
- Parallel Execution
- Retry Analyzer
- Screenshot on Failure
- Database Validation
- REST API Integration
- Excel Data Provider
- Cross Browser Parallel Execution

---

# 👨‍💻 Author

**Sunil Bombe**

Software Development Engineer in Test (SDET)

### Skills

- Java
- Selenium
- Cucumber
- TestNG
- Playwright
- REST Assured
- Jenkins
- Git
- Maven
- Automation Framework Development

---

# ⭐ Contributing

Contributions are welcome.

1. Fork the repository.
2. Create a new feature branch.
3. Commit your changes.
4. Push the branch.
5. Create a Pull Request.

---

# 📄 License

This project is developed for learning and enterprise automation framework development purposes.

---
