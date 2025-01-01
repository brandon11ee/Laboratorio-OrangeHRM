package swag.pages.recruitment;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class RecruitmentPage extends PageObject {

    @FindBy(xpath = "//span[text()='Recruitment']")
    protected WebElementFacade btn_Recruitment;

    @FindBy(xpath = "//i[@class='oxd-icon bi-plus oxd-button-icon']")
    protected WebElementFacade btn_add;

}
