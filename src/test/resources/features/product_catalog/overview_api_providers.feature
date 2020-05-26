@DIGI-28583
Feature: Overview API-providers
  As a portal user
  I want to see an overview of API-providers,
  So i have an understanding which API-providers are available.

  Scenario: List available API-providers
    Given John has opened the Marketplace Portal
    When John requests a list of API-providers
    Then he should see on overview of the following API-providers
      | provider              |
      | RBI                   |

