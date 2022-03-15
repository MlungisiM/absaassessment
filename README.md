# ABSA Assessment

CIB Digital Tech – QA Automation Assessment

The aim of this project is to create an automated test case in Selenium using the way 2 utomation website as the system under test.

Task:
Your task is to automate the two test cases below. You are free to use any Open Source automation
frameworks, but please do list the tools and resources used. Below is a list of patterns and practices
that we are looking for in your solution:
 Hybrid approach with modularization
 Descriptive programming
 Regular expressions
 Parameterization
 At least two ways of storing and utilizing test data
 Report stores test evidence and results

Task 1 - API:
Public API - https://dog.ceo/dog-api/
Using the above mentioned API perform the following calls.
• Perform an API request to produce a list of all dog breeds. (Diagram 1)
• Using code, verify “retriever” breed is within the list. (Diagram 2)
• Perform an API request to produce a list of sub-breeds for “retriever”. (Diagram 3)
• Perform an API request to produce a random image / link for the sub-breed “golden” (Diagram 4)

Getting Started
This is a Maven project based on Page Factory design pattern. To access this project, import this project directly from github into your IntelliJ IDE or clone the Repository in your local machine and open the Maven project from your local directory into IntelliJ.

Prerequisites
IntelliJ IDEA Community 2018.x
JDK-1.8.x
Chrome Web browser
Firefox
Properties file

Installing - following the instructions from the links

Download and Install:
1.	IntelliJ IDE  - https://www.guru99.com/intellij-selenium-webdriver.html#2
2.	JDK  - https://docs.oracle.com/javase/7/docs/webnotes/install
3.	Chrome - https://support.google.com/chrome/answer/95346?co=GENIE.Platform%3DDesktop&hl=en-GB
4.  Firefox - https://www.mozilla.org/en-US/firefox/new/

Framework
Hybrid - Keyword driven and Data driven

Tools and Technology used

Web Testing Framework: Selenium Webdriver
Build Tool: Maven
Testing Tool: TestNG
Programming Language: Java
Version Control: Git
Hosting Service: GitHub
Data storage: properties file, intended to also use excel but didn't get a chance to do so
Reporting: maven surefire report

Plugins and Dependencies used
Selenium-java
TestNG
WebDriverManager
Rest Assured
maven-surefire-report-plugin
maven-surefire-plugin

Design

Framework consists of following modules / packages:
•	common (contains setup classes to be used across the project), 
•	pages (contains web applications page factory), 
•	tests (contains web and api tests for the way 2 automation website and dog website api) 

Data storage files are kept in test resources folder. config.properties files stores the browser name, test url and test data.

Running the tests with TestNG
The framework currently support chrome and firefox browser. Browser can be specified in the config.properties file

Web and API

Option one:
•	right-click on pom.xml file
•	click Run

Option two:
•	right-click on way2autowebsite class or Absaapi class
•	click Run

Option three:
•	If you have maven installed; type 'mvn clean test' via Intellij Terminal
•	Else; Click on Maven Tool Window > Click Lifecycle > Click clean > then Click test
•	A testNG will be generated under target/surefire-reports. You may open the index.html file via a browser
