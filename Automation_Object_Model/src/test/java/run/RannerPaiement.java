package run;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		  
		  tags = "@Paiement_Produits",
		  features = "src/test/features/gestionCompte",
		  glue = {"hooks","stepDefinition"},
		  
		  publish = true,
		  plugin= {"pretty","html:target/htmlreport.html","json:target/report","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		  
		  
		  
		  )




public class RannerPaiement {

}
