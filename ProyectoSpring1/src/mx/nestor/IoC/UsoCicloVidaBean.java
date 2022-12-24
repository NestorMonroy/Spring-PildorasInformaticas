package mx.nestor.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoCicloVidaBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Cargar el xml de configuracion
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext3.xml");
		
		//Obtencion del bean
		
		Empleados juan = contexto.getBean("miEmpleado", Empleados.class);
		
		System.out.println(juan.getInforme());
		
		contexto.close();
	}

}
