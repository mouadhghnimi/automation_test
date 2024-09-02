package com.e2eTests.automation.page_objects;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class LoginPage extends BasePage {


/* Retrieve Email */

    @FindBy(how = How.ID, using = "Email")
    private static WebElement email;

    @FindBy(how = How.ID, using = "Password")
    private static WebElement password;

    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    private static WebElement btnLogin;

    public LoginPage() {

        super(Setup.getDriver());
    }

    public static WebElement getEmail() {
        return email;
    }

    public static WebElement getPassword() {
        return password;
    }
    public static WebElement getBtnLogin() {
        return btnLogin;
    }

}
