
@authentification

  Feature: Authentification
    ETQ utilisateur je souhaite m'authentifier

@login-valide

  Scenario: Je Souhaite tester la page LOGIN

       Given Je visite l'application NopCommerce
       When  Je Saisi l'adresse mail
       And   Je Saisis le login
       And   Je clique sur le boutton Login
       Then  Je me redirige vers la page home