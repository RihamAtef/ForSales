# ForSales
Project Name
 a Selenium Java project with Cucumber that automates the testing of [swag Labs]. It utilizes the popular Selenium framework along with Cucumber for behavior-driven development.

Prerequisites
Before running the tests, make sure you have the following prerequisites installed:
Maven - version 20 or higher
Selenium WebDriver - version 4.8.3
Cucumber - version 7.12.1
javafaker - version 7.0.1
EdgeDriver 
Getting Started
To get started with the project, follow these steps:

Clone the repository from GitHub:
$ git clone (https://github.com/RihamAtef/ForSales.git)
``
Navigate to the project directory:
Copy
$ cd ForSales
```
Install the project dependencies using Maven:
Copy
$ mvn clean install
```
Update the config.properties file with the necessary configurations such as the website URL, browser type, etc.
Run the tests using Maven:
Copy
$ mvn test
```
Test Reports
After running the tests, the test reports are generated in the target/cucumber-reports directory. Open the HTML report (cucmber.html) in a web browser to view the detailed test results.
