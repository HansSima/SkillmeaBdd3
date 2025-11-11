Feature: Checkout

  Scenario: Nakup bananu
    Given Cena "bananu" je 10 kc
    When Uzivatel nakoupi "bananu" v poctu 5 ks
    Then Celkova cena bude 50 kc
