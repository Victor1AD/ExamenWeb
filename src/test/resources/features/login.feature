#language: es
@testfeature
Característica: Login
  Yo, como usuario
  Quiero, tener una opción para iniciar sesión
  Para ver todos los items

  @test
  Escenario: Iniciar sesión
    Dado que me encuentro en la página de login de Saucedemo
    Y doy click en iniciar sesion
    Cuando inicio sesión con las credenciales usuario: "leoalarcon185@gmail.com" y contraseña: "ExamenWeb185"
    Entonces valido que debería aparecer el título de "Productos Destacados"
    Y también valido que al menos exista un item