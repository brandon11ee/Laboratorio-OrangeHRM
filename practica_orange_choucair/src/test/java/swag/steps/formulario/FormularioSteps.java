package swag.steps.formulario;
import org.openqa.selenium.Keys;
import net.serenitybdd.annotations.Step;
import swag.pages.dates.FormularyPage;

public class FormularioSteps extends FormularyPage {

    @Step("type firts name")
    public void name_Firts(String firts) {
        firts_Name.sendKeys(firts);
    }
    @Step("type middle name")
    public void two_name(String middle){
        middle_Name.sendKeys(middle);
    }

    @Step("type last name")
    public void tre_name(String last){
        last_Name.sendKeys(last);
    }

    @Step("click in the select work")
    public void selec_work(){
        btn_Select.click();
    }
    @Step("type in the email")
    public void type_email(String Email){
        email.sendKeys(Email);
    }
    @Step("type phone")
    public void type_Phone(String Number_phone){
        phone.sendKeys(Number_phone);
    }
    @Step("type keyword")
    public void type_keywork(String Type_Keyword){
        keywords.sendKeys(Type_Keyword);
    }
    @Step("type note")
    public void notes_type(String Type_Note){
        txt_note.sendKeys(Type_Note);
    }
    @Step("Click Button saved")
    public void buton_note(){
        btn_Save.click();
    }
}
