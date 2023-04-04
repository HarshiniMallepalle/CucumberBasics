Feature: Login sceanarios of SalesForce application

Background: Launching application -steps that should run before every scenario
Given User launch the SalesForce application

Scenario Outline: Login into  SalesForce with valid username and password
When user enter username "<username>"
Then user enter password "<password>"
Then click on Remember Me
And click on Login Button

Scenario Outline: Login into  SalesForce with valid username and password
When user enter username 
Then user enter password 
Then click on Remember Me
And click on Login Button

Examples:
|username|password|
|mhr@software.com|salesforce@89|
|harshini@software.com|Test@123|
