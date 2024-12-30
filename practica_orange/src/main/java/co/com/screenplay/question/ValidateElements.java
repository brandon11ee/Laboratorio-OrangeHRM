package co.com.screenplay.question;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.core.pages.ResolvableElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

@AllArgsConstructor
@Slf4j
public class ValidateElements implements Question<Boolean> {
    private static final ResolvableElement TXT_RANDOM_NAME_BTN = ;
    private String validTextSubElementBtn;

    @Override
    @Subject("{0} se realiza validación del elemento capturado en header con dicho parametro #validTextSubElementBtn")
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String validTextBtnHeader = TXT_RANDOM_NAME_BTN.resolveFor(actor).getText();
        if (validTextBtnHeader != null && validTextSubElementBtn.equals(validTextBtnHeader)) {
            log.info(validTextBtnHeader);
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static ValidateElementsTextBtn witchParams(String validTextSubElementBtn) {
        return new ValidateEljementsTextBtn(validTextSubElementBtn);
    }
    }
