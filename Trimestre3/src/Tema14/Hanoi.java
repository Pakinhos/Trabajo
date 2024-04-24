package Tema14;

public class Hanoi {
	
	private Torre TorreA;
	private Torre TorreB;
	private Torre TorreC;
	
	public Hanoi (int NDiscos)
	{
		TorreA=new Torre();
		TorreB=new Torre();
		TorreC=new Torre();
		
		for (int i=NDiscos;i>0;i--)
		{
			TorreA.insertaDisco(new Disco(i));
		}
	}
	
	public void Mueve(char Origen, char Destino) 
	{
		Torre torreOrigen;
		Torre torreDestino;
		
		if (Origen=='A')
		{
			torreOrigen=TorreA;
		}
		
		else if (Origen=='B')
		{
			torreOrigen=TorreB;
		}
		
		else
		{
			torreOrigen=TorreC;
		}
		
		if (Destino=='A')
		{
			torreDestino=TorreA;
		}
		
		else if (Destino=='B')
		{
			torreDestino=TorreB;
		}
		
		else
		{
			torreDestino=TorreC;
		}
		
		Disco mover=torreOrigen.cima();
		if (mover !=null && (torreDestino.cima()==null || mover.getTamaño()<= torreDestino.cima().getTamaño()))
		{
		torreDestino.insertaDisco(torreOrigen.quitarDisco());
		System.out.println("Dico de Torre"+Origen+"movido a Torre"+Destino);
		}
		else
		{
			System.out.println("No permitido.");
		}
	}
		
		public void imprime ()
		{
			int maximaAltura= Math.max(Math.max(TorreA.getTorre().size(), TorreB.getTorre().size()), TorreC.getTorre().size());
			
			System.out.println(maximaAltura);
			
			System.out.println("TorreA|Torre2|Torre3");
			
			for (int i=maximaAltura -1;i>=0;i--)
			{
				String discoA=DiscoRepresentacion (TorreA,i);
				String discoB=DiscoRepresentacion (TorreB,i);
				String discoC=DiscoRepresentacion (TorreC,i);
			}
		}
		
		public String DiscoRepresentacion (Torre x, int i) 
	    {
	    	if(x.getTorre().size()<i+1)
	    	{
	    		return "|";
	    	}
	    	else
	    	{
	    		return x.getTorre().get(i).toString();
	    	}
	    }
		
		public boolean fin ()
		{
			if(TorreA.getTorre().isEmpty() && TorreB.getTorre().isEmpty())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
}
