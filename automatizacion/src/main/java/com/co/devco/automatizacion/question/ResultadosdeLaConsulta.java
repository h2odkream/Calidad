package com.co.devco.automatizacion.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.devco.automatizacion.page.DirectorioJudicialPage.VALIDACION_DIRECTORIO;

public class ResultadosdeLaConsulta implements Question<Boolean> {

    private String resultado;

    public ResultadosdeLaConsulta(String resultado){
        this.resultado =resultado;
    }

    public static ResultadosdeLaConsulta es(String resultado){
        return new ResultadosdeLaConsulta(resultado);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        System.out.println("Texto: "+VALIDACION_DIRECTORIO.resolveFor(actor).getText());
        return resultado.equals(VALIDACION_DIRECTORIO.resolveFor(actor).getText());
    }
}
