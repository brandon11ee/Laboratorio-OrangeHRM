# language: es

Característica: realizaremos un inicio de sesion de manera correcta con credenciales correctas brindadas por la pagina

  Escenario: iniciar la pagina de orangehrm y iniciar sesion
    Dado cargada la pagina de inicio de orangeHRM
    Cuando se ingresaran las credenciales correctas
    Entonces se debera mostrar la pagina principal de orangeHRM
