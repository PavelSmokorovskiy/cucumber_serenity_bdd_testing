@DIGI-37134
Feature: Show API-category description
  As a portal user
  I want to see a description of the API-category,
  So that I can determine if it matches the needed API functionality.

  Scenario: Show API category description
    Given John has opened the API-category overview
    When John selects the API-category "Accounts"
    Then he should see the details of the API-category

