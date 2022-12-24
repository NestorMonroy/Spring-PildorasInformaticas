package mx.nestor.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		// Creacion de objetos
		Empleados Empleado1 = new DirectorEmpleado();
		
		// Uso de los objetos
		System.out.println(Empleado1.getTareas());*/
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		/*
		Empleados Nestor= contexto.getBean("miEmpleado", Empleados.class);
		
		System.out.println(Nestor.getTareas());
		
		System.out.println(Nestor.getInforme());
		*/
		/*
		SecretarioEmpleado Nestor2= contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);

		SecretarioEmpleado Nestor3= contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);

		
		System.out.println(Nestor2.getTareas());
		
		System.out.println(Nestor2.getInforme());
		
		System.out.println("Email: " + Nestor2.getEmail());
		
		System.out.println("Empresa: " + Nestor2.getNombreEmpresa());
		
		System.out.println("Email: " + Nestor3.getEmail());
		*/
		
		DirectorEmpleado Nestor2= contexto.getBean("miEmpleado", DirectorEmpleado.class);
		
		System.out.println("Email: " + Nestor2.getEmail());
		
		System.out.println("Empresa: " + Nestor2.getNombreEmpresa());


		contexto.close();

	}

}
