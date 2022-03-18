package com.choucair.formacion.definition;

import com.choucair.formacion.steps.PopupValidationSteps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class PopupValidationDefinition {
	
	@Steps
	PopupValidationSteps popupValidationSteps;

	@Steps
	com.choucair.formacion.steps.colorlibFormValidationSteps colorlibFormValidationsSteps;
	
	
	@Given("^Autentico en colorlib con usuario \"([^\"]*)\" y contraseña \"([^\"]*)\"$")
	public void autentico_en_colorlib_con_usuario_y_contraseña(String Usuario, String Clave) {

		popupValidationSteps.login_colorlib(Usuario, Clave);


	}

	@Given("^ingreso a la funcionalidad Forms Validation$")
	public void ingreso_a_la_funcionalidad_Forms_Validation()  {


		popupValidationSteps.ingresar_form_validation();
	}

	@When("^Diligencio el formulario Popup Validation$")
	public void diligencio_el_formulario_Popup_Validation( DataTable dtDatosForm) throws Throwable  {

		List<List<String>> data = dtDatosForm.raw();
		for(int i=1; i<data.size(); i++){
			colorlibFormValidationsSteps.diligenciar_popup_datos_tabla(data, i);
			try{
				Thread.sleep(5000);
			}catch(InterruptedException e){
			}
		}

	}

	@Then("^Verifico ingreso exitoso$")
	public void verifico_ingreso_exitoso()  {
	 colorlibFormValidationsSteps.verificar_ingreso_datos_formulario_exitoso();
	}

	@Then("^Verificar que se presente Globo Informativo de validación$")
	public void verificar_que_se_presente_Globo_Informativo_de_validación() throws Throwable {
		colorlibFormValidationsSteps.verificar_ingreso_datos_formulario_con_errores();
	}

}
