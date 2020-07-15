@DIGI-28583
Feature: Overview API-providers
  As a portal user
  I want to see an overview of API-providers,
  So i have an understanding which API-providers are available.

  Background: API-Providers listed
    Given John has requested a list of API-providers
    And the following list of API<providers> is displayed
      | AO Raiffeisenbank                |
      | Raiffeisenbank (Bulgaria) EAD    |
      | Raiffeisen Bank S.A.             |
      | Raiffeisen Banking Group Austria |
      | Priorbank JSC                    |
      | Raiffeisenbank A.S.              |
      | Tatra Banka, a.s.                |
      | Raiffeisenbank Austria d.d       |
      | Raiffeisen Bank Zrt.             |

  Scenario: User requests AO Raiffeisenbank provider
    When he opens <provider>
      | AO Raiffeisenbank |
    Then he should see on overview of the following API<providers>
      | Lead Generation |

  Scenario: User requests Raiffeisenbank (Bulgaria) EAD provider
    When he opens <provider>
      | Raiffeisenbank (Bulgaria) EAD |
    Then he should see on overview of the following API<providers>
      | Accounts              |
      | Payments              |
      | Confirmation of Funds |

  Scenario: User requests Raiffeisen Bank S.A. provider
    When he opens <provider>
      | Raiffeisen Bank S.A. |
    Then he should see on overview of the following API<providers>
      | Accounts              |
      | Payments              |
      | Confirmation of Funds |

  Scenario: User requests Raiffeisen Banking Group Austria provider
    When he opens <provider>
      | Raiffeisen Banking Group Austria |
    Then he should see on overview of the following API<providers>
      | Accounts              |
      | Payments              |
      | Confirmation of Funds |

  Scenario: User requests Priorbank JSC provider
    When he opens <provider>
      | Priorbank JSC |
    Then he should see on overview of the following API<providers>
      | Foreign exchange rates |
      | ATM & Branch locations |
      | Lead Generation        |

  Scenario: User requests Raiffeisenbank A.S. provider
    When he opens <provider>
      | Raiffeisenbank A.S. |
    Then he should see on overview of the following API<providers>
      | Accounts              |
      | Payments              |
      | Confirmation of Funds |

  Scenario: User requests Tatra Banka, a.s. provider
    When he opens <provider>
      | Tatra Banka, a.s. |
    Then he should see on overview of the following API<providers>
      | Accounts              |
      | Payments              |
      | Confirmation of Funds |

  Scenario: User requests Raiffeisenbank Austria d.d provider
    When he opens <provider>
      | Raiffeisenbank Austria d.d |
    Then he should see on overview of the following API<providers>
      | Accounts              |
      | Payments              |
      | Confirmation of Funds |

  Scenario: User requests Raiffeisen Bank Zrt. provider
    When he opens <provider>
      | Raiffeisen Bank Zrt. |
    Then he should see on overview of the following API<providers>
      | Accounts              |
      | Payments              |
      | Confirmation of Funds |
