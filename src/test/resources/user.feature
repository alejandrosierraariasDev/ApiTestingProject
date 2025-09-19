Feature: API de Usuarios
  Como usuario de la API
  Quiero poder obtener información de usuarios
  Para validar que la funcionalidad de GET funciona correctamente

  Scenario: Obtener los datos de un usuario por su ID
    Given la API de usuarios está disponible
    When hago una petición GET al endpoint "/users/2"
    Then el código de estado de la respuesta debe ser 200
    And el "first_name" del usuario debe ser "Janet"