@Compte_Automation
Feature: Inscription dans un site Automation Exercie

  En tant que utilisateur, je veux creer un compte Automation Exercie

  @InscriptionSite
  Scenario: nouveeau compte 
    Given Saisir URL "https://automationexercise.com/"
    When Cliquez sur le bouton Signup_Login
    And  Saisir le nom "Ikram" et ladress Email "gharbikrammmm0409185@outlook.fr"
    And  Cliquez sur le bouton Signup
    And  selectionner le genre MR ou Mrs: "Mrs" et Saisir un mot de passe "ik1234#" 
    And  selectionner la date de naissance jour "9" , le mois "8",et lannee "1992" 
    And  Cocher les cases 
    And  Saisir First_name "Ikram",Last_name "Gharbi" ,Company "IkramCompany" et lAddress "125 avenue de paris tunis" 
    And  selectionner Country "India" State "tunis", City "tunis" et Zipcode "1002" et saisir Mobile_Number "204587965"
    And clique sur le bouton Create account
    Then verifier le message afficher "ACCOUNT CREATED!"