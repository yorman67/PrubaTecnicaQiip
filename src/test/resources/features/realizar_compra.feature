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


  #Escenario : agregar al carrito
    #Dado el carrito se encuentra vacio
    #Cuando el usuario agrega un producto
    #Entonces aparece el producto en el carrito

  #Escenario : remover producto
    #Dado que el carrito tiene productos
    #Cuando el usuario remueva el producto
    #Entonces el producto desaparece del carrito

  #Escenario : filtro de la pagina
    #Dado que el usuario se en cuentra en la pagina de productos
    #Cuando el usuario seleccione una opcion del filtro
    #Entonces los productos se deberan organizar de la forma adecuada

  #Escenario : compra cancelada
    #Dado que el usuario ingreso los datos de la orden
    #Cuando el usuario cancela la orden
    #Entonces aparece la pantalla de productos

  #Escenario : descripcion del producto
    #Dado el usuario se encuentra en la pagina de productos
    #Cuando el usuario escoje un producto
    #Entonces el usuario observa la descripcion y valor del producto