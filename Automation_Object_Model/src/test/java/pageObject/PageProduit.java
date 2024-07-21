package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageProduit {
	public WebDriver driver;

	// creation de constructeur
	public PageProduit(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	// identification des elements (design pattern)
	@FindBy(how = How.XPATH, using = "//a[@href='/products']")
	public static WebElement bt_Products;
	
	@FindBy(how= How.XPATH, using= "//a[@href=\"/product_details/1\"]")
	public static  WebElement produit1;
	
	@FindBy(how =How.XPATH , using= "//a[normalize-space()='Add to cart']")
	public static WebElement bt_AddToCart;
	
	@FindBy (how =How.XPATH , using= "//button[@data-dismiss='modal']")
	public static WebElement bt_ContinuerShopping;
	
	@FindBy(how= How.XPATH, using= "//a[@href=\"/product_details/2\"]")
	public static WebElement produit2;
	
	@FindBy(how =How.XPATH , using= "//a[@data-product-id=\"2\"]")
	public static WebElement bt_AddToCart2;
	
	@FindBy (how =How.XPATH , using="//u[normalize-space()='View Cart']")
	public static WebElement bt_ViewCart;
	
    //identification deux produits panier
	
	// creation des methodes	
		public void CliquerBt_Products() {
			bt_Products.click();
		}
		public void ajouter_produit1() {
			Actions action = new Actions(driver);
			action.moveToElement(produit1).perform();
			bt_AddToCart.click();
		}

		public void CliquerBt_ContinuerShopping() {
			bt_ContinuerShopping.click();
		}
		
		public void ajouter_produit2() {
			Actions action = new Actions(driver);
			action.moveToElement(produit2).perform();
			bt_AddToCart2.click();
		}
		public void CliquerSurViewCart() {
			bt_ViewCart.click();
		}
		public String produit1Affiche() {
			String produit_obtenu = produit1.getText();
			
			return produit_obtenu;
		}
			
			public String produit2Affiche() {
				String produit_obtenu = produit2.getText();
				
				return produit_obtenu;
				}
}
	
