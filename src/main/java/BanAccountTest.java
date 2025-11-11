import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import product.BankAccount;
import static org.junit.jupiter.api.Assertions.*;

public class BanAccountTest {
    BankAccount prvniBankovniUcet;
    BankAccount druhyBankovniUcet;


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

    @And("Uzivatel ma druhy bankovni ucet s {int} kc")
    public void uzivatelMaDruhyBankovniUcetSKc(int pocatecniZustatekNaUctu) {
        druhyBankovniUcet = new BankAccount(pocatecniZustatekNaUctu);
    }

    @When("Uzivatel prevede castku {int} kc z prvniho na druhy bankovni ucet")
    public void uzivatelPrevedeCastkuKcZPrvnihoNaDruhyBankovniUcet(int castkaPrevodu) {
        boolean povedlSePrevod = prvniBankovniUcet.withdraw(castkaPrevodu);
        if(povedlSePrevod){
            druhyBankovniUcet.transfer(castkaPrevodu);
        }
    }

    @And("Na druhem uzivatelskem uctu je {int} kc")
    public void naDruhemUzivatelskemUctuJeKc(int predpokladanyZustateknaUctu) {
        assertEquals(predpokladanyZustateknaUctu, druhyBankovniUcet.getAccountBalance());
    }
}
