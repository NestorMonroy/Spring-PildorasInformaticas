package mx.nestor.pruebaannotations;

import org.springframework.beans.factory.annotation.Value;

/*
 * @Value permite inyectar el valor de las propiedades desde un archivo externo
*/
public class DirectorFinanciero implements Empleados {

	//Campo a utilizar para la inyeccion de depedencias
	private CreacionInformeFinanciero informeFinanciero;
	
	@Value("${email}")
	private String email;
	
	@Value("${nombreEmpresa}")
	private String nombreEmpresa;
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestion y direccion de operaciones financieras";
	}

	//
	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		return informeFinanciero.getInformeFinanciero();
	}
	
	//Constructor para la inyeccion de dependencias
	public DirectorFinanciero(CreacionInformeFinanciero informeFinanciero) {
		this.informeFinanciero = informeFinanciero;
	}

	public String getEmail() {
		return email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	
	
	
}
