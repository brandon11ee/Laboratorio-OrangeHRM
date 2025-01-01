package swag.pages.login;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {

    @FindBy(xpath = "//input[@name='username']")
    protected WebElementFacade txt_User;

    @FindBy(xpath = "//input[@name='password']")
    protected WebElementFacade txt_Pass;

    @FindBy(xpath = "//button[@type='submit']")
    protected WebElementFacade btn_login;
}
