package mx.nestor.pruebaannotations;

import org.springframework.stereotype.Component;

/*@Qualifier se utiliza cuando se quiere especificar un bean en concreto
 * varias clases implementan una interfaz 
 * 
 * */
@Component
public class InformeFinancieroTrim2 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Presentacion del informe trimestre 2";
	}

}
