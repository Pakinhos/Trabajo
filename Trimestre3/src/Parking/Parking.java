package Parking;

import java.util.ArrayList;

public class Parking {
	
	private ArrayList<Plaza> Aparcamiento;
	
	public Parking() 
	{
		this.Aparcamiento=new ArrayList<>();
	}
	
	public Parking (int NPlazas)
	{
		this.Aparcamiento=new ArrayList<>();
		for (int i=0;i<NPlazas;i++)
		{
			Aparcamiento.add(new Plaza(i));
		}
	}
	
	public void agregarPlazas (int NPlazas)
	{
		int ultima=Aparcamiento.size()-1;
		for (int i=0;i<NPlazas;i++)
		{
			Aparcamiento.add(new Plaza(ultima+i+1));
		}
	}

	public boolean estacionarVehiculo(Vehiculo nuevovehiculo)
	{
		for(Plaza P :Aparcamiento)
		{
			if(!P.isOcupado())
			{
				P.OcuparPlaza(nuevovehiculo);
				return true;
			}
		}
		
		return false;
	}
	
	public boolean retirarVehiculo(String Matricula)
	{
		for(Plaza P :Aparcamiento)
		{
			if(P.isOcupado() && P.getvehiculo().getMatricula().equals(Matricula))
			{
				P.liberarPlaza();
				return true;
			}
		}
		
		return false;
	}
	
	public void imprimirEstado()
	{
		for (Plaza P:Aparcamiento)
		{
			System.out.println(P);
		}
	}
	
}
