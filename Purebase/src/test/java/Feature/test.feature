Feature: Categoria carrousel

  Como usuario quiero presionar click en el boton shop now


  Scenario: ir a la opcion compras desde el carrousel

    Given El usuario se encuentra en la pagina de inicio de la plataforma
    When hace click sobre el boton  shop now o sobre el carrousel
    Then se debe redirigir a la opcion comprar ahora