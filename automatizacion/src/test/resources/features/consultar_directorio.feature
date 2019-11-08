# language: es

Característica: Directorio Nacional
  Karen como ciudadano
  Quiere consultar el directorio nacional
  Para acceder al directorio de despacho judicial

  Esquema del escenario: Consultar el directorio nacional
    Dado que "Karen" esta consultando el directorio nacional
    Cuando ingresa los datos a consultar
      | <Jurisdicion> | <Consejo> | <Distrito> | <Circuito> | <Area> | <Entidad> | <Especialidad> | <Departamneto> | <Municipio> |<ResultadoConsulta>|
    Entonces debe poder ver los resultados de la consulta

    Ejemplos:
      | Jurisdicion    | Consejo | Distrito | Circuito | Area                                                         | Entidad              | Especialidad   | Departamneto | Municipio                 |ResultadoConsulta|
      | CONSTITUCIONAL | CHOCÓ   | CHOCÓ    | QUIBDÓ   | ADMINISTRATIVA (OFICINAS Y UNIDADES DEL ÁREA ADMINISTRATIVA) | CORTE CONSTITUCIONAL | CONSTITUCIONAL | CHOCÓ        | CANTÓN DE SAN PABLO-CHOCÓ |0                |
