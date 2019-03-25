#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@LoginFeature
Feature: Login
  Test the Login functionality of the Application

  @smoke
  Scenario Outline: Test the Login functionality of the Application
    Given I Navigate to Login page
    And I Enter the userName "satva3@getnada.com" and password "Satva1213#"
    And I Click The Login Button
    Then I  Shoud See the Home Page
