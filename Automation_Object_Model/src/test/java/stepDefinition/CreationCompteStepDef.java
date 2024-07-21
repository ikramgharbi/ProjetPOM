package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import hooks.SetUp;
import io.cucumber.java.en.*;

import pageObject.PageHome;

public class CreationCompteStepDef {
	
	WebDriver driver = SetUp.driver;
	PageHome home = new PageHome(driver);
	
	@Given("Saisir URL {string}")
	public void saisir_url(String string) {
	  home.GetUrl(string);
	}

	@When("Cliquez sur le bouton Signup_Login")
	public void cliquez_sur_le_bouton_signup_login() {
	  home.cliquerSignLogin();
	}

	@When("Saisir le nom {string} et ladress Email {string}")
	public void saisir_le_nom_et_ladress_email(String string, String string2) {
	    home.saisirNom(string);
	    home.saisirEmail(string2);
	}

	@When("Cliquez sur le bouton Signup")
	public void cliquez_sur_le_bouton_signup() {
	    home.cliquersignup();
	}

	@When("selectionner le genre MR ou Mrs: {string} et Saisir un mot de passe {string}")
	public void selectionner_le_genre_mr_ou_mrs_et_saisir_un_mot_de_passe(String string, String string2) {
	    home.selectionnerGenre(string);
	    home.saisirMot_de_passe(string2);
	}

	@When("selectionner la date de naissance jour {string} , le mois {string},et lannee {string}")
	public void selectionner_la_date_de_naissance_jour_le_mois_et_lannee(String string, String string2, String string3) {
	   home.selectionnerDateNaissance(string, string2, string3);
	  
	}

	@When("Cocher les cases")
	public void cocher_les_cases() {
	   home.cocheSeulCase();
	}

	@When("Saisir First_name {string},Last_name {string} ,Company {string} et lAddress {string}")
	public void saisir_first_name_last_name_company_et_l_address(String string, String string2, String string3, String string4) {
	    home.saisirFirstName(string);
	    home.saisirLast_name(string2);
	    home.SaisirCompany(string3);
	    home.SaisirAdress(string4);
	}


	@When("selectionner Country {string} State {string}, City {string} et Zipcode {string} et saisir Mobile_Number {string}")
	public void selectionner_country_state_city_et_zipcode_et_saisir_mobile_number(String string, String string2, String string3, String string4, String string5) {
	    home.selectionner_country(string);
	    home.saisirState(string2);
	    home.saisirCity(string3);
	    home.saisirZipcode(string4);
	    home.saisirMobilNumber(string5);
	}

	@When("clique sur le bouton Create account")
	public void clique_sur_le_bouton_create_account() {
	    home.cliqueBouton_createAccount();
	}

	@Then("verifier le message afficher {string}")
	public void verifier_le_message_afficher(String string) {
	    Assert.assertEquals(string, home.textAffiche());
	}
	
	@When("saisir Laddress Email {string} et mot de passe {string}")
	public void saisir_laddress_email_et_mot_de_passe(String string, String string2) {
	    home.saisirAddressEmail(string);
	    home.saisirPassword(string2);
	}

	@When("Cliquer sur le bouton Login")
	public void cliquer_sur_le_bouton_Login() {
	  home.cliquerLogin(); 
	}

	@Then("verifier le Nom de compte {string}")
	public void verifier_le_Nom_de_compte(String string) {
	   Assert.assertEquals(string, home.NomAffiche());
	}
	
	

}
