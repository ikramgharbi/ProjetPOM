package pageObject;

import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageHome {

	public WebDriver driver;

	// creation de constructeur
	public PageHome(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	// identification des elements (design pattern)
	@FindBy(how = How.XPATH, using = "//a[text()=' Signup / Login']")
	public static WebElement bt_signupLogin;

	@FindBy(how = How.XPATH, using = "//input[@data-qa='signup-name']")
	public static WebElement Name;

	@FindBy(how = How.XPATH, using = "//input[@data-qa='signup-email']")
	public static WebElement Email_adress;

	@FindBy(how = How.XPATH, using = "//button[@data-qa='signup-button']")
	public static WebElement bt_singup;

	@FindBy(how = How.ID, using = "id_gender2")
	public static WebElement Mrs_check;

	@FindBy(how = How.ID, using = "id_gender1")
	public static WebElement Mr_check;

	@FindBy(how = How.ID, using = "password")
	public static WebElement Password;

	@FindBy(how = How.XPATH, using = "//select[@id='days']")
	public static WebElement day;

	@FindBy(how = How.XPATH, using = "//select[@id='months']")
	public static WebElement Month;

	@FindBy(how = How.XPATH, using = "//select[@id='years']")
	public static WebElement Year;

	@FindBy(how = How.XPATH, using = "//input[@type='checkbox']")
	public static List<WebElement> check;

	@FindBy(how = How.XPATH, using = "//input[@id='first_name']")
	public static WebElement First_name;

	@FindBy(how = How.XPATH, using = "//input[@id='last_name']")
	public static WebElement Last_name;

	@FindBy(how = How.XPATH, using = "//input[@id='company']")
	public static WebElement Company;

	@FindBy(how = How.XPATH, using = "//input[@id='address1']")
	WebElement Address;

	@FindBy(how = How.XPATH, using = "//select[@id='country']")
	WebElement Country;

	@FindBy(how = How.XPATH, using = "//input[@id='state']")
	WebElement State;

	@FindBy(how = How.XPATH, using = "//input[@id='city']")
	WebElement City;

	@FindBy(how = How.XPATH, using = "//input[@id='zipcode']")
	WebElement Zipcode;

	@FindBy(how = How.XPATH, using = "//input[@id='mobile_number']")
	WebElement Mobile_Number;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Create Account')]")
	WebElement bt_createAccount;
	
	@FindBy(how=How.XPATH ,using ="//b[contains(text(),'Account Created!')]")
	WebElement txt_compte_creer;
	
	@FindBy(how=How.XPATH,using="//input[@data-qa='login-email']")
	public WebElement Email;
	
	@FindBy(how= How.XPATH, using="//input[@placeholder='Password']")
    public WebElement pass;
	
	@FindBy (how = How.XPATH , using= "//button[@data-qa='login-button']")
	public WebElement bt_Login;
	
	@FindBy(how=How.XPATH ,using ="//b[contains(text(),'Ikram')]")
	WebElement Nom_compte;
	
	// creation des methodes
	public void GetUrl(String url) {
		driver.get(url);
	}

	public void cliquerSignLogin() {
		bt_signupLogin.click();
	}

	public void saisirNom(String name) {
		Name.sendKeys(name);

	}

	public void saisirEmail(String mail) {
		Email_adress.sendKeys(mail);
	}

	public void cliquersignup() {
		bt_singup.click();

	}

	public void selectionnerGenre(String genre) {
		if (genre.equals("Mrs")) {
			Mrs_check.click();
		} else {
			Mr_check.click();
		}
	}

	public void saisirMot_de_passe(String pass) {
		Password.sendKeys(pass);
	}

	public void selectionnerDateNaissance(String jour, String mois, String annee) {
		Select Liste_day = new Select(day);
		Liste_day.selectByValue(jour);
		Select Liste_month = new Select(Month);
		Liste_month.selectByValue(mois);
		Select Liste_year = new Select(Year);
		Liste_year.selectByValue(annee);
	}

	public void cocherCases() {
		check.get(1).click();

		check.get(0).click();
	}
	
	public void cocheSeulCase() {
		
		check.get(0).click();
	}

	public void saisirFirstName(String first) {
		First_name.sendKeys(first);

	}

	public void saisirLast_name(String last) {
		Last_name.sendKeys(last);
	}

	public void SaisirCompany(String comp) {
		Company.sendKeys(comp);
	}

	public void SaisirAdress(String address) {
		Address.sendKeys(address);
	}

	public void selectionner_country(String pays) {
		Select ListCountry = new Select(Country);
		ListCountry.selectByValue(pays);

	}

	public void saisirState(String state) {
		State.sendKeys(state);
	}

	public void saisirCity(String city) {
		City.sendKeys(city);
	}

	public void saisirZipcode(String code) {
		Zipcode.sendKeys(code);
	}

	public void saisirMobilNumber(String tel) {
		Mobile_Number.sendKeys(tel);
	}

	public void cliqueBouton_createAccount() {
		bt_createAccount.click();
	}
	
	public String textAffiche() {
		String txt_obtenu = txt_compte_creer.getText();
		return txt_obtenu;

	}
	public void saisirAddressEmail(String addressEmail) {
		Email.sendKeys(addressEmail);
	}
	public void saisirPassword(String password) {
		pass.sendKeys(password);
	}
	public void cliquerLogin() {
		bt_Login.click();
	}
	public String NomAffiche() {
		String Nom_obtenu = Nom_compte.getText();
		return Nom_obtenu;
	}

}
