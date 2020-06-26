Feature: API-Marketplace user logout
  As a developer
  I want to log out from the portal,
  in order to end my work session.

  Background: User session exists
    Given Pavel is logged in on the portal with the following credentials
      | pavlo.smokorovskiy-external@rbinternational.com | Qwerty123* |
    And his first name and last name are displayed confirming he is logged-in
      | Pavel | Smokorovskiy |

  Scenario: Automatic logout
    When Pavel's web session expires
    Then he should be prompted to re-login

  Scenario: User requests logout
    When Pavel requests to log out
    Then he should be sent to the landing page