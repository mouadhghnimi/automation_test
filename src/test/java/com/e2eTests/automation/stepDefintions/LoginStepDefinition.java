package com.e2eTests.automation.stepDefintions;
import com.e2eTests.automation.page_objects.LoginPage;
import com.e2eTests.automation.utils.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;


public class LoginStepDefinition {

    public LoginPage loginPage;
    public LoginStepDefinition(){
        loginPage = new LoginPage();
    }

    @Given("Je visite l'application NopCommerce")
    public void je_visite_l_application_nop_commerce() {

        Setup.getDriver().get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

    }
    @When("Je Saisi l'adresse mail")
    public void je_saisi_l_adresse_mail(String email) {
        loginPage.getEmail().clear();
        loginPage.getEmail().sendKeys(email);
    }

    @When("Je Saisis le login")
    public void je_saisis_le_login(String password) {
        loginPage.getPassword().clear();
        loginPage.getPassword().sendKeys(password);

    }


    @When("Je clique sur le boutton Login")
    public void je_clique_sur_le_boutton_login() {
        loginPage.getBtnLogin().click();

    }


    @Then("Je me redirige vers la page home")
    public void je_me_redirige_vers_la_page_home() {

    }
}
