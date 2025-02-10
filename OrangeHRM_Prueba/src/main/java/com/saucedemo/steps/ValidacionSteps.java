package com.saucedemo.steps;

import com.saucedemo.pageObject.Validaciones;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ValidacionSteps {
    @Page
    Validaciones validacionesPage;

    @Step("Validar titulo de inicio sesion")
    public void validacionSesion(){
        Assert.assertTrue(
                validacionesPage.getDriver().findElement(
                        validacionesPage.getValidateSesion()
                ).isDisplayed()
        );

    }

    @Step("Validar Recruitmen")
    public void validacionRecruitment(){
        Assert.assertTrue(
                validacionesPage.getDriver().findElement(
                        validacionesPage.getValidateRecruiment()
                ).isDisplayed()
        );
    }

}
