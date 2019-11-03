package com.co.devco.automatizacion.page;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class ConsultarProcesosPage extends PageObject {
    public static final Target SEL_CIUDAD = Target.the("Select Box de Ciudad").locatedBy("//div//select[@name='ddlCiudad']");//.located(By.id("ddlCiudad"));
    public static final Target SEL_ENTIDAD = Target.the("Select Box de Entidad").located(By.id("ddlEntidadEspecialidad"));
    public static final Target SEL_NRO_RADICADO = Target.the("Select Box de Entidad").located(By.xpath("//div[@id='divNumRadicacion']//tr[.//h1[contains(.,'Número de Radicación')]]/following-sibling::tr[1]//input"));
    public static final Target TEXT_BARRA = Target.the("Text barra").located(By.xpath("//div[@id='ConsultarNum']"));

}
