@DIGI-37134
Feature: Show API-category description
  As a portal user
  I want to see a description of the API-category,
  So that I can determine if it matches the needed API functionality.

  Background: APIs listed
    Given John has opened the API-category overview

  Scenario: User requests Accounts category
    When John selects the API<category>
      | Accounts |
    Then he should see on overview of the following API<category>
      | Accounts |
    And he should see the <details> of the API-category
      | The Accounts API allows you to retrieve information regarding current and credit card accounts of a Raiffeisen customer. Through this API you will be able to access the following data: List of accounts, Account balances and Account transactions. * This API is read only and requires token authorization for a high security level. To retrieve real customer data, a PSD2 license from a competent authority is needed. |

  Scenario: User requests Payments category
    When John selects the API<category>
      | Payments |
    Then he should see on overview of the following API<category>
      | Payments |
    And he should see the <details> of the API-category
      | The Payments API allows you to perform money transfers from a Raiffeisen client's account. You have four different payment options: Internal Bank Transfer, Domestic payment, SEPA payment and Foreign payment (Any form which doesn't equal previous options). All payments types are supported as immediate or future dated. Payments between different currencies on the same account (currency conversions) are not supported. *To initiate payments, a PSD2 license from a competent authority is needed. |

  Scenario: User requests Confirmation of Funds category
    When John selects the API<category>
      | Confirmation of Funds |
    Then he should see on overview of the following API<category>
      | Confirmation of Funds |
    And he should see the <details> of the API-category
      | The Confirmation of Funds API allows you to certify the existence of sufficient funds on a customer account. It automatically generates a confirmation based on the customer’s account information and its transactions. *Consent from the Account owner is needed. To retrieve real customer data, a PSD2 license from a competent authority is needed. |

  Scenario: User requests Foreign exchange rates category
    When John selects the API<category>
      | Foreign exchange rates |
    Then he should see on overview of the following API<category>
      | Foreign exchange rates |
    And he should see the <details> of the API-category
      | Satisfy your customers by providing always “up-toDate” exchange rates. |

  Scenario: User requests ATM & Branch locations category
    When John selects the API<category>
      | ATM & Branch locations |
    Then he should see on overview of the following API<category>
      | ATM & Branch locations |
    And he should see the <details> of the API-category
      | The category General Information Services provides the customer with useful general information about the banking services. This includes lists and locations of ATMs, lists of bank branches etc. |

  Scenario: User requests Lead Generation category
    When John selects the API<category>
      | Lead Generation |
    Then he should see on overview of the following API<category>
      | Lead Generation |
    And he should see the <details> of the API-category
      | Enhance your customers’ experience by giving them access to Raiffeisen products. Based on this API you can apply for different banking products, such as new cards, issuing a loan or opening an account. Currently there are five possible categories of lead generation. |

  Scenario: User requests Customer Identity category
    When John selects the API<category>
      | Customer Identity |
    Then he should see on overview of the following API<category>
      | Customer Identity |
    And he should see the <details> of the API-category
      | The API enables you to perform quick identity verification of your customers from a reliable source. It allows you to instantly access specific personal data tied to customer’s bank account that has been already verified by Raiffeisen’s Know Your Customer (KYC) processes. |

  Scenario: User requests ERP Integration category
    When John selects the API<category>
      | ERP Integration |
    Then he should see on overview of the following API<category>
      | ERP Integration |
    And he should see the <details> of the API-category
      | As our business customer, you can perform banking operations straight from your internal enterprise applications such as ERPs or TMSs. The API helps you to get better overview of your finance and increase efficiency in daily processes by integrating the banking data to your existing enterprise systems. |
