# author: DiegoPinzon20
# date: 12/03/2023
# language: es

Característica: Inicio de sesión
  Yo como analista de negocio necesito iniciar sesión en
  el sitio web con mis credenciales de acceso.

  @InicioSesionExitoso
  Escenario: Iniciar sesión exitosamente
    Dado que el usuario navega a la página de inicio de sesión
    Cuando ingresa las credenciales de acceso correctas
    Entonces debería ver la página principal
