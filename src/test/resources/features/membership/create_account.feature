@DIGI-34360
Feature: Create API-Marketplace account
  As a portal user
  I want to create an account,
  So that I'm able to use the APIs provided on the portal.

  Scenario: Sign Up
    Given John has opened the Marketplace Portal to create an account
    When John requests to sign up
    Then he should be taken to a sign-up form view