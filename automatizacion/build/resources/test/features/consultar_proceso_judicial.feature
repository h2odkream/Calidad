# language: es

  Característica: Proceso Judicial
    Karen como cudadano
    Quiere consultar sus procesos judiciales
    Para ver los avancesde su proceso judicial

    Escenario: Consulatr el proceso judicial 0000000000
      Dado que "Karen" esta consultando el proceso judicial
      Cuando selecciona Ciudad MEDELLIN, entidad TRIBUNAL ADMINISTRATIVO DE ANTIOQUIA (ESCRITURAL) y numero de radicado 0000000000
    Entonces debe poder activar la consulta
