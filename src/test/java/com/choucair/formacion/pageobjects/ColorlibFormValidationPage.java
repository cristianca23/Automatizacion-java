package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ColorlibFormValidationPage extends PageObject {

    //Campo Required
    @FindBy(xpath = "//*[@id='req']")
    public WebElementFacade txtRequired;

    //Campo de selección Multiple Sport
    @FindBy(id ="sport")
    public WebElementFacade cmbSport1;

    //Campo de selección Multiple Sport 2
    @FindBy(id ="sport2")
    public WebElementFacade cmbSport2;

    //Campo URL
    @FindBy(id="url1")
    public WebElementFacade txtUrl;

    //Campo Email1
    @FindBy(id="email1")
    public WebElementFacade txtEmail1;

    //Campo Password
    @FindBy(id="pass1")
    public WebElementFacade txtPass1;

    //Campo Password
    @FindBy(id="pass2")
    public WebElementFacade txtPass2;

    //Campo Minimum field size
    @FindBy(id="minsize1")
    public WebElementFacade txtMinsize1;

    //Campo Maximun field size
    @FindBy(name="maxsize1")
    public WebElementFacade txtMaxsize1;

    //Campo Numero
    @FindBy(name="numbe2r")
    public WebElementFacade txtNumber;

    //Campo IP
    @FindBy(name="ip")
    public WebElementFacade txtIp;

    //Campo Fecha
    @FindBy(id="date3")
    public WebElementFacade txtDate;

    //Campo Fecha antigua
    @FindBy(id="past")
    public WebElementFacade txtDateEarlier;

    //Boton Validar
    @FindBy(xpath = "//*[@id='popup-validation']/div[14]/input" )
    public WebElementFacade btnValidate;


    // Globo Informativo


    //Boton Validar
    @FindBy(xpath = "(//DIV[@class='formErrorContent'])[1]" )
    public WebElementFacade globoInformativo;



    // SE CREAN LOS METODOS PARA REALIZAR LAS ACCIONES EN CADA OBJETO

    // INTERACCION CON UN CAMPO PARA LLENAR
    public void Required(String datoPrueba){
        txtRequired.click();
        txtRequired.clear();
        txtRequired.sendKeys(datoPrueba);
    }


    // INTERACTUAR CON UN COMBO BOX (BOTON DE SELECCIÓN MULTIPLE)
    public void Select_Sport(String datoPrueba){
        cmbSport1.click();
        cmbSport1.selectByVisibleText(datoPrueba);
    }

    // INTERACCIÓN CON UN CAMPO DE SELECCIÓN MULTIPLE
    public void Multiple_Select(String datoPrueba){
        cmbSport2.selectByVisibleText(datoPrueba);
    }
    // INTERACCIÓN CON UN CAMPO DE TEXTO
    public void url(String datoPrueba){
        txtUrl.click();
        txtUrl.clear();
        txtUrl.sendKeys(datoPrueba);
    }

    // INTERACCION CAMPO URL
    public void email(String datoPrueba){
        txtEmail1.click();
        txtEmail1.clear();
        txtEmail1.sendKeys(datoPrueba);
    }

    // INTERACCION CAMPO CONTRASEÑA
    public void password(String datoPrueba){
        txtPass1.click();
        txtPass1.clear();
        txtPass1.sendKeys(datoPrueba);
    }

    // INTERACCION CAMPO CONTRASEÑA VALIDACION
    public void confirm_password(String datoPrueba){
        txtPass2.click();
        txtPass2.clear();
        txtPass2.sendKeys(datoPrueba);
    }

    // INTERACCION CAMPO MinSize
    public void minimum_field_size(String datoPrueba){
        txtMinsize1.click();
        txtMinsize1.clear();
        txtMinsize1.sendKeys(datoPrueba);
    }

    // INTERACCION CAMPO MinSize
    public void maximum_field_size(String datoPrueba){
        txtMaxsize1.click();
        txtMaxsize1.clear();
        txtMaxsize1.sendKeys(datoPrueba);
    }
    // INTERACCION CAMPO NUMERO
    public void number(String datoPrueba){
        txtNumber.click();
        txtNumber.clear();
        txtNumber.sendKeys(datoPrueba);
    }

    // INTERACCION CAMPO IP
    public void ip(String datoPrueba){
        txtIp.click();
        txtIp.clear();
        txtIp.sendKeys(datoPrueba);
    }

    // INTERACCION CAMPO DATE
    public void date(String datoPrueba){
        txtDate.click();
        txtDate.clear();
        txtDate.sendKeys(datoPrueba);
    }

    // INTERACCION CAMPO DATEEARLIER
    public void date_earlier(String datoPrueba){
        txtDateEarlier.click();
        txtDateEarlier.clear();
        txtDateEarlier.sendKeys(datoPrueba);
    }

    //BOTON VALIDATE
    public void validate(){

        btnValidate.click();
    }

    //METODO QUE ME VALIDA QUE NO EXISTA EL GLOBO INFORMATIVO
    public void form_sin_errores(){
        assertThat(globoInformativo.isCurrentlyVisible(), is(false));
    }

    //METODO QUE ME VALIDA QUE NO EXISTA EL GLOBO INFORMATIVO
    public void form_con_errores(){
        assertThat(globoInformativo.isCurrentlyVisible(), is(true));
    }

}
