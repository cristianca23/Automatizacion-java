package com.choucair.formacion.pageobjects;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

import javax.xml.xpath.XPath;
import org.openqa.selenium.WebElement;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class ColorlibMenuPage extends PageObject{


    //Menu Forms
    @FindBy(xpath = "//*[@id='menu']/li[6]/a")
    public WebElement menuForms;

    //sub-Menu General
    @FindBy(xpath = "//*[@id='menu']/li[6]/ul/li[1]/a")
    public WebElement menuFormGeneral;

    //sub-Menu validation
    @FindBy(xpath = "//*[@id='menu']/li[6]/ul/li[2]/a")
    public WebElement menuFormValidation;

    //form validation
    @FindBy(xpath = "//*[@id='content']/div/div/div[1]/div/div/header/h5")
    public WebElement lblFormValidation;


    public void menuFormValidation(){
        menuForms.click();
        menuFormValidation.click();
        String strMensaje = lblFormValidation.getText();
        assertThat(strMensaje, containsString("Popup Validation"));
    }

}
