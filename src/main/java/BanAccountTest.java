import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import product.BankAccount;

public class BanAccountTest {


    @Given("Uzivatel ma bankovni ucet s {int} kc")
    public void uzivatelMaBankovniUcetSKc(int pocatecniZustatekNaUctu) {
        BankAccount prvniBankovniUcet = new BankAccount();

    }

    @Then("Na uzivatelskem uctu je {int} kc")
    public void naUzivatelskemUctuJeKc(int predpokladanyZustatekNaUctu) {


    }


}
