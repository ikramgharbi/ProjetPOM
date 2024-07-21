package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import hooks.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObject.PagePaiement;

public class PaiementStepDef {
	
	WebDriver driver = SetUp.driver;
	PagePaiement Checkout = new PagePaiement(driver);
	
	
	@Given("Cliquez sur bouton Proceed To Checkout")
	public void cliquez_sur_bouton_proceed_to_checkout() {
		Checkout.click_Proceder_Au_Paiement(); 
	}

	@Given("Entrez la description {string} et cliquez sur Place Order")
	public void entrez_la_description_et_cliquez_sur_place_order(String string) {
	   Checkout.saisir_description(string);
	   Checkout.click_bt_PlaceOrder();	
	}
	

	@Given("Entrez le nom de carte {string} et numero du carte {string}")
	public void entrez_le_nom_de_carte_et_numero_du_carte(String string, String string2) {
	    Checkout.entrer_Nom_de_Carte_et_Num_de_Carte(string, string2);
	}

	@Given("saisir CVC {string} et date d Expiration en mois {string} et annee {string}")
	public void saisir_cvc_et_date_d_expiration_en_mois_et_annee(String string, String string2, String string3) {
	   Checkout.saisir_CVC_moisExp_anneeExp(string, string2, string3);
	   
	}

	@Given("cliquez sur bouton pay and Confirm Order")
	public void cliquez_sur_bouton_pay_and_confirm_order() {
	   Checkout.click_Paye_et_Confirmer();
	}

	@Then("verifier le message {string}")
	public void verifier_le_message(String string) {
	   Assert.assertEquals(string, Checkout.msgAffiche());
	}
	
	@Then("verifier URL de la page Checkout {string}")
	public void verifier_url_de_la_page_checkout(String string) {
			Assert.assertEquals(string, Checkout.GetUrl_Checkout());
	}



}
