package com.co.devco.automatizacion.exceptions;

public class NoSeConsultoNingunDirectorioException extends AssertionError{
    public static final String ERROR_AL_CONSULTAR_DIRECTORIO = "Error al consultar directorio, no se ingresaron los campos correctos";

    public NoSeConsultoNingunDirectorioException(String mensaje, Throwable causa){
        super(mensaje, causa);
    }
}
