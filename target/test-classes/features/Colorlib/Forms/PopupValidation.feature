#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Regresion
Feature: Formulario Popup Validation
Se espera que el usuario diligencie el formulario con los datos requeridos,
debe realizar validaciones de obligatoriedad, formato y longitud
el sistema debe presentar las validaciones respectivas para cada campo.

  @CasoExitoso
  Scenario: Diligenciamiento del campo popup exitoso, no se presenta ningún mensaje
  de validación
    Given Autentico en colorlib con usuario "demo" y contraseña "demo"
      And ingreso a la funcionalidad Forms Validation
    When Diligencio el formulario Popup Validation
        #Usaremos la tecnica datatable
      | Required | Select | MultipleS1 | MultipleS1 | Url               | Email           | Password1 | Password2  | Minsize | Maxsize | Number | IP          | Date       | Date Earlier |
      | Valor1   | Golf   | Tennis     | Golf       | http://valor1.com | valor1@gmail.com | valor1    |  valor1    | 123456  | 123456  | -99.99 | 200.200.5.4 | 2018-01-22 | 2012/09/12   |

    Then Verifico ingreso exitoso

  @CasoAlterno
  Scenario: Diligenciamiento del campo popup Erroneo, se presenta ningún mensaje
  de validación
    Given Autentico en colorlib con usuario "demo" y contraseña "demo"
    And ingreso a la funcionalidad Forms Validation
    When Diligencio el formulario Popup Validation
        #Usaremos la tecnica datatable
      | Required | Select | MultipleS1 | MultipleS1 | Url               | Email           | Password1 | Password2  | Minsize | Maxsize | Number | IP          | Date       | Date Earlier |
      |    | Golf   | Tennis     | Golf       | http://valor1.com | valor1@gmail.com | valor1    |  valor1    | 123456  | 123456  | -99.99 | 200.200.5.4 | 2018-01-22 | 2012/09/12   |
      |  Valor1  | Choose a sport   | Tennis     | Golf       | http://valor1.com | valor1@gmail.com | valor1    |  valor1    | 123456  | 123456  | -99.99 | 200.200.5.4 | 2018-01-22 | 2012/09/12   |

    Then Verificar que se presente Globo Informativo de validación

