package swag.steps.login;

import net.serenitybdd.annotations.Step;
import swag.pages.login.LoginPage;

public class LoginStep extends LoginPage {

    @Step("type username")
    public void type_user(String username){
        txt_User.sendKeys(username);
    }

    @Step("type password")
    public void type_pass(String password){
        txt_Pass.sendKeys(password);
    }

    @Step("click button login")
    public void click_login(){
        btn_login.click();
    }
}
