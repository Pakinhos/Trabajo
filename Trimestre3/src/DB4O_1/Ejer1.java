package DB4O_1;

public class Ejer1 {

	public static void main(String[] args) {
		
		ConexionDB4O conect=new ConexionDB4O("baseObjeto.db4o");
		
		Persona P1=new Persona ("Juan",40);
		Persona P2=new Persona ("Manuel",4);
		Persona P3=new Persona ("Paco",3);
		Persona P_Plantilla=new Persona ("Juan", 0);
		
		try {
			conect.conectar();
			/*conect.Insertar(P1);
			conect.Insertar(P2);
			conect.Insertar(P3);*/
			
			conect.consulta(P_Plantilla);
		} catch (DB4OException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally
		{
			try {
				conect.desconectar();
			} catch (DB4OException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
