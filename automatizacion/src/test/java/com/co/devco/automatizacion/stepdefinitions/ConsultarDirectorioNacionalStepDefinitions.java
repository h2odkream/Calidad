package com.co.devco.automatizacion.stepdefinitions;

import com.co.devco.automatizacion.exceptions.NoSeConsultoNingunDirectorioException;
import com.co.devco.automatizacion.page.RamaJudicialInicioPage;
import com.co.devco.automatizacion.question.ResultadosdeLaConsulta;
import com.co.devco.automatizacion.task.ConsultarDirectorio;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.devco.automatizacion.exceptions.NoSeConsultoNingunDirectorioException.ERROR_AL_CONSULTAR_DIRECTORIO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import java.util.List;

import static com.co.devco.automatizacion.page.RamaJudicialInicioPage.BTN_CONSULTAR_DIRECTORIO;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class ConsultarDirectorioNacionalStepDefinitions {

    @Dado("que (.*) esta consultando el directorio nacional")
    public void queEstaConsultandoElDirectorioNacional(String actor) {
        theActorCalled(actor).attemptsTo(Open.browserOn().the(RamaJudicialInicioPage.class),
                WaitUntil.the(BTN_CONSULTAR_DIRECTORIO, isClickable()),
                Click.on(BTN_CONSULTAR_DIRECTORIO)
        );
    }

    @Cuando("ingresa los datos a consultar")
    public void ingresaLosDatosAConsultar(List<String> datos) {
        theActorInTheSpotlight().attemptsTo(
        ConsultarDirectorio.usando(datos)
        );
    }

    @Entonces("debe poder ver los resultados de la consulta")
    public void validarResultadosDeLaConsulta(String mensaje) {
        theActorInTheSpotlight().should(seeThat(
                ResultadosdeLaConsulta.es(mensaje)).orComplainWith(
                NoSeConsultoNingunDirectorioException.class, ERROR_AL_CONSULTAR_DIRECTORIO
                )
        );
    }

}
