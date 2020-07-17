@DIGI-37147
Feature: Create Application
  As a developer
  I want to create an application
  In order to be able to consume APIs

  Background: User session exists
    Given Sebastian is logged in on the portal

  Scenario: Create app with name and description
    When Sebastian requests to create an app
    And he enters "MyApp" as app name and "MyApp's Description" as app description
    Then he should see the details of the newly created app

  Scenario: Create app without specifying a name
    When Sebastian requests to create an app
    And he enters only "MyApp's Description" as app description
    Then he shouldn't be allowed to proceed

  Scenario: Create app without specifying a description
    When Sebastian requests to create an app
    And he enters only "MyApp" as app name
    Then he shouldn't be allowed to proceed