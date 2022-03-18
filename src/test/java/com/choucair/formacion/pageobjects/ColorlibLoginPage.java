package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;


@DefaultUrl("https://colorlib.com/polygon/metis/login.html")
public class ColorlibLoginPage extends PageObject {

	//Campo Usuario
	@FindBy(xpath = "//*[@id='login']/form/input[1]")
	public WebElementFacade txtUsername;
	
	@FindBy(xpath = "//*[@id='login']/form/input[2]")
	public WebElementFacade txtPassword;
	
	@FindBy(xpath = "//*[@id='login']/form/button")
	public WebElementFacade btnSignIn;
	
	@FindBy(xpath = "//*[@id='bootstrap-admin-template']")
	public WebElementFacade lblHomePpal;

	



	public void verificarHome() {
		// TODO Auto-generated method stub
		String labelv = "Bootstrap-Admin-Template"; //Este es el valor que tiene la pagina
		String strMensaje = lblHomePpal.getText();  // Este es el valor que usamos para la automatización
		assertThat(strMensaje, containsString(labelv));  //Comparamos si los valores de labelv y strMensaje son iguales
		
		
	}


	public void IngresarDatos(String strUsuario, String strPass) {

		txtUsername.sendKeys(strUsuario);
		txtPassword.sendKeys(strPass);
		btnSignIn.click();


	}
}
