package ej1;

public class Usuario
{
	private String nombre, contraseña;

	public Usuario(String nombre, String contrasena) throws Exception
	{
		this.setNombre(nombre);
		this.setContraseña(contrasena);
	}

	public String getNombre()
	{
		return this.nombre;
	}

	public void setNombre(String nombre) throws NombreInvalidoException
	{
		if (nombre != null)
			if (!nombre.isEmpty())
			{
				this.nombre = nombre;
				System.out.println("Se ingresó correctamente el nombre\n");
			}
			else
				throw new NombreInvalidoException("El String pasado está vacio");
		else
			throw new NombreInvalidoException("El String pasado es null");
	}

	public String getContraseña()
	{
		return this.contraseña;
	}

	public void setContraseña(String contraseña) throws ContrasenaInvalidaException
	{
		if (contraseña != null)
			if (contraseña.length() > 6)
				if ((contraseña.charAt(0) <= 'Z' && contraseña.charAt(0) >= 'A')
						|| (contraseña.charAt(0) <= 'z' && contraseña.charAt(0) >= 'a'))
				{
					this.contraseña = contraseña;
					System.out.println("Se ingresó correctamente la contraseña\n");
				}
				else
					throw new ContrasenaInvalidaException("La contraseña debe empezar con una letra");
			else
				throw new ContrasenaInvalidaException("La contraseña debe tener más de 6 caracteres");
		else
			throw new ContrasenaInvalidaException("La contraseña pasada es null");

	}

}
