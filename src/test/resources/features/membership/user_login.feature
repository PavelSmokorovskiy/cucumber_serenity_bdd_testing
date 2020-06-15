@DIGI-34357
Feature: API-Marketplace user login
  As a portal user
  I want to log-in to the portal,
  So that I can get started with using the provided APIs.

  Scenario: Log in to API-Marketplace
    Given John has opened the Marketplace Portal to log in
    When John requests to log in
    And he enters Email as "<email>" and Password as "<password>"
      | email@example.com | password |
    Then he should see his name and last name displayed confirming he is logged-in
