package com.co.devco.automatizacion.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.util.List;

import static com.co.devco.automatizacion.page.DirectorioJudicialPage.*;
import static com.co.devco.automatizacion.page.DirectorioJudicialPage.BTN_BUSCAR;
import static com.co.devco.automatizacion.page.DirectorioJudicialPage.SEL_ENTIDAD;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ConsultarDirectorio implements Task {
    private List<String> datosConsulta;

    public ConsultarDirectorio(List<String> datosConsulta) {
        this.datosConsulta = datosConsulta;
    }

    public static Performable usando(List<String> datosConsulta) {
        return Tasks.instrumented(ConsultarDirectorio.class, datosConsulta);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SEL_JURISDICCION, isClickable()),
                Enter.theValue(datosConsulta.get(0)).into(SEL_JURISDICCION).thenHit(Keys.TAB),
                Enter.theValue(datosConsulta.get(1)).into(SEL_CONSEJO).thenHit(Keys.TAB),
                Enter.theValue(datosConsulta.get(2)).into(SEL_DISTRITO).thenHit(Keys.TAB),
                Enter.theValue(datosConsulta.get(3)).into(SEL_CIRCUITO).thenHit(Keys.TAB),
                Enter.theValue(datosConsulta.get(4)).into(SEL_AREA).thenHit(Keys.TAB),
                Enter.theValue(datosConsulta.get(5)).into(SEL_ENTIDAD).thenHit(Keys.TAB),
                Enter.theValue(datosConsulta.get(6)).into(SEL_ESPECIALIDAD).thenHit(Keys.TAB),
                Enter.theValue(datosConsulta.get(7)).into(SEL_DEPARTAMENTO).thenHit(Keys.TAB),
                Enter.theValue(datosConsulta.get(8)).into(SEL_MUNICIPIO).thenHit(Keys.ENTER),
                WaitUntil.the(BTN_BUSCAR, isVisible()),
                Click.on(BTN_BUSCAR)
        );
    }
}
