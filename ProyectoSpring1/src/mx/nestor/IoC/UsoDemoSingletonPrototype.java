package mx.nestor.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletonPrototype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//carga de XML de configuracion
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		//peticion de beans al contenedor Spring
		
		SecretarioEmpleado Nestor1= contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);

		SecretarioEmpleado Nestor2= contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);

		System.out.println(Nestor1);
		System.out.println(Nestor2);
		
		
		if(Nestor1 == Nestor2) System.out.println("Apuntan al mismo objeto");
		else System.out.println("No se trata del mismo objeto");

	}

}
