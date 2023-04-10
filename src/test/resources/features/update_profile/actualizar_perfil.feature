# author: DiegoPinzon20
# date: 28/03/2023
# language: es

Característica: Actualizar perfil
  Yo como analista de negocio quiero actualizar los datos
  de mi perfil a través de la página web.

  @ActualizarPerfilBasico
  Escenario: Completar la actualización básica del perfil
    Dado que el usuario inicia sesión con las credenciales
      | usuario        | claveAcceso |
      | Schwarzenegger | Arnold123   |
    Cuando actualiza la información del perfil
      | nombre | apellido       | fechaNacimiento | pais           | genero |
      | Arnold | Schwarzenegger | 20/12/1947      | Estados Unidos | M      |
    Entonces debería ver el mensaje
      | Tu información se guardó correctamente |
      | Información guardada con exito.        |