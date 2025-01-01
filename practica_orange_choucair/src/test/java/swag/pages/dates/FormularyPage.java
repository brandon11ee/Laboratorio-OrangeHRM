package swag.pages.dates;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class FormularyPage extends PageObject {

  @FindBy(xpath = "//input[@name='firstName']")
    protected WebElementFacade firts_Name;
  @FindBy(xpath = "//input[@name='middleName']")
    protected WebElementFacade middle_Name;
  @FindBy(xpath = "//input[@name='lastName']")
    protected WebElementFacade last_Name;
  @FindBy(xpath = "//i[@class = 'oxd-icon bi-caret-down-fill oxd-select-text--arrow']")
    protected WebElementFacade btn_Select;

  @FindBy(xpath = "(//input[@placeholder= 'Type here'])[1]")
    protected WebElementFacade email;

  @FindBy(xpath = "(//input[@placeholder= 'Type here'])[2]")
    protected WebElementFacade phone;

  @FindBy(xpath = "(//input[@class = 'oxd-input oxd-input--active'])[4]")
    protected WebElementFacade keywords;

  @FindBy(xpath = "//textarea[@class = 'oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']")
    protected WebElementFacade txt_note;
  @FindBy(xpath = "//button[@class = 'oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
    protected WebElementFacade btn_Save;

}
