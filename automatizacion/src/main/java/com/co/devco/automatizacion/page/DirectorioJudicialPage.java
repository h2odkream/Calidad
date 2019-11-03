package com.co.devco.automatizacion.page;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class DirectorioJudicialPage extends PageObject {
    public static final Target SEL_JURISDICCION = Target.the("Selecciona Jurusdiccion").locatedBy("//span[@id='formConsultaExterna:inputJurisdicciones']//span[@class='ui-button-text']");
    public static final Target SEL_CONSEJO = Target.the("Selecciona Consejo").locatedBy("//span[@id='formConsultaExterna:inputConsejos']//span[@class='ui-button-text']");
    public static final Target SEL_DISTRITO = Target.the("Selecciona Distrito").locatedBy("//span[@id='formConsultaExterna:inputDistritos']//span[@class='ui-button-text']");
    public static final Target SEL_CIRCUITO = Target.the("Selecciona Circuito").locatedBy("//input[@id='formConsultaExterna:inputCircuitos_hinput']");
    public static final Target SEL_AREA = Target.the("Selecciona Area").locatedBy("//input[@id='formConsultaExterna:inputArea_hinput']");
    public static final Target SEL_ENTIDAD = Target.the("Selecciona Entidad").locatedBy("//input[@id='formConsultaExterna:inputEntidads_hinput']");
    public static final Target SEL_ESPECIALIDAD = Target.the("Selecciona Especialidad").locatedBy("//input[@id='formConsultaExterna:inputEspecialidads_hinput']");
    public static final Target SEL_DEPARTAMENTO = Target.the("Selecciona Departamento").locatedBy("//input[@id='formConsultaExterna:inputDepartamentos_hinput']");
    public static final Target SEL_MUNICIPIO = Target.the("Selecciona Municipio").locatedBy("//input[@id='formConsultaExterna:inputMunicipios_hinput']");
    public static final Target BTN_BUSCAR = Target.the("Click en boton buscar").locatedBy("//span[contains(text(),'Buscar')]");
}
