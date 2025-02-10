package com.saucedemo.pageObject;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CerrarSesionPage extends PageObject {

    private final By logoImagen = By.xpath("//li[@class='oxd-userdropdown']//i");
    private final By btnCerrarSesion = By.xpath("//a[text()='Logout']/parent::li");

    public By getLogoImagen() {return logoImagen;}
    public By getBtnCerrarSesion(){return btnCerrarSesion;}
}
