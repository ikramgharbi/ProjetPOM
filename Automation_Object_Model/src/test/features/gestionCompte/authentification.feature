
@Authentification
Feature: Sautentifier a mon compte
  En tant que utilisateur, je veux acceder a mon compte.

  @s'autentifierAutomiatiomExercice
  Scenario: se connecter au site
    Given Saisir URL "https://automationexercise.com/"
    When Cliquez sur le bouton Signup_Login
    And saisir Laddress Email "gharbikrammmm0409185@outlook.fr" et mot de passe "ik1234#"
    And Cliquer sur le bouton Login
    Then verifier le Nom de compte "Ikram"
     