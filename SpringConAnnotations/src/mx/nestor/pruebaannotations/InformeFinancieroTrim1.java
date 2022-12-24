package mx.nestor.pruebaannotations;

import org.springframework.stereotype.Component;

//PASO 1 
@Component
public class InformeFinancieroTrim1 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Presentacion del informe financiero trim 1";
	}

}

/* @Autowired 
 * 1 Crear clase + interfaz a inyectar (dependencia)
 * 2 Crear constructor para inyeccion en clase que lo solicite
 * 3 Configurar la depedencia con  @Autowired 
 * EL paso 2 se puede utilizar en 
 * Constructor
 * Setter
 * Campos de clase */
