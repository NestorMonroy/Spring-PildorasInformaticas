package mx.nestor.IoC;

public class JefeEmpleado implements Empleados{
	//Creacion de campo tipo creacionInforme
	private CreacionInformes informeNuevo;
	
	public JefeEmpleado(CreacionInformes informeNuevo) {
		super();
		this.informeNuevo = informeNuevo;
	}

	public String getTareas() {
		return "Gestionar tareas";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe presentado por el jefe " + informeNuevo.getInforme();
	}
}
