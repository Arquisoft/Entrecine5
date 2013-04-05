# language: es
Característica: Reservas mediante tabla

  Escenario: Reservar varias butacas
    Dadas las siguientes butacas reservadas:
      |fila_butaca  | columna_butaca |
      | 5       | 3      |
      | 6       | 8      |
      | 10      | 4      |
    Cuando Yo voy a hacer una reserva
    Entonces las butacas ya ocupadas seran:
    |fila_butaca  | columna_butaca |
      | 5       | 3      |
      | 6       | 8      |
      | 10      | 4      |