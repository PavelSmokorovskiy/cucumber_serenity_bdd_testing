@DIGI-34209
Feature: Display list of apps already created
  As a developer
  I want to be able to display a list of apps I already created
  In order to have overview of all apps I created

  Scenario: List created apps
    Given Sebastian has created an app with the name "MyApp"
    When he requests a list of apps
    Then he should see an list item with the name "MyApp"
    And the option to go to the app settings
    And the option to delete the app