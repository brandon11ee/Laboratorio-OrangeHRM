package swag.steps.recruitment;

import net.serenitybdd.annotations.Step;
import swag.pages.recruitment.RecruitmentPage;

public class RecruimentStep extends RecruitmentPage {

    @Step("click in the button Recruitment")
    public void click_Recruitment(){
        btn_Recruitment.click();
    }

    @Step("click in the button add")
    public void click_add(){
        btn_add.click();
    }

}
