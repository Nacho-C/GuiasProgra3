package ej4;

public class Prueba
{

	public static void main(String[] args)
	{
		Departamento dep1 = new Departamento("Mantenimiento"), dep2 = new Departamento("Contabilidad");
		Empleado empTemp1 = new EmpleadoTemporario("Julio Garc�a", "Col�n 5561", 3209, 160, 80),
				empTemp2 = new EmpleadoTemporario("Mart�n Rodr�guez", "Mitre 3451", 3210, 100, 70),
				prin1 = new Principiante("Sandra Fernandez", "C�rdoba 3843", 1276, 6, 11500),
				prin2 = new Principiante("Luis G�mez", "Formosa 2354", 1544, 2, 10500),
				int1 = new Intermedio("Juan P�rez", "Matheu 2343", 1234, 7, 12000),
				int2 = new Intermedio("Lucas Ben�tez", "Castelli 4563", 1634, 12, 12000),
				exp1 = new Experto("Mara Anchorena", "Luro 3489", 9876, 18, 13000);
		dep1.agregarEmpleado(int1);
		dep1.agregarEmpleado(empTemp1);
		dep1.agregarEmpleado(empTemp2);
		dep2.agregarEmpleado(exp1);
		dep2.agregarEmpleado(prin1);
		dep2.agregarEmpleado(prin2);
		dep2.agregarEmpleado(int2);
		Empresa empresa = Empresa.getInstance();
		empresa.agregarDepartamento(dep1);
		empresa.agregarDepartamento(dep2);
		empresa.imprimirPlanillas();
	}

}
