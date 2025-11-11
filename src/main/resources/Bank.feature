Feature: Bank

  Scenario: Zustatek na uctu
    Given Uzivatel ma bankovni ucet s 1000 kc
    Then Na uzivatelskem uctu je 1000 kc

  Scenario: Ucet prevod a vyber penez
    Given Uzivatel ma bankovni ucet s 1500 kc
    When Uzivatel si na tento ucet prevede 1000 kc
    And Uzivatel si z tohoto uctu vybere 2000 kc
    Then Na uzivatelskem uctu je 500 kc