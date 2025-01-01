package swag.definition.logindefinition;

import io.cucumber.java.en.Given;
import net.serenitybdd.annotations.Steps;
import org.htmlunit.jetty.util.security.Password;
import swag.steps.formulario.FormularioSteps;
import swag.steps.login.LoginStep;
import swag.steps.recruitment.RecruimentStep;
import swag.utils.dates.WebSite;

public class LoginDef {

    @Steps(shared = true)
    WebSite url;


    @Steps(shared = true)
    LoginStep login;

    public void userNavigateTo(){
        url.navigateTo("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Given("Since the user navigates to the login page")
    public void navigateLogin(){
        login.type_user("Admin");
        login.type_pass ("admin123");
        login.click_login();
        }


    @Steps(shared = true)
    RecruimentStep recruitmen;
    @Given("click on recruitment")
    public void navigateRecruitmen(){
        recruitmen.click_Recruitment();
        recruitmen.click_add();
    }

    @Steps(shared = true)
    FormularioSteps Formulario;
    @Given("writes names and dates")
    public void write_Name(){
        Formulario.name_Firts("jose");
        Formulario.two_name("araus");
        Formulario.tre_name("guerra");
        Formulario.selec_work();
        Formulario.type_email("jose@gmail.com");
        Formulario.type_Phone("675747473");
        Formulario.type_keywork("12344");
        Formulario.notes_type("my name is jose im work");
        Formulario.buton_note();
    }

    }


