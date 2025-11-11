Feature: Bank

  Scenario: Zustatek na uctu
    Given Uzivatel ma bankovni ucet s 1000 kc
    Then Na uzivatelskem uctu je 1000 kc

  Scenario: Ucet prevod a vyber penez
    Given Uzivatel ma bankovni ucet s 1500 kc
    When Uzivatel si na tento ucet prevede 1000 kc
    And Uzivatel si z tohoto uctu vybere 2000 kc
    Then Na uzivatelskem uctu je 500 kc

  Scenario: Ucet prevod a vyber penez - pokus o vyber vice penez nez je zustatek
    Given Uzivatel ma bankovni ucet s 1500 kc
    When Uzivatel si z tohoto uctu vybere 2000 kc
    And Uzivatel si na tento ucet prevede 1000 kc
    Then Na uzivatelskem uctu je 2500 kc

  Scenario: Prevod z uctu na ucet
    Given Uzivatel ma bankovni ucet s 2000 kc
    And Uzivatel ma druhy bankovni ucet s 1000 kc
    When Uzivatel prevede castku 2100 kc z prvniho na druhy bankovni ucet
    Then Na uzivatelskem uctu je 2000 kc
    And Na druhem uzivatelskem uctu je 1000 kc

  Scenario Outline: Ucet prevod a vyber penez - vice testovacich dat
    Given Uzivatel ma bankovni ucet s <pocatecniZustatek> kc
    When Uzivatel si na tento ucet prevede <prevod> kc
    And Uzivatel si z tohoto uctu vybere <vyber> kc
    Then Na uzivatelskem uctu je <konecnyZustatek> kc

    Examples:
      | pocatecniZustatek | prevod | vyber | konecnyZustatek |
      | 800               | 300    | 600   | 500             |
      | 538               | 0      | 538   | 0               |
      | 100               | 300    | 500   | 401             |