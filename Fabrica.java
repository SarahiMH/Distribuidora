public class Fabrica
{
	private String nombre;
	private String direccion;

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	public String getNombre()
	{
		return this.nombre;
	}
	public void setDireccion(String direccion)
	{
		this.direccion = direccion;
	}
	public String getDireccion()
	{
		return this.direccion;
	}
	public Vehiculo fabricarVehiculo()
	{
		System.out.println("La clase Fabrica esta ejecutando el método fabricarVehiculo");
	}
}
