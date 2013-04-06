$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("\u0027es\\uniovi\\asw\\entrecine\\cucumber\\asientos.feature\u0027");
formatter.feature({
  "id": "asiento",
  "description": "",
  "name": "Asiento",
  "keyword": "Característica",
  "line": 2,
  "comments": [
    {
      "value": "# language: es",
      "line": 1
    }
  ]
});
formatter.scenario({
  "id": "asiento;consulta-una-butaca",
  "description": "",
  "name": "Consulta una butaca",
  "keyword": "Escenario",
  "line": 4,
  "type": "scenario"
});
formatter.step({
  "name": "una butaca en la fila 2 con el numero 5",
  "keyword": "Dada ",
  "line": 5
});
formatter.step({
  "name": "Yo pregunto si esta ocupada",
  "keyword": "Cuando ",
  "line": 6
});
formatter.step({
  "name": "el resultado sera 0",
  "keyword": "Entonces ",
  "line": 7
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 22
    },
    {
      "val": "5",
      "offset": 38
    }
  ],
  "location": "AsientosSteps.una_butaca_concreta(int,int)"
});
formatter.result({
  "duration": 290527963,
  "status": "passed"
});
formatter.match({
  "location": "AsientosSteps.Yo_pregunto_su_ocupacion()"
});
formatter.result({
  "duration": 38950,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 18
    }
  ],
  "location": "AsientosSteps.el_resultado_sera(int)"
});
formatter.result({
  "duration": 190218,
  "status": "passed"
});
formatter.uri("\u0027es\\uniovi\\asw\\entrecine\\cucumber\\reservaButacas.feature\u0027");
formatter.feature({
  "id": "reservas-mediante-tabla",
  "description": "",
  "name": "Reservas mediante tabla",
  "keyword": "Característica",
  "line": 2,
  "comments": [
    {
      "value": "# language: es",
      "line": 1
    }
  ]
});
formatter.scenario({
  "id": "reservas-mediante-tabla;reservar-varias-butacas",
  "description": "",
  "name": "Reservar varias butacas",
  "keyword": "Escenario",
  "line": 4,
  "type": "scenario"
});
formatter.step({
  "name": "las siguientes butacas reservadas:",
  "keyword": "Dadas ",
  "line": 5,
  "rows": [
    {
      "cells": [
        "fila_butaca",
        "columna_butaca"
      ],
      "line": 6
    },
    {
      "cells": [
        "5",
        "3"
      ],
      "line": 7
    },
    {
      "cells": [
        "6",
        "8"
      ],
      "line": 8
    },
    {
      "cells": [
        "10",
        "4"
      ],
      "line": 9
    }
  ]
});
formatter.step({
  "name": "Yo voy a hacer una reserva",
  "keyword": "Cuando ",
  "line": 10
});
formatter.step({
  "name": "las butacas ya ocupadas seran 3",
  "keyword": "Entonces ",
  "line": 11
});
formatter.match({
  "location": "ReservasSesion.las_siguientes_butacas_reservadas(ReservasSesion$Entry\u003e)"
});
formatter.result({
  "duration": 27983319,
  "status": "passed"
});
formatter.match({
  "location": "ReservasSesion.Yo_voy_a_hacer_una_reserva()"
});
formatter.result({
  "duration": 96015,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 30
    }
  ],
  "location": "ReservasSesion.las_butacas_ya_ocupadas_seran(int)"
});
formatter.result({
  "duration": 199276,
  "status": "passed"
});
formatter.uri("\u0027es\\uniovi\\asw\\entrecine\\cucumber\\reservaButacasOcupadas.feature\u0027");
formatter.feature({
  "id": "reservas-mediante-tabla",
  "description": "",
  "name": "Reservas mediante tabla",
  "keyword": "Característica",
  "line": 2,
  "comments": [
    {
      "value": "# language: es",
      "line": 1
    }
  ]
});
formatter.scenario({
  "id": "reservas-mediante-tabla;reservar-varias-butacas",
  "description": "",
  "name": "Reservar varias butacas",
  "keyword": "Escenario",
  "line": 4,
  "type": "scenario"
});
formatter.step({
  "name": "las siguientes butacas a reservar:",
  "keyword": "Dadas ",
  "line": 5,
  "rows": [
    {
      "cells": [
        "fila_butaca",
        "columna_butaca"
      ],
      "line": 6
    },
    {
      "cells": [
        "5",
        "3"
      ],
      "line": 7
    },
    {
      "cells": [
        "6",
        "8"
      ],
      "line": 8
    },
    {
      "cells": [
        "10",
        "4"
      ],
      "line": 9
    }
  ]
});
formatter.step({
  "name": "Yo voy a verificar la reserva",
  "keyword": "Cuando ",
  "line": 10
});
formatter.step({
  "name": "las butacas ocupadas seran:",
  "keyword": "Entonces ",
  "line": 11,
  "rows": [
    {
      "cells": [
        "fila_butaca",
        "columna_butaca"
      ],
      "line": 12
    },
    {
      "cells": [
        "5",
        "3"
      ],
      "line": 13
    },
    {
      "cells": [
        "6",
        "8"
      ],
      "line": 14
    },
    {
      "cells": [
        "10",
        "4"
      ],
      "line": 15
    }
  ]
});
formatter.match({
  "location": "ReservasSesionOcupadas.las_siguientes_butacas_a_reservar(ReservasSesionOcupadas$Entry\u003e)"
});
formatter.result({
  "duration": 4340138,
  "status": "passed"
});
formatter.match({
  "location": "ReservasSesionOcupadas.Yo_voy_a_verificar_la_reserva()"
});
formatter.result({
  "duration": 37590,
  "status": "passed"
});
formatter.match({
  "location": "ReservasSesionOcupadas.las_butacas_ocupadas_seran(ReservasSesionOcupadas$Entry\u003e)"
});
formatter.result({
  "duration": 1507251,
  "status": "passed"
});
formatter.uri("\u0027es\\uniovi\\asw\\entrecine\\cucumber\\reservas.feature\u0027");
formatter.feature({
  "id": "reserva",
  "description": "",
  "name": "Reserva",
  "keyword": "Característica",
  "line": 2,
  "comments": [
    {
      "value": "# language: es",
      "line": 1
    }
  ]
});
formatter.scenario({
  "id": "reserva;reservar-una-butaca",
  "description": "",
  "name": "Reservar una butaca",
  "keyword": "Escenario",
  "line": 4,
  "type": "scenario"
});
formatter.step({
  "name": "una reserva de 2 butacas con un precio de 4 euros",
  "keyword": "Dada ",
  "line": 5
});
formatter.step({
  "name": "Yo pregunto por el precio total",
  "keyword": "Cuando ",
  "line": 6
});
formatter.step({
  "name": "el resultado debe ser 8",
  "keyword": "Entonces ",
  "line": 7
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 15
    },
    {
      "val": "4",
      "offset": 42
    }
  ],
  "location": "ReservasSteps.una_reserva_de_butacas(int,double)"
});
formatter.result({
  "duration": 710147,
  "status": "passed"
});
formatter.match({
  "location": "ReservasSteps.Yo_pregunto_precio_total()"
});
formatter.result({
  "duration": 63406,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8",
      "offset": 22
    }
  ],
  "location": "ReservasSteps.el_resultado_debe_ser(double)"
});
formatter.result({
  "duration": 298461,
  "status": "passed"
});
formatter.uri("\u0027es\\uniovi\\asw\\entrecine\\cucumber\\tablaReservas.feature\u0027");
formatter.feature({
  "id": "reservas-mediante-tabla",
  "description": "",
  "name": "Reservas mediante tabla",
  "keyword": "Característica",
  "line": 2,
  "comments": [
    {
      "value": "# language: es",
      "line": 1
    }
  ]
});
formatter.scenario({
  "id": "reservas-mediante-tabla;reservar-varias-butacas",
  "description": "",
  "name": "Reservar varias butacas",
  "keyword": "Escenario",
  "line": 4,
  "type": "scenario"
});
formatter.step({
  "name": "las siguientes reservas:",
  "keyword": "Dadas ",
  "line": 5,
  "rows": [
    {
      "cells": [
        "butacas",
        "precio"
      ],
      "line": 6
    },
    {
      "cells": [
        "3",
        "3"
      ],
      "line": 7
    },
    {
      "cells": [
        "7",
        "2"
      ],
      "line": 8
    },
    {
      "cells": [
        "10",
        "5"
      ],
      "line": 9
    }
  ]
});
formatter.step({
  "name": "Yo busco el precio de la reserva 2",
  "keyword": "Cuando ",
  "line": 10
});
formatter.step({
  "name": "el resultado de ese valor debe ser 14",
  "keyword": "Entonces ",
  "line": 11
});
formatter.match({
  "location": "TablaReservasSteps.las_siguientes_reservas(TablaReservasSteps$Entry\u003e)"
});
formatter.result({
  "duration": 5019489,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 33
    }
  ],
  "location": "TablaReservasSteps.Yo_busco_el_precio_de_la_reserva(int)"
});
formatter.result({
  "duration": 249548,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "14",
      "offset": 35
    }
  ],
  "location": "TablaReservasSteps.el_resultado_debe_ser(double)"
});
formatter.result({
  "duration": 316124,
  "status": "passed"
});
});