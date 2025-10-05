Feature: yo como usuario quiero hacer login
  en el portal de SAUCEDEMO
  y así poder realizar mis funcionalidades

  @loginCompraExitosoConCredenciales
  Scenario: login en el portal de Swag Labs
    Given el "usuario" esta en la pagina de login en Swag Labs
    When el usuario ingresa los datos de standard_user y secret_sauce
    And visualiza y agrega los productos al carrito
    And procede al checkout
    And ingresa sus datos de envío y finaliza la compra:
      | nombre   | apellido | codigoPostal |
      | Javier   | Duran    | 12345        |
    And confirma la compra
    Then visualiza el mensaje de confirmación "Thank you for your order!"