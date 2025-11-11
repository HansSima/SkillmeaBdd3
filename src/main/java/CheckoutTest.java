import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutTest {
    @Given("Cena {string} je {int} kc")
    public void cenaJeKc(String arg0, int arg1) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("Uzivatel nakoupi {string} v poctu {int} ks")
    public void uzivatelNakoupiVPoctuKs(String arg0, int arg1) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("Celkova cena bude {int} kc")
    public void celkovaCenaBudeKc(int arg0) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
