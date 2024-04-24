package Parking;

public class Plaza {
	
	//ATRIBUTOS
	private int Numero;
	private boolean Ocupado;
	private Vehiculo vehiculo;
	
	//CONSTRUCTORES
	public Plaza (int Numero)
	{
		this.Numero=Numero;
		this.Ocupado=false;
		this.vehiculo=null;
	}
	
	//GETTERS
	public int getNumero()
	{
		return this.Numero;
	}
	
	public boolean getOcupado()
	{
		return this.Ocupado;
	}
	
	public Vehiculo getvehiculo()
	{
		return this.vehiculo;
	}
	
	public boolean OcuparPlaza(Vehiculo v1)
	{
		if (!Ocupado)
		{
			this.Ocupado=true;
			this.vehiculo=v1;
			return true;
		}
		
		else
		{
			return false;
		}
		
	}
	
	public Vehiculo liberarPlaza()
	{
		if (Ocupado)
		{
			Vehiculo temporal=this.vehiculo;
			this.Ocupado=false;
			this.vehiculo=null;
			return temporal;
		}
		
		else 
		{
			return null;
		}
	}
	
	public boolean isOcupado()
	{
		return Ocupado;
	}
	
	public String toString()
	{
		return "Plaza{" + "numero" + Numero + 
				" ocupada=" + Ocupado + 
				" vehiculo=" + vehiculo + "}";
	}
	
}
