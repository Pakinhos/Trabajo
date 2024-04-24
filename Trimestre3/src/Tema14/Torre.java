package Tema14;

import java.util.ArrayList;

public class Torre {
	
	private ArrayList<Disco> Palo;
	
	public Torre ()
	{
		Palo=new ArrayList<Disco>();
	}
	
	public Disco cima()
	{
		return Palo.get(Palo.size()-1);
	}
	
	public void insertaDisco (Disco NuevoDisco)
	{
		if (Palo.isEmpty() || NuevoDisco.getTamaño()<=cima().getTamaño())
		{
			Palo.add(NuevoDisco);
		}
		else
		{
			System.out.println("No se puede realizar este movimiento.");
		}
	}
	
	public Disco quitarDisco()
	{
		if (!Palo.isEmpty())
		{
			return  Palo.remove(Palo.size()-1);
		}
		else
		{
			return null;
		}
	}
		
	public ArrayList<Disco> getTorre()
		{
		return Palo;
		}
	}


