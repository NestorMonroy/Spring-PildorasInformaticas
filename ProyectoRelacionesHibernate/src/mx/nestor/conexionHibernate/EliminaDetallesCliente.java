package mx.nestor.conexionHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EliminaDetallesCliente {
	public static void main(String[] args) {
		//Crear el SessionFactory
		SessionFactory miFactory = new Configuration()
											.configure("hibernate.cfg.xml")
											.addAnnotatedClass(Cliente.class)
											.addAnnotatedClass(DetallesCliente.class)
											.buildSessionFactory();
		//Crear objeto session
		Session miSession=miFactory.openSession();
		
		try {
			
			miSession.beginTransaction();
			
			DetallesCliente detalleDelCliente = miSession.get(DetallesCliente.class, 4);
			
			detalleDelCliente.getElCliente().setDetallesCliente(null);
			
			
			if(detalleDelCliente != null) {

				miSession.delete(detalleDelCliente);
			}

			miSession.getTransaction().commit();
			
			if(detalleDelCliente != null) System.out.println("Registro eliminado correctamente en BBDD");
			else System.out.println("Nada que eliminar");
			
			miSession.close();
			
		} finally {

			miFactory.close();
		}
	}
	
}
