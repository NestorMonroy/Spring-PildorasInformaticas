package mx.nestor.pruebaannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/* Archivos de configuracion 
 * 
 * @Bean, pedir beans al contenedor de Spring con codigo Java
 * 
 * Inyectar valor de propiedades desde archivos externos
 * @PropertySource: permite especificar la ruta a un archivo externo de propiedades
 * @Value permite inyectar el valor de las propiedades desde un archivo externo
 * */
@Configuration
@ComponentScan("mx.nestor.pruebaannotations")
@PropertySource("classpath:datosEmpresa.propiedades")
public class EmpleadosConfig {
	
	//Definir el bean para InformeFinanciertoDtoCompras
	
	@Bean
	public CreacionInformeFinanciero informeFinancieroDtoCompras() { // sera el id del bean inyectado
		return new InformeFinancieroDtoCompras();
	}
	
	//Definir el bean para DirectorFinanciero e inyectar dependencias
	//Este es el ID del bean
	@Bean
	public Empleados directorFinanciero() {
		return new DirectorFinanciero(informeFinancieroDtoCompras());
	}
	
}
