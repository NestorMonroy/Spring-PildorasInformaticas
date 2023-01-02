package mx.nestor.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import mx.nestor.controlador.entity.Cliente;

@Repository
public class ClienteDAOImpl implements ClienteDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Cliente> getClientes() {
		
		//Obtener la session
		Session miSession = sessionFactory.getCurrentSession();
		
		//Crear la consulta (Query)
		Query<Cliente> miQuery = miSession.createQuery("from Cliente",Cliente.class);

		//ejecutar la query y devolver resultados
		List<Cliente> clientes=miQuery.getResultList();
		
		return clientes;
	}

	
}
