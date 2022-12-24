package mx.nestor.pruebaannotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/* @Autowired 
 * 1 Crear clase + interfaz a inyectar (dependencia)
 * 2 Crear constructor para inyeccion en clase que lo solicite
 * 3 Configurar la depedencia con  @Autowired 
 * El paso 2 se puede utilizar en 
 * Constructor
 * Setter
 * Campos de clase */

/*@Qualifier se utiliza cuando se quiere especificar un bean en concreto
 * una interfaz implementa varias clases
 * */

/* @Scope("prototype")
 *  direccion en memoria diferentes
 * */
/*@PostConstruct -> Ejecucion de codigo despues de creacion del Bean
 * @PreDestroy  -> Ejecucion de codigo despues de apagado contenedor Bean
 * */
@Component
//@Scope("prototype")
public class ComercialExperimentado implements Empleados {
	
	@Autowired
	@Qualifier("informeFinancieroTrim4") //bean ID que debe utilizar
	private CreacionInformeFinanciero nuevoInforme;

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender, vender y vender";
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		//return "Informe generado por el comercial";
		return nuevoInforme.getInformeFinanciero();
	}
	
	// Ejecucion de codigo despues de creacion del Bean
	@PostConstruct
	public void ejecutaDespuesCreacion(){
		System.out.println("Ejecutado tras creacion del Bean");
		
	}
	// Ejecucion de codigo despues de apagado contenedor Bean
	@PreDestroy
	public void ejecutanAntesDestruccion() {
		System.out.println("Ejecutado antes de la destruccion");
	}
	/*
	 * 
	@Autowired
	public void setNuevoInforme(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}*/
	
	/*
	 * PASO 2
	 * PASO 3
	@Autowired
	public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) {
		super();
		this.nuevoInforme = nuevoInforme;
	}*/
	
	
}