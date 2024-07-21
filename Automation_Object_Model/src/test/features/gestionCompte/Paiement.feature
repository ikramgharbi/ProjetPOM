
@Paiement_Produits
Feature: Gestion des produits
  En tant qu-Utilisateur,je veux pouvoir ajouter des produits à mon panier, afin de pouvoir les acheter ultérieurement.

  Background: 
  
    Given Saisir URL "https://automationexercise.com/"
    When Cliquez sur le bouton Signup_Login
    And saisir Laddress Email "gharbikrammmm0409185@outlook.fr" et mot de passe "ik1234#"
    And Cliquer sur le bouton Login
    Then verifier le Nom de compte "Ikram"
    Given cliquer sur le bouton Products
    And passer la souris sur le premier prouduit puis cliquer sur Add to cart
    And cliquer sur le bouton Continue Shopping
    And passer la souris sur le deuxieme prouduit puis cliquer sur Add to cart
    And cliquer sur le bouton View Cart
    And Verifier lajout de premier produit "Blue Top"
    And Verifier lajout de deuxieme produit "Men Tshirt"
  @paiement 
  Scenario: payer les produits
    And Cliquez sur bouton Proceed To Checkout
    Then verifier URL de la page Checkout "https://automationexercise.com/checkout"
    Given Entrez la description "testing" et cliquez sur Place Order
    And Entrez le nom de carte "Ikram" et numero du carte "3785"
    And saisir CVC "312" et date d Expiration en mois "02" et annee "2025"
    And cliquez sur bouton pay and Confirm Order 
    Then verifier le message "ORDER PLACED!"