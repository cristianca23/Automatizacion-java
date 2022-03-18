package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.ColorlibLoginPage;

import com.choucair.formacion.pageobjects.ColorlibMenuPage;
import net.thucydides.core.annotations.Step;

public class PopupValidationSteps {
	
	ColorlibLoginPage colorlibLoginPage;
	ColorlibMenuPage  colorlibMenuPage;

	@Step
	public void login_colorlib(String strUsuario, String strPass){
		
		//Abrir el navegador en la URL de prueba
		colorlibLoginPage.open();
		
		// Ingresar usuario y contraseña : demo
		colorlibLoginPage.IngresarDatos(strUsuario,strPass);
		// Verificar autenticación (label en home)
		
		colorlibLoginPage.verificarHome();		
	}

	//ColorlibMenuPage INGRESAR AL  formulario Popup Validation

	@Step
	public void ingresar_form_validation(){

		colorlibMenuPage.menuFormValidation();


	}

}
