package pageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PagePaiement {
	
	public WebDriver driver;

	// creation de constructeur
	
	public PagePaiement(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	// identification des elements (design pattern)
	@FindBy(how = How.XPATH, using ="//a[@class='btn btn-default check_out']")
	public WebElement bt_ProceedToCheckout;
	
	@FindBy(how=How.XPATH, using="//textarea[@name='message']")
	public WebElement description;
	
	@FindBy(how = How.XPATH, using="//a[normalize-space()='Place Order']")
	public WebElement bt_placeOrder;
		
	@FindBy(how=How.NAME,using="name_on_card")
	public WebElement Nom_de_Carte;
	
	@FindBy(how=How.NAME,using="card_number")
	public WebElement Num_de_Carte;
	
	@FindBy(how=How.NAME,using="cvc")
	public WebElement CVC;

	@FindBy(how=How.NAME,using="expiry_month")
	public WebElement mois;
	
	@FindBy(how=How.XPATH,using="//input[@class='form-control card-expiry-year']")
	public WebElement annee;

	@FindBy(how=How.ID,using="submit")
	public WebElement bt_ConfirmerOrdre;
	
	@FindBy(how=How.CSS,using="h2[data-qa='order-placed'] b")
	public WebElement txt_msg_Affiche;
	
	
	// creation des methodes
	public void GetUrl(String url) {
		driver.get(url);
	}

	public void click_Proceder_Au_Paiement() {
		bt_ProceedToCheckout.click();
	}
	public String GetUrl_Checkout() {
		return driver.getCurrentUrl();
	}

	public void saisir_description (String msg) {
		description.sendKeys(msg);
	}
	public void click_bt_PlaceOrder() {
		bt_placeOrder.click();
	}
	
	public void entrer_Nom_de_Carte_et_Num_de_Carte (String NomC, String NumC ) {
		Nom_de_Carte.sendKeys(NomC);
		Num_de_Carte.sendKeys(NumC);	
	}
	
	public void saisir_CVC_moisExp_anneeExp (String cvc, String Month, String year) {
	   CVC.sendKeys(cvc);	
	   mois.sendKeys(Month);
	  annee.sendKeys(year);
	}
	
	public void click_Paye_et_Confirmer() {
		bt_ConfirmerOrdre.click();
	}
	
	public String msgAffiche() {
		String msg_obtenu = txt_msg_Affiche.getText();
		return msg_obtenu;
	}

}
