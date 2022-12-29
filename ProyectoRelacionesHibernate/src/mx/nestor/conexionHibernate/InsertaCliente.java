package mx.nestor.conexionHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class InsertaCliente {
	public static void main(String[] args) {
		//Crear el SessionFactory
		SessionFactory miFactory = new Configuration()
											.configure("hibernate.cfg.xml")
											.addAnnotatedClass(Cliente.class)
											.addAnnotatedClass(DetallesCliente.class)
											.addAnnotatedClass(Pedido.class)
											.buildSessionFactory();
		//Crear objeto session
		Session miSession=miFactory.openSession();
		
		try {
			//Crear el objeto clientes
			Cliente cliente = new Cliente("Ejemplo2", "Monroy", "Gran Via");
			DetallesCliente detallescliente = new DetallesCliente("nestor.com.mx", "5555", "segundo cliente");
			
			//Asocial los objetos
			
			cliente.setDetallesCliente(detallescliente);
			
			miSession.beginTransaction();

			// Guarda la informacion en las dos tablas relacionadas
			
			miSession.save(cliente);
			
			miSession.getTransaction().commit();
			
			System.out.println("Registro insertado en BBDD");

			miSession.close();
			
		} finally {
			// TODO: handle finally clause
			miFactory.close();
		}
	}
	
}
