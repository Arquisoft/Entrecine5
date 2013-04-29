Scenario: 1

Given una pelicula llamada Austin Powers 4 que se estrena el dia 5555555 hasta 6666666 para la sesion vespertina que dura desde las 5655555 hasta 5800000 con precio 50
When yo compro una entrada el dia 7000000 para la fila 20 asiento 1
Then la entrada deberia venderse

Scenario: 2

Given una pelicula llamada Austin Powers 4 que se estrena el dia 5555555 hasta 6666666 para la sesion vespertina que dura desde las 5655555 hasta 5800000 con precio 50
When yo compro una entrada el dia 5566666 para la fila 20 asiento 1
Then la entrada deberia venderse