@DIGI-37136
Feature: Display Provider API-Bundles for a API-Category
  As a user
  i want to see a list of available api bundles of a specific api-category
  so that i know which apis of an api-category are available.

  Scenario: Show list of API-bundles
    Given Megan requests a summary of the "Accounts" API-category
    When she navigates to the details of the "Accounts" API-category
    Then she sees the description of the "Accounts" API-category
    And she sees a list of API-bundles belonging to the following API-providers
      | Raiffeisenbank (Bulgaria) EAD    |
      | Raiffeisen Bank S.A.             |
      | Raiffeisen Banking Group Austria |
      | Raiffeisenbank A.S.              |
      | Tatra Banka, a.s.                |
      | Raiffeisenbank Austria d.d       |
      | Raiffeisen Bank Zrt.             |