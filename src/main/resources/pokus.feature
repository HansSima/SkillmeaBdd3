Feature: pokus

#Toto je komentar

  Scenario: Pokusny test 1
    Given Toto je nastaveni pocatecnich podminek
    And Toto je dalsi nastaveni pocatecnich podminek
    When Toto je akcni krok
    And Toto je dalsi akcni krok
    Then Toto je overovaci krok
    And Toto je dalsi overovaci krok

  Scenario: Pokusny test 2
    Given Toto je nastaveni pocatecnich podminek
    When Toto je dalsi akcni krok
    Then Toto je dalsi overovaci krok

  #UserStory: Jako uzivatel zadam dve cisla a vysledek souctu cisel se mi zobrazi na kalkulacce
  Scenario: Kalkulacka - 1
    Given Uzivatel ma zadany dve cisla 5 a 8
    When Uzivatel secte tato dve cisla
    Then Uzivatel vidi na kalkulacce vysledek 13

