package com.saucedemo.steps;

import com.saucedemo.pageObject.RecruitmentPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class RecruitmentSteps {

    @Page
    RecruitmentPage recruitmentPage;


    @Step("Abrir pagina para ingresar datos")
    public void abrirRecruitmentPage() {
        recruitmentPage.getDriver().findElement(recruitmentPage.getBtnRecruitment())
                .click();
        recruitmentPage.getDriver().findElement(recruitmentPage.getBtnAdd())
                .click();
    }

}
