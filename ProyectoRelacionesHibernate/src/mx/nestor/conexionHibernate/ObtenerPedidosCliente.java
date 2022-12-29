package mx.nestor.conexionHibernate;

import java.util.Date;
import java.util.GregorianCalendar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class ObtenerPedidosCliente {
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

			miSession.beginTransaction();
			
			//Obtener el cliente de la tabla cliente de la BBDD
			//Cliente elCliente = miSession.get(Cliente.class, 5);

			Query<Cliente> consulta = miSession.createQuery("SELECT cl from Cliente cl JOIN FETCH cl.pedidos WHERE cl.id=:elClienteId",Cliente.class);
			consulta.setParameter("elClienteId", 5);
			
			Cliente elCliente = consulta.getSingleResult();
			
			System.out.println("Cliente: "+ elCliente);
			
			
		
			miSession.getTransaction().commit();
			
			miSession.close();
			
			System.out.println("Pedidos: "+ elCliente.getPedidos());

		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			
			miSession.close();
			miFactory.close();
		}
	}
	
}
