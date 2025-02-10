package com.saucedemo.steps;

import com.saucedemo.pageObject.CerrarSesionPage;
import net.thucydides.core.annotations.Step;

public class CerrarSesionStep {

    CerrarSesionPage cerrarSesionPage;
    @Step("Cerrar sesion")
    public void cerrarSesion() {
        cerrarSesionPage.getDriver().findElement(cerrarSesionPage.getLogoImagen()).click();
        cerrarSesionPage.getDriver().findElement(cerrarSesionPage.getBtnCerrarSesion()).click();

    }
}
