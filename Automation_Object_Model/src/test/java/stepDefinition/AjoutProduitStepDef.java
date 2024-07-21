package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import hooks.SetUp;
import io.cucumber.java.en.Given;
import pageObject.PageProduit;


public class AjoutProduitStepDef {
	
	WebDriver driver = SetUp.driver;
	PageProduit Product = new PageProduit(driver);
	

   @Given("cliquer sur le bouton Products")
    public void cliquer_sur_le_bouton_products() {
    Product.CliquerBt_Products();
   }

   @Given("passer la souris sur le premier prouduit puis cliquer sur Add to cart")
   public void passer_la_souris_sur_le_premier_prouduit_puis_cliquer_sur_add_to_cart() {
    Product.ajouter_produit1();
     }

   @Given("cliquer sur le bouton Continue Shopping")
   public void cliquer_sur_le_bouton_continue_shopping() {
   Product.CliquerBt_ContinuerShopping();
   }

   @Given("passer la souris sur le deuxieme prouduit puis cliquer sur Add to cart")
   public void passer_la_souris_sur_le_deuxieme_prouduit_puis_cliquer_sur_add_to_cart() {
	  Product.ajouter_produit2();
   }

   @Given("cliquer sur le bouton View Cart")
   public void cliquer_sur_le_bouton_Viewcart() {
    Product.CliquerSurViewCart();
}

   @Given("Verifier lajout de premier produit {string}")
   public void verifier_lajout_de_premier_produit(String string) {
	  Assert.assertEquals(string, Product.produit1Affiche());
	  
   }
   

   @Given("Verifier lajout de deuxieme produit {string}")
    public void verifier_lajout_de_deuxieme_produit(String string) {
	   Assert.assertEquals(string, Product.produit2Affiche());
	   }
}

