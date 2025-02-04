#language: es
@testfeature
Característica: Product - Store
  Como automatizador principal de NTT, se ha encargado la misión de Automatizar las Pruebas de Regresión de una Tienda en Línea.

  @test
  Escenario: Validación del precio de un producto
    Dado estoy en la página de la tienda
    Y me logueo con mi usuario "leoalarcon185@gmail.com" y clave "ExamenWeb185"
    Cuando navego a la categoria Clothes y subcategoria Men
    Y agrego 2 unidades del primer producto al carrito
    Entonces valido en el popup la confirmación del producto agregado "Producto añadido correctamente a su carrito de compra"
    Y valido en el popup que el monto total sea calculado correctamente "38,24 PEN"
    Cuando finalizo la compra
    Entonces valido el titulo de la pagina del "CARRITO"
    Y vuelvo a validar el calculo de precios en el carrito "38,24 PEN"

  @test
  Escenario: Prueba erronea
    Dado estoy en la página de la tienda
    Y me logueo con mi usuario "leoalarcon185@gmail.com" y clave "ExamenWeb1853"


  @test
  Escenario: Prueba de categoria erronea
    Dado estoy en la página de la tienda
    Y me logueo con mi usuario "leoalarcon185@gmail.com" y clave "ExamenWeb185"
    Cuando navego a la categoria autos



