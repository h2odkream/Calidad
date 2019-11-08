package com.co.devco.automatizacion.stepdefinitions;

import com.co.devco.automatizacion.page.RamaJudicialInicioPage;
import com.co.devco.automatizacion.question.Texto;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.devco.automatizacion.page.ConsultarProcesosPage.*;
import static com.co.devco.automatizacion.page.RamaJudicialInicioPage.BTN_CONSULTAR_PROCESOS;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static org.hamcrest.core.StringContains.containsString;

public class ConsultarProcesoJudicialStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Dado("que (.*) esta consultando el proceso judicial")
    public void consultarProcesoJudicial(String actor) {
        theActorCalled(actor).attemptsTo(Open.browserOn().the(RamaJudicialInicioPage.class),
                WaitUntil.the(BTN_CONSULTAR_PROCESOS, isClickable()),
                Click.on(BTN_CONSULTAR_PROCESOS)
        );
    }
    @Cuando("selecciona Ciudad (.*), entidad (.*) y numero de radicado (.*)")
    public void ingresarCiudadEntidadRadicado(String ciudad, String entidad, String nroRadicado) {
        theActorInTheSpotlight().attemptsTo(
                SelectFromOptions.byVisibleText(ciudad).from(SEL_CIUDAD),
                SelectFromOptions.byVisibleText(entidad).from(SEL_ENTIDAD),
                Enter.theValue(nroRadicado).into(SEL_NRO_RADICADO),
                Click.on(SCROLL_BARRA)

        );
    }
    @Entonces("debe poder activar la consulta")
    public void verificarActivacionConsulta() {
        theActorInTheSpotlight().should(seeThat(
                "texto xyz",
                Texto.barra(),containsString("Deslice la barra a la derecha para iniciar la consulta."))
        );
    }

}
