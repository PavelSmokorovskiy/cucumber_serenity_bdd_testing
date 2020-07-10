@DIGI-36814
Feature: Overview Api Categories
  As a portal user
  I want to see an overview of API-categories,
  So i have an understanding which consumption options are available.

  Scenario: List available PSD2 APIS
    Given John has opened the Marketplace Portal
    When John requests a list of API-categories
    Then he should see on overview of the following API<categories>
      | Accounts               |
      | Payments               |
      | Confirmation of Funds  |
      | Foreign exchange rates |
      | ATM & Branch locations |
      | Lead Generation        |
      | Customer Identity      |
      | ERP Integration        |
