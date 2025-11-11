import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import product.Checkout;
import static org.junit.jupiter.api.Assertions.*;

public class CheckoutTest {
    Checkout nakupniKosik;

    @Before
    public void totoSeProvedePredKazdymTestem(){
        nakupniKosik = new Checkout();
    }

    @After
    public void totoSeProvedePoKazdemTestu(){

    }

    @Given("Cena {string} je {int} kc")
    public void cenaJeKc(String jmenoProduktu, int cenaProduktu) {
        nakupniKosik.addItem(jmenoProduktu, cenaProduktu);
    }

    @When("Uzivatel nakoupi {string} v poctu {int} ks")
    public void uzivatelNakoupiVPoctuKs(String jmenoProduktu, int pocetKusu) {
        nakupniKosik.scanItems(jmenoProduktu, pocetKusu);
    }

    @Then("Celkova cena bude {int} kc")
    public void celkovaCenaBudeKc(int predpokladanaCena) {
        assertEquals(predpokladanaCena, nakupniKosik.totalCart());
    }

}
