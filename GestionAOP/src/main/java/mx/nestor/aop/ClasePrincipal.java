package mx.nestor.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import mx.nestor.aop.dao.ClienteDAO;
import mx.nestor.aop.dao.ClienteVIPDAO;

public class ClasePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Leer la configuracion de spring

		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(Configuracion.class);
		//Obtener el bean del contenedor de spring
		ClienteDAO elCliente = contexto.getBean("clienteDAO", ClienteDAO.class);

		ClienteVIPDAO elClienteVIP = contexto.getBean("clienteVIPDAO", ClienteVIPDAO.class);

		//llamar al metodo
		Cliente cl1 = new Cliente(); 
		
		elCliente.insertaCliente(cl1, "Normal"); //nombre del metodo que debe conincidir con la anotacion @Before
		
		elClienteVIP.insertaCliente(); //nombre del metodo que debe conincidir con la anotacion @Before
		
		//cerrar el contexto
		
		contexto.close();
	}

}
