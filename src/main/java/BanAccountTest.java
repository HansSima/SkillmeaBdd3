import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import product.BankAccount;
import static org.junit.jupiter.api.Assertions.*;

public class BanAccountTest {
    BankAccount prvniBankovniUcet;

    @Given("Uzivatel ma bankovni ucet s {int} kc")
    public void uzivatelMaBankovniUcetSKc(int pocatecniZustatekNaUctu) {
       prvniBankovniUcet = new BankAccount(pocatecniZustatekNaUctu);
    }

    @Then("Na uzivatelskem uctu je {int} kc")
    public void naUzivatelskemUctuJeKc(int predpokladanyZustatekNaUctu) {
        assertEquals(predpokladanyZustatekNaUctu, prvniBankovniUcet.getAccountBalance(), "Test spadl");
    }


    @When("Uzivatel si na tento ucet prevede {int} kc")
    public void uzivatelSiNaTentoUcetPrevedeKc(int castkaKPrevodu) {
        prvniBankovniUcet.transfer(castkaKPrevodu);
    }

    @And("Uzivatel si z tohoto uctu vybere {int} kc")
    public void uzivatelSiZTohotoUctuVybereKc(int castkaKVyberu) {
        prvniBankovniUcet.withdraw(castkaKVyberu);
    }

}
