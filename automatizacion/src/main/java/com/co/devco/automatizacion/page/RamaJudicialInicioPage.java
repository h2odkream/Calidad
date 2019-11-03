package com.co.devco.automatizacion.page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://ramajudicial.gov.co/")
public class RamaJudicialInicioPage  extends PageObject{
    public static final Target BTN_CONSULTAR_PROCESOS = Target.the("Boton consulta de procesos")
            .locatedBy("//*[text()=' Consulta de Procesos ']");

}
