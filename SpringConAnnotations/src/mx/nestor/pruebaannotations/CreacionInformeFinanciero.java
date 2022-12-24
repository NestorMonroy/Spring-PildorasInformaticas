package mx.nestor.pruebaannotations;

//PASO 1
public interface CreacionInformeFinanciero {
	public String getInformeFinanciero();

}

/* @Autowired 
 * 1 Crear clase + interfaz a inyectar (dependencia)
 * 2 Crear constructor para inyeccion en clase que lo solicite
 * 3 Configurar la depedencia con  @Autowired 
 * EL paso 2 se puede utilizar en 
 * Constructor
 * Setter
 * Campos de clase */
