#language:es

Característica:Verificar el funcionamiento del modulo de compras
  Como usuario de la aplicacion
  Quiero realizar agregar articulos al carrito
  Para finalizar mi compra

  Antecedentes:
    Dado que el usuario esta logueado en la app

  Escenario:compra exitosa
    Dado que el usuario los productos
      | Sauce Labs Fleece Jacket          |
      | Sauce Labs Onesie                 |
      | Test.allTheThings() T-Shirt (Red) |
    Cuando el usuario completa la compra
    Entonces se observa una pantalla con el mensaje "CHECKOUT: COMPLETE!"