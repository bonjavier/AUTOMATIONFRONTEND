Feature: yo como usuario quiero hacer login
  en el portal de SAUCEDEMO
  y así poder realizar mis funcionalidades

  Background: login
    Given el "usuario" esta en la pagina de login en Swag Labs

  @loginExitosoConCredenciales
  Scenario Outline: login en el portal de Swag Labs
    When el usuario ingresa los datos de <usuario> y <password>
    Then visualiza el modulo productos
    Examples:
      | usuario                 | password    |
      | standard_user | secret_sauce |
