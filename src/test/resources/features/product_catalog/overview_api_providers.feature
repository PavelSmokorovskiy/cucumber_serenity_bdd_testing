@DIGI-28583
Feature: Overview API-providers
  As a portal user
  I want to see an overview of API-providers,
  So i have an understanding which API-providers are available.

  Scenario: List available API-providers
    Given John has opened the Marketplace PortalP
    When John requests a list of API-Providers
    Then he should see on the left panel following API<providers>
      | AO Raiffeisenbank                |
      | Raiffeisenbank (Bulgaria) EAD    |
      | Raiffeisen Bank S.A.             |
      | Raiffeisen Banking Group Austria |
      | Priorbank JSC                    |
      | Raiffeisenbank A.S.              |
      | Tatra Banka, a.s.                |
      | Raiffeisenbank Austria d.d       |
      | Raiffeisen Bank Zrt.             |

    And he opens <provider>
      | AO Raiffeisenbank |
    Then he should see on overview of the following API<providers>
      | Lead Generation |

    And he opens <provider>
      | Raiffeisenbank (Bulgaria) EAD |
    Then he should see on overview of the following API<providers>
      | Accounts              |
      | Payments              |
      | Confirmation of Funds |

    And he opens <provider>
      | Raiffeisen Bank S.A. |
    Then he should see on overview of the following API<providers>
      | Accounts              |
      | Payments              |
      | Confirmation of Funds |

    And he opens <provider>
      | Raiffeisen Banking Group Austria |
    Then he should see on overview of the following API<providers>
      | Accounts              |
      | Payments              |
      | Confirmation of Funds |

    And he opens <provider>
      | Priorbank JSC |
    Then he should see on overview of the following API<providers>
      | Foreign exchange rates |
      | ATM & Branch locations |
      | Lead Generation        |

    And he opens <provider>
      | Raiffeisenbank A.S. |
    Then he should see on overview of the following API<providers>
      | Accounts              |
      | Payments              |
      | Confirmation of Funds |

    And he opens <provider>
      | Tatra Banka, a.s. |
    Then he should see on overview of the following API<providers>
      | Accounts              |
      | Payments              |
      | Confirmation of Funds |

    And he opens <provider>
      | Raiffeisenbank Austria d.d |
    Then he should see on overview of the following API<providers>
      | Accounts              |
      | Payments              |
      | Confirmation of Funds |

    And he opens <provider>
      | Raiffeisen Bank Zrt. |
    Then he should see on overview of the following API<providers>
      | Accounts              |
      | Payments              |
      | Confirmation of Funds |
