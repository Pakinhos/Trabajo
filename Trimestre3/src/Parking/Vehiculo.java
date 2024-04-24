package Parking;

public class Vehiculo {
	
	//ATRIBUTOS
	private String Matricula;
	private String Tipo;
	
	//CONSTRUCTORES
	public Vehiculo (String Matricula, String Tipo)
	{
		this.Matricula=Matricula;
		this.Tipo=Tipo;
	}
	
	//GETTERS
	public String getMatricula ()
	{
		return this.Matricula;
	}
	
	public String getTipo ()
	{
		return this.Tipo;
	}

}
